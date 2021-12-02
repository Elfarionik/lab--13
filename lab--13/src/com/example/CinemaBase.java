package com.example;

import com.example.Exceptions.IllegalFilmNameException;
import com.example.Exceptions.IllegalPersonNameExeption;
import com.example.Exceptions.IllegalPersonsSurnameException;
import com.example.Exceptions.NoActorsException;

import java.util.*;

public class CinemaBase {
    public Set<Actor> getAllActors() {
        return Set.copyOf(allActors);
    }

    public Set<Film> getAllFilms() {
        return Set.copyOf(allFilms);
    }


    public void addActor(Actor a) {

        allActors.add(a);

    }

    public void addActors(Collection<Actor> as) {

        allActors.addAll(as);

    }

    public void addFilm(Film f) {
        allFilms.add(f);
    }

    public void addFilms(Collection<Film> fs) {
        allFilms.addAll(fs);
    }

    public void removeActor(Actor a){allActors.remove(a);}
    public void removeFilm(Film f){allFilms.remove(f);}
    private final Set<Film> allFilms = new HashSet<>();
    private final Set<Actor> allActors = new HashSet<>();
    private final HashMap<Film, Integer> rating = new HashMap<>();

    public void setFilmRating(Film f, int r){
        rating.put(f, r);
    }
    public Integer getFilmRating(Film f){
        return rating.get(f);

    }
    public Map<Film, Integer> getRating(){
        return Map.copyOf(rating);

    }

    public CinemaBase(Collection<Film> allFilms, Collection<Actor> allActors) {
        this.allFilms.addAll(allFilms);
        this.allActors.addAll(allActors);
    }






    @Override

    public String toString() {
        return "CinemaBase{" +
                "allFilms=" + allFilms +
                ", allActors=" + allActors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CinemaBase that)) return false;
        return Objects.equals(allFilms, that.allFilms) && Objects.equals(allActors, that.allActors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allFilms, allActors);
    }
}
