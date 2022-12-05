package day01_variables;

import java.util.Scanner;

public class C04_Java_Variables {

    public static void main(String[] args) {

// 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        byte b1 =12;
        float f1 = 15.99F;
        char c1 = 's';
        System.out.println(b1);
        System.out.println(f1);
        System.out.println(c1);



        String isim = "Beyza";
        String soyIsim = "KESER";
        System.out.println("Isminiz : "+ isim);
        System.out.println( " SOyisminiz : "+ soyIsim);

        byte b2 = 13;
        short s1 = 25;

        System.out.println(b2+s1);


        int i1 = 33;
        double d1 = 4.5;
        System.out.println(i1+d1);

        //5 – char data turunde bir variable olusturun ve yazdirin
        char sembol = '$';
        System.out.println("Sembol = " + sembol);

        System.out.println(12+'a');

        int deger5 = 20;
        char harf = 'm';

        //1.Yol

        int toplam = deger5 + harf;
        System.out.println("toplam = "+ toplam); //toplam = 129

        //2.Yol
        System.out.println(deger5+ harf);//129

        //3.yol
        int sayi7 = 0;
        char harf2 = 's';

        System.out.println(sayi7+harf2);


        // Initializing Variable  (variable baslangic degeri verme)
        int age =32;

        //  Soru-1 :   konsola      "Hello ", "World  \ //"        seklinde yazdiriniz

        String hello = "Hello World";
        System.out.println("hello = "+ hello);

        //Kullanicidan ad, soyad, memleket, konum, yas, boy, kilo, javayi sevdiniz mi bilgilerinizi aliniz

        Scanner bilgi = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad = bilgi.nextLine();

        System.out.println("Soyadinizi giriniz");
        String soyad = bilgi.nextLine();

        System.out.println("memleketinizi giriniz");
        String memleket = bilgi.nextLine();
        System.out.println("Konumunuzu giriniz");
        String konum = bilgi.nextLine();

        System.out.println("yasinizi giriniz");
        byte yas = bilgi.nextByte();

        System.out.println("boyunuzu giriniz");
        double boy = bilgi.nextDouble();

        System.out.println("Kilonuzu giriniz");
        double kilo = bilgi.nextDouble();


        System.out.println("Javayi sevdiniz mi");
        boolean seviyorum = bilgi.hasNextBoolean();







    }


























}
