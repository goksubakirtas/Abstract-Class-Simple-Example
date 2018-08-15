package com.company;

public class Oda extends  AbstractOda {
    private Banyo banyo;
    private Balkon balkon;
    private boolean isEbeveynOda=false;
    private boolean isSalon=false;

    public Oda() {
        super();
    }


    public Oda(boolean isEbeveynOda,boolean isSalon,int pencere, int lamba, int priz, String zeminKaplamasi, String duvarRengi) {
        super(pencere, lamba, priz, zeminKaplamasi, duvarRengi);
        setEbeveynOda(isEbeveynOda);
        setSalon(isSalon);
    }
    public Banyo getBanyo() {
        return banyo;
    }

    public void setBanyo(Banyo banyo) {
        this.banyo = banyo;
    }

    public Balkon getBalkon() {
        return balkon;
    }

    public void setBalkon(Balkon balkon) {
        this.balkon = balkon;
    }

    public boolean isEbeveynOda() {
        return isEbeveynOda;
    }

    public void setEbeveynOda(boolean ebeveynOda) {
        if(ebeveynOda){
            banyo=new Banyo();
        }
        isEbeveynOda = ebeveynOda;
    }
    public boolean isSalon() {

        return isSalon;
    }

    public void setSalon(boolean salon) {
        if(salon){
            balkon=new Balkon();
        }
        isSalon = salon;
    }

    @Override
    public String toString() {
        return "\nOda->" +
                "\nSalonOda = "+isSalon+ balkon+
                "\nisEbeveyn Oda =" + isEbeveynOda +banyo+
                ",\nPencere=" + pencere +
                ",\nLamba=" + lamba +
                ",\nPriz=" + priz +
                ",\nzemin Kaplamasi='" + zeminKaplamasi +
                ",\nDuvar Rengi='" + duvarRengi ;
    }
}
