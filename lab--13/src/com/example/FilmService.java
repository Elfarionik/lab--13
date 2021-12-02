package com.example;

import com.example.Exceptions.IllegalFilmNameException;
import com.example.Exceptions.IllegalPersonNameExeption;
import com.example.Exceptions.IllegalPersonsSurnameException;
import com.example.Exceptions.NoActorsException;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FilmService {
    public static boolean compareNumberOfActors(Film f, Film somefilm) throws IllegalFilmNameException, NoActorsException {
        Validator.filmNameValidator(somefilm);
        if(f.getNumberOfActors() > somefilm.getNumberOfActors()) return true;
        return false;
    }

    public static Set<Actor> findActors(Film f, Actor ac) throws IllegalPersonNameExeption, IllegalPersonsSurnameException {
        Validator.actorsNameValidator(ac);
        Validator.actorsSurnameValidator(ac);
        Set<Actor> result = new HashSet<>();
        if (f.hasAnActor(ac)) {
            for (Iterator actorsIterator = f.getActors().iterator(); actorsIterator.hasNext(); ) {
                Actor someActor = (Actor) actorsIterator.next();
                Validator.actorsSurnameValidator(someActor);
                Validator.actorsNameValidator(someActor);
                if (!(someActor.equals(ac))) result.add(someActor);
            }
        }
        return result;
    }
}
