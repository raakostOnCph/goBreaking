package com.company;

import java.util.ArrayList;
import java.util.List;

public class Kilde
{
    String udgiver;
    List<Person> personList = new ArrayList<>();

    public Kilde(String udgiver)
    {
        this.udgiver = udgiver;
    }


    public void tilknyt(Person person)
    {
        personList.add(person);

    }

    public void udskrivAbonnenter() {

        for (Person person : personList) {

            System.out.println(person.navn);

        }

    }

    public void goBreaking(String besked){

        for (Person person : personList) {

            person.hentOgVisNyhed(besked + " fra " + udgiver );

        }

    }
}
