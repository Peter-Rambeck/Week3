/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;
import dtos.MovieDTO;
import entities.Movie;
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
        fm.create(new MovieDTO(new Movie(2020, "Great Show", new String[] {"Arnoldo", "Kagedej"} )));
        fm.create(new MovieDTO(new Movie(2020, "Great Show", new String[] {"Arnoldo", "Kagedej"} )));
        
    }
    
    public static void main(String[] args) {
        populate();
    }
}
