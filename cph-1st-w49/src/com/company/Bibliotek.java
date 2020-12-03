package com.company;

import java.util.ArrayList;

public class Bibliotek {
    public static ArrayList<Bog> bibliotek = new ArrayList<>();

    public static boolean tjekBibliotek(Bog bog){
        for (Bog b : bibliotek) {
            if (b.getISBN() == bog.getISBN()){
                return true;
            }
        }
        return false;
    }
}
