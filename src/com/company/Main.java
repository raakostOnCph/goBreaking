package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Kilde dr = new Kilde("dr.dk");
        Kilde politekken = new Kilde("Politikken");

        Person peter = new Person("Peter");
        Person charlotte = new Person("Charlotte");
        Person daniel = new Person("Daniel");
        Person nikolaj = new Person("Nikolaj");

         peter.abonner(politekken);
         peter.abonner(dr);
         charlotte.abonner(dr);
         daniel.abonner(dr);

       //  dr.udskrivAbonnenter();

        dr.goBreaking("mand bidder hund");

        daniel.abonner(politekken);

        politekken.goBreaking("Hunden har godt efter omstændighedderne");


        peter.udskrivKilder();

        peter.fjernKide(dr);
        peter.abonner(politekken);

        charlotte.abonner(politekken);

        peter.udskrivKilder();

        dr.goBreaking("det bliver en hot sommer ");

        peter.følgerOgså(politekken);

        System.out.println(politekken.getAntalFølgere());

    }
}
