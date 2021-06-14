package com.company;

public class Person
{
    String navn;
    Kilde kilde;

    public Person(String navn)
    {
        this.navn = navn;
    }

    public void abonner(Kilde kilde) {

     kilde.tilknyt(this);

    }

    public void hentOgVisNyhed(String s)
    {
        System.out.println( navn + " fik beskeden : " + s );


    }
}
