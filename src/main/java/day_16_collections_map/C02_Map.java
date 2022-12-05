package day_16_collections_map;

import java.util.HashMap;

public class C02_Map {

    //  Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
    // input : {"Ahmet", "Alev", "Gulay"};  {"Yilmaz", "Erdem", "Kaleli"};
    // output : {Ahmet=Yilmaz, Alev =Erdem, Gulay=Kaleli};

    public static void main(String[] args) {

        String ad[] = {"Ahmet", "Alev", "Gulay"};
        String soyAd[] = {"Yilmaz", "Erdem", "Kaleli"};

        HashMap<String,String> adSoyAd = new HashMap<>();

        for (int i = 0; i <ad.length ; i++) {
            adSoyAd.put(ad[i],soyAd[i]);
        }
        System.out.println("Ad Soyad : " + adSoyAd);


    }// main


}//class
