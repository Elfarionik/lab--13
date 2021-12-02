package com.example;

import com.example.Exceptions.IllegalFilmNameException;
import com.example.Exceptions.IllegalPersonNameExeption;
import com.example.Exceptions.IllegalPersonsSurnameException;
import com.example.Exceptions.NoActorsException;

import java.util.*;

public class Film {

    public Set<Actor> getActors() {
        return Set.copyOf(actors);
    }

    public int getNumberOfActors() {
        return actors.size();
    }

    public boolean hasAnActor(Actor a) {
        return actors.contains(a);
    }

    public String getName() {
        return name;
    }

    private final String name;
    private final Set<Actor> actors = new HashSet<>();

    public Film(String name, Collection<Actor> actors) {
        this(name);
        this.actors.addAll(actors);
    }

    public Film(String name) {
        this.name = name;
    }

    public void addActor(Actor a) {
        actors.add(a);
    }

    public void addActors(Collection<Actor> as) {
        actors.addAll(as);
    }


    @Override
    public String toString() {
        return String.format("Назва фільму: \"%s\", актори: %s", name, actors);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film film)) return false;
        return Objects.equals(name, film.name) && Objects.equals(actors, film.actors);
    }

    @Override
    public int hashCode() {
        int hash = 12;
        hash = 35*hash + name.hashCode();
        hash = 35*hash + actors.hashCode();
        return hash;
    }


}
