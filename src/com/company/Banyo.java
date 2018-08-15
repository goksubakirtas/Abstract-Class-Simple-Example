package com.company;

public class Banyo extends AbstractOda {
    private Boolean kuvet=true;
    private Boolean lavabo =true;
    private Boolean klozet=true;

    public Banyo() {
        super();

    }

    public Banyo(int pencere, int lamba, int priz, String zeminKaplamasi, String duvarRengi, Boolean kuvet, Boolean lavabo, Boolean klozet) {
        super(pencere, lamba, priz, zeminKaplamasi, duvarRengi);
        this.kuvet = kuvet;
        this.lavabo = lavabo;
        this.klozet = klozet;
    }

    public Boolean getKuvet() {
        return kuvet;
    }

    public void setKuvet(Boolean kuvet) {
        this.kuvet = kuvet;
    }

    public Boolean getLavabo() {
        return lavabo;
    }

    public void setLavabo(Boolean lavabo) {
        this.lavabo = lavabo;
    }

    public Boolean getKlozet() {
        return klozet;
    }

    public void setKlozet(Boolean klozet) {
        this.klozet = klozet;
    }

    @Override
    public String toString() {
        return "\nBanyo->" +
                "\nKüvet = " + kuvet +
                ",\nLavoba = " + lavabo +
                ",\nKlozet = " + klozet +
                ",\nPencere = " + pencere +
                ",\nLamba = " + lamba +
                ",\nPriz = " + priz +
                ",\nZemin Kaplaması = " + zeminKaplamasi +
                ",\nDuvar Rengi = " + duvarRengi ;
    }
}