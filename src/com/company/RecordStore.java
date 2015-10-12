package com.company;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.*;

public class RecordStore {

    static ArrayList<CD> cdInventory;
    static ArrayList<LP> lpInventory;

    public static void main(String[] args) {

        //Create some example LPs and CDs and add them to an inventory list
        cdInventory = new ArrayList<CD>();

        CD testCD1 = new CD("Lady Gaga", "The Fame Monster", 6.99);
        CD testCD2 = new CD("Bob Dylan", "Basement Tapes", 9.99);

        cdInventory.add(testCD1);
        cdInventory.add(testCD2);

        lpInventory = new ArrayList<LP>();

        LP testLP1 = new LP("Michael Jackson", "Thriller", 4, 9.99);
        LP testLP2 = new LP("Replacements", "Hootenanny", 3, 7.99);

        lpInventory.add(testLP1);
        lpInventory.add(testLP2);

        System.out.println("All LPs in the inventory:");
        for (LP lp : lpInventory) {
            System.out.println(lp);
        }

        System.out.println("All CDs in the inventory");
        for (CD cd : cdInventory) {
            System.out.println(cd);
        }

        searchForAlbum();
    }

    private static void searchForAlbum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name or title to search for");
        String searchString = scanner.next();
        searchString = searchString.toLowerCase();  //Work in lowercase

        ArrayList<Album> everythingInTheStore = new ArrayList<Album>();
        //Put all of the Albums (CDs, and LPs) into this ArrayList
        everythingInTheStore.addAll(cdInventory);
        everythingInTheStore.addAll(lpInventory);

        for (Album a : everythingInTheStore) {
            if (a.getTitle().toLowerCase().contains(searchString) || a.getArtist().toLowerCase().contains(searchString)) {
                System.out.println(a);
                //Equivalent to
                System.out.println(a.toString());
            }
        }

        //todo

        //System.out.println("Album not found");

    }

}

