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
        if (! personList.contains(person)) {

        personList.add(person);
        }

    }

    public String udskrivAbonnenter() {

        String abonnenterString= "";

        for (Person person : personList) {

            System.out.println(person.navn);

            abonnenterString = abonnenterString +" " + person.navn;

        }

        return abonnenterString;
    }



    public String udskrivAbonnenter(Person kunde) {    //overload ens metoder med forskellige parametre

        String abonnenterString= "";

        for (Person person : personList) {

            if (!person.equals(kunde) ) {
                System.out.println(person.navn);

                abonnenterString = abonnenterString + " " + person.navn;
            }
        }

        return abonnenterString;
    }




    public void goBreaking(String besked){

        for (Person person : personList) {

            person.hentOgVisNyhed(besked + " fra " + udgiver );

        }

    }

    public void fjernAbonnent(Person person)
    {
        personList.remove(person);

    }

    public int getAntalFølgere() {

        return personList.size();
    }
}
