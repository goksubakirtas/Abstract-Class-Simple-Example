package com.company;

public  class Daire {
    Mutfak mutfak=new Mutfak(1,1,2,"Mozaik", "Sarı","Ahşap","Granit",true);

    Banyo banyo=new Banyo(1,1,2,"Yeşil Garanit","Sarı",true,true,true);

    Oda ebeveynOda=new Oda(true,false,2,1,2,"Laminat","Beyaz");

    Oda cocukOdasi=new Oda(false,false,2,1,2,"Laminat","Kırmızı");

    Oda salon=new Oda(false,true,2,1,2,"Laminat","Krem");



}
