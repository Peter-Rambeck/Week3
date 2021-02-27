/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;
import dtos.MovieDTO;
import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class PopulatorMovie {
    public static void populate(){
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        FacadeMovie fm = FacadeMovie.getFacadeMovie(emf);
        fm.create(new MovieDTO(2020, "Great Show", new String[] {"Arnoldo", "Kagedej"} ));
        fm.create(new MovieDTO(2020, "Sheriffen mangler småpenge", new String[] {"Jørgen", "Ryg"} ));
        fm.create(new MovieDTO(2020, "Load of bullocks", new String[] {"Gunnar", "Nu"} ));
        
    }
    
    public static void main(String[] args) {
        populate();
    }
}
