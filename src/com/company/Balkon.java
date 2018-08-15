package com.company;

public class Balkon{
    private  boolean barbeku=true;


    public Balkon() {
    }

    public boolean isBarbeku() {
        return barbeku;
    }

    public void setBarbeku(boolean barbeku) {
        this.barbeku = barbeku;
    }

    @Override
    public String toString() {
        return "\nBalkon->" +
                "\nbarbeku = " + barbeku ;
    }
}
