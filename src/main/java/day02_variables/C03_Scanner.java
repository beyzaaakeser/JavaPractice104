package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in); //alt entera basarak import edebiliriz
//        System.out.println("Lutfen isminizi giriniz.");
//        String kullaniciIsmi = input.next();
//
//        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
//        //( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )
//        Scanner cember = new Scanner(System.in);
//        System.out.println("Lutfen cemberin yaricapini giriniz");
//        double r = cember.nextDouble();
//        System.out.println("Cemberin cevresi " + 2*3.14*r);
//        System.out.println("Cemberin alani " + 3.14*r*r);

//        Scanner dikdortgen = new Scanner(System.in);
//        System.out.println("Lutfen dikdortgenin uzun ve kisa kenarini giriniz.");
//        double kisaKenar = dikdortgen.nextDouble();
//        double uzunKenar = dikdortgen.nextDouble();
//
//        System.out.println("Alan = " + kisaKenar*uzunKenar);
//        System.out.println("Cevre = "  + 2*(kisaKenar+uzunKenar));
//
//            Scanner ucgen = new Scanner(System.in);
//        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
//        byte k1 = ucgen.nextByte();
//        byte k2  = ucgen.nextByte();
//        byte k3 = ucgen.nextByte();
//
//        System.out.println(k1+k2+k3);
//
//

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

/*
             A
            A A
           A A A
    */



        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir isaret giriniz: ");

        String ch = input.next();

        System.out.println("   "+ch +"\n" +" "+ch  +"   "+ch + "\n"+ch+"  "+ch +"  " +ch);

























    }
}
