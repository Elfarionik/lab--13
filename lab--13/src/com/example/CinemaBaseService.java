package com.example;

import com.example.Exceptions.IllegalFilmNameException;
import com.example.Exceptions.IllegalPersonNameExeption;
import com.example.Exceptions.IllegalPersonsSurnameException;
import com.example.Exceptions.NoActorsException;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CinemaBaseService {
    public static Set<Actor> isJobless(CinemaBase b) throws NoActorsException, IllegalFilmNameException, IllegalPersonsSurnameException, IllegalPersonNameExeption {

        Set<Actor> jobless = new HashSet<>();
        for (Actor a : b.getAllActors()) {
            Validator.actorsSurnameValidator(a);
            Validator.actorsNameValidator(a);
            boolean inFilm = false;
            for (Film f : b.getAllFilms()) {
                Validator.filmNameValidator(f);
                if (f.hasAnActor(a)) {
                    inFilm = true;
                    break;
                }
            }
            if (!inFilm) jobless.add(a);
        }
        return jobless;
    }
    public static Set<Actor> playedTogether(Actor ac, CinemaBase b) throws IllegalPersonsSurnameException, IllegalPersonNameExeption, NoActorsException, IllegalFilmNameException {
        Validator.actorsNameValidator(ac);
        Validator.actorsNameValidator(ac);
        Set<Actor> result = new HashSet<>();
        for (Iterator filmsIter = b.getAllFilms().iterator(); filmsIter.hasNext(); ) {
            Film someFilm = (Film) filmsIter.next();

            Validator.filmNameValidator(someFilm);
            result.addAll(FilmService.findActors(someFilm, ac));
        }
        return result;
    }


    public static Film mostActored(CinemaBase b) throws NoActorsException, IllegalFilmNameException {
        Film result = new Film("");
        for(Iterator<Film> filmIterator = b.getAllFilms().iterator(); filmIterator.hasNext();){
            Film someFilm = filmIterator.next();
            Validator.filmNameValidator(someFilm);
            if (FilmService.compareNumberOfActors(someFilm, result)) result = someFilm;
        }
        return result;

    }
    public static double avergeRating(CinemaBase b){
        int sum = 0;
        for(Film f: b.getRating().keySet()){
            sum+=b.getRating().get(f);
        }
        return (double) sum/b.getRating().size();
    }
    public static Film getMostRated(CinemaBase b) throws IllegalFilmNameException, NoActorsException {
        Film max = new Film("");
        for(Film f: b.getRating().keySet()){
            Validator.filmNameValidator(f);
            if(b.getRating().get(max) == null || b.getRating().get(max) < b.getRating().get(f)) max = f;
        }
        return max;
    }

}
