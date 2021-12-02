package com.example;

import com.example.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Actor actor1 = new Actor("James", "Jhons");
        Actor actor2 = new Actor("Hoakin", "Phelix");
        Actor actor3 = new Actor("Duane", "Jhonson");
        Actor actor4 = new Actor("Shauka", "Asdasd");
        Actor actor5 = new Actor("Huhusha", "RealSurname");
        Actor actor6 = new Actor("Sss","Sur1");
        Actor actor7 = new Actor("%@", "Tur1");

        Film film1 = new Film("Avengers", Set.of(actor4, actor3, actor1));
        Film film2 = new Film("Joker", Set.of(actor5, actor3, actor4, actor1));
        Film film3 = new Film("Dune");
        Film film4 = new Film("%$#($#)$#", Set.of(actor1, actor3));

        CinemaBase base = new CinemaBase(Set.of(film1, film2, film3), List.of(actor1, actor2, actor3, actor4, actor5, actor6, actor7));

        try{
            System.out.println(CinemaBaseService.isJobless(base));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        base.removeActor(actor7);
        try{
            System.out.println(CinemaBaseService.isJobless(base));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
