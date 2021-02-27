package facades;

import dtos.MovieDTO;
import entities.Movie;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import utils.EMF_Creator;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class FacadeMovie {

    private static FacadeMovie instance;
    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton
    private FacadeMovie() {}
    
   
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    
    public static FacadeMovie getFacadeMovie(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new FacadeMovie();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public MovieDTO create(MovieDTO m){
        Movie mv = new Movie(m.getYear(), m.getTitle(), m.getActors());
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(mv);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return new MovieDTO(mv);
    }
    
    public MovieDTO getById(long id){
        EntityManager em = emf.createEntityManager();
        return new MovieDTO(em.find(Movie.class, id));
    }
    
    //TODO Remove/Change this before use
    public long getMovieCount(){
        EntityManager em = emf.createEntityManager();
        try{
            long movieCount = (long)em.createQuery("SELECT COUNT(r) FROM Movie r").getSingleResult();
            return movieCount;
        }finally{  
            em.close();
        }
        
    }

    public List<MovieDTO> getAll(){
        EntityManager em = emf.createEntityManager();
        TypedQuery<Movie> query = em.createQuery("SELECT r FROM Movie r", Movie.class);
        List<Movie> ms = query.getResultList();
        return MovieDTO.getDtos(ms);
    }
    
    public MovieDTO getByName(String name){
        EntityManager em = emf.createEntityManager();
        Movie m;
        try {
            TypedQuery<Movie> query = em.createQuery("SELECT m FROM Movie m WHERE m.title=:title", Movie.class);
            query.setParameter("title", name);
            m=query.getSingleResult();
        } finally {
            em.close();
        }
        return new MovieDTO(m);
    }
    
    
    public static void main(String[] args) {
        emf = EMF_Creator.createEntityManagerFactory();
        FacadeMovie fm = getFacadeMovie(emf);
        fm.getAll().forEach(dto->System.out.println(dto));
        System.out.println(fm.getMovieCount());
    }

}
