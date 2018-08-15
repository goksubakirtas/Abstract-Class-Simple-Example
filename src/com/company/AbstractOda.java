package com.company;

public abstract class AbstractOda {
    public int pencere;
    public int lamba;
    public int priz;
    public  String zeminKaplamasi;
    public String duvarRengi;

    public AbstractOda() {
        pencere=0;
        lamba=0;
        priz=0;
        zeminKaplamasi="Parke";
        duvarRengi="Beyaz";

    }

    public AbstractOda(int pencere, int lamba, int priz, String zeminKaplamasi, String duvarRengi) {
        this.pencere = pencere;
        this.lamba = lamba;
        this.priz = priz;
        this.zeminKaplamasi = zeminKaplamasi;
        this.duvarRengi = duvarRengi;
    }


}
