package com.zsuzsa;

import java.util.ArrayList;
import java.util.List;

public class Hash {

    private static List<Person> persons = populatePersons();

    public static void main(String[] args) {


    }

    private int myHash(Person person) {
        return 0;
    }

    private static List<Person> populatePersons() {
        List<Person> persons = new ArrayList<>();
        Person person = new Person("Zsuzsa", "iii");
        persons.add(person);
       /* persons.add(new Person("Bakondi Dóra", "DRX8T5"));
        persons.add(new Person("Bod Márton", "G1OQDC"));
        persons.add(new Person("Czakó Péter", "IWGFJA"));
        persons.add(new Person("Czakó Tamás", "DC7YDT"));
        persons.add(new Person("Cseh Krisztina Andrea", "E04X5S"));
        persons.add(new Person("Csépány György", "GX8YAK"));
        persons.add(new Person("Ferencz Gyöngyvér", "BTMCS4"));
        persons.add(new Person("Magyar Bálint", "S79XSY"));
        persons.add(new Person("Makovics Richárd", "H2ADRH"));
        persons.add(new Person("Molnár Bálint", "WCWAR1"));
        persons.add(new Person("Pethő Zsuzsanna", "IXHBWF"));
        persons.add(new Person("Strenner Péter", "OOBIXC"));
        persons.add(new Person("Szarvas Zoltán", "FGSKS8"));
        persons.add(new Person("Szita Katalin", "IOYF2T"));
        persons.add(new Person("Szűcs Rózsa", "DZKH9Q"));*/
        return persons;
    }
}
