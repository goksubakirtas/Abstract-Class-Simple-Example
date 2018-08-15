package com.company;

public class Mutfak extends AbstractOda {

    String mutfakDolabi;
    String mutfakTezgahi;
    Boolean lavabo;

    public Mutfak(int pencere, int lamba, int priz, String zeminKaplamasi, String duvarRengi, String mutfakDolabi, String mutfakTezgahi, Boolean lavabo) {
        super(pencere, lamba, priz, zeminKaplamasi, duvarRengi);
        this.mutfakDolabi = mutfakDolabi;
        this.mutfakTezgahi = mutfakTezgahi;
        this.lavabo = lavabo;
    }

    @Override
    public String toString() {
        return "\nMutfak->" +
                "\nMutfak Dolabı = " + mutfakDolabi +
                ",\nMutfakTezgahı = " + mutfakTezgahi +
                ",\nLavabo = " + lavabo +
                ",\nPencere = " + pencere +
                ",\nLamba = " + lamba +
                ",\nPriz = " + priz +
                ",\nZemin Kaplaması = " + zeminKaplamasi +
                "\nDuvar Rengi = " + duvarRengi ;
    }
}
