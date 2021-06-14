package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person
{
    String navn;
    Kilde kilde;

    List<Kilde> kildeList = new ArrayList<>();

    public Person(String navn)
    {
        this.navn = navn;
    }

    public void abonner(Kilde kilde) {

     kilde.tilknyt(this);
     kildeList.add(kilde);

    }

    public void hentOgVisNyhed(String s)
    {
        System.out.println( navn + " fik beskeden : " + s );


    }

    public void udskrivKilder() {

        for (Kilde k : kildeList) {

            System.out.println(k.udgiver);

        }

    }

    public void fjernKide(Kilde kilde) {


        kilde.fjernAbonnent(this);
        kildeList.remove(kilde);

    }

    public void følgerOgså(Kilde kilde) {

        if ( ! kildeList.contains(kilde)) {
            System.out.println("den kilde følger du ikke , så du har adgang");
        }
        else {
            // kilde.udskrivAbonnenter(); her kalder jeg bare udskriv på kilden, så jeg henter den ikke rigtigt ned
            String res = navn + " du læser " + kilde.udgiver + " sammen med : " + kilde.udskrivAbonnenter(this);
            System.out.println(res);
        }


    }
}
