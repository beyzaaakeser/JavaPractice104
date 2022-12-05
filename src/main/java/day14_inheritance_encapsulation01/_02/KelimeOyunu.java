package day14_inheritance_encapsulation01._02;

import java.util.Scanner;

public class KelimeOyunu {

    static int oyuncu=1;
    static int puan1=0;
    static int puan2=0;
    static String kelime ="";
    static String ekleme="";

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(oyuncu+".Oyuncu bir kelime giriniz "); 
        kelime=input.next();// oyuncunun verdigi kelimeyi class levelda hiclik olarak atamistik
        oyuncuDegistir(); // oyuncu degistirme methodu
        onaySor();
        


    }//main

    public static void onaySor() {
        System.out.println("Girilen kelime "+kelime);
        System.out.println(oyuncu+".oyuncu girilen kelimeyi kabul ediyor musunuz? \n 1: Evet \n 0: Hayir");

        int kabul=input.nextInt();
        if (kabul==1){ // 1 tercihi girilen kelimeyi kabul ettigini gosterir.

            if (oyuncu==1){ // islemi yapan oyuncu 1. oyuncu ise
                puan2+=kelime.length();
            }else{
                puan1+=kelime.length();
                oyunaDevamEdecekMi();
            }


        }else oyunuBitir(); // girilen kelimeyi kabul etmiyor

    }

    private static void oyunuBitir() {
        System.out.println("Oyunu "+oyuncu+". kazandi");
    }

    private static void oyunaDevamEdecekMi() {

        System.out.println("Oyuna devam etmek istiyor musunuz? 1: Evet  0: Hayir");
        int tercih = input.nextInt();

        if (tercih==1){ // 1 ise devam
            kelimeEkle();
        }else {

            System.out.println("Oyun Bitti");
            System.out.println("1.oyuncunun puani "+puan1);
            System.out.println("2.oyuncunun puani "+puan2);

            if (puan1>puan2){
                System.out.println("Kazanan 1.Oyuncu" );
            } else if (puan2>puan1) {
                System.out.println("Kazanan 2.Oyunuc");
            } else {
                System.out.println("Oyun Berabere");
            }

        }
    }

    private static void kelimeEkle() {

        System.out.println("Eski kelimeye eklenecek str giriniz");
        ekleme=input.next();
        System.out.println("Yeni str'i basa mi sona mi ekleyelim ? \n 1: basa ekle  0: sona ekle");

        int tercih= input.nextInt();

        if (tercih==1){
            kelime = ekleme+kelime;
        }else kelime=kelime+ekleme;
        oyuncuDegistir();
        onaySor();

    }

    public static void oyuncuDegistir() {

        if (oyuncu==1){
            oyuncu=2;
        }else {
            oyuncu=1;
        }


    }


}//class
