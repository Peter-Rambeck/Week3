/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Movie;
import facades.FacadeMovie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tha
 */
public class MovieDTO {
    private long id;
    private int year;
    private String title;
    private String[] actors;

    public MovieDTO(int year, String title, String[] actors) {
        this.year = year;
        this.title = title;
        this.actors = actors;
    }
    
     public MovieDTO(Movie m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.year = m.getYear();
        this.actors = m.getActors();
    }
    
    

   
    public static List<MovieDTO> getDtos(List<Movie> ms){
        List<MovieDTO> mdtos = new ArrayList();
        ms.forEach(m->mdtos.add(new MovieDTO(m)));
        System.out.println(mdtos);
        return mdtos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "MovieDTO{" + "id=" + id + ", year=" + year + ", title=" + title + ", actors=" + actors + '}';
    }
    
    
    
    
    
    
    
    
    
}
