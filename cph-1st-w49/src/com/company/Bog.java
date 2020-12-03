package com.company;

public class Bog {
    private int ISBN;
    private String titel;
    private int udgivelsesår;

    public Bog(int ISBN, String titel, int udgivelsesår) {
        this.ISBN = ISBN;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "ISBN=" + ISBN +
                ", titel='" + titel + '\'' +
                ", udgivelsesår=" + udgivelsesår +
                '}';
    }

}
