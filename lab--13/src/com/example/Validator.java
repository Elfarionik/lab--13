package com.example;

import com.example.Exceptions.IllegalFilmNameException;
import com.example.Exceptions.IllegalPersonNameExeption;
import com.example.Exceptions.IllegalPersonsSurnameException;
import com.example.Exceptions.NoActorsException;

public class Validator {

    public static void actorsNameValidator(Actor a) throws IllegalPersonNameExeption {
        if(a.getName().isBlank() || a.getName().matches("[^\\w]*")) throw new IllegalPersonNameExeption("Wrong name " + a);
        if(a.getName() == null) throw new NullPointerException();
    }
    public static void actorsSurnameValidator(Actor a) throws IllegalPersonsSurnameException {
        if(a.getSurname().isBlank() || a.getSurname().matches("[^\\w]*")) throw new IllegalPersonsSurnameException("Wrong Surname "+ a);
        if(a.getSurname() == null) throw new NullPointerException();
    }
    public static void filmNameValidator(Film f) throws IllegalFilmNameException {
        if(f.getName().isBlank() || f.getName().matches("[^\\w]*")) throw new IllegalFilmNameException("Wrong Film Name " + f);
        if(f.getName() == null) throw new NullPointerException();
    }

}
