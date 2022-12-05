package day05ifstatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {


        /*Soru 6) Kullanicidan iki sayi isteyin,
         sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
         sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
         sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
         sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        double s1 = input.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double s2 = input.nextDouble();


        if (s1>0 && s2>0){
            System.out.println(s1+s2);
        } else if (s1<0 && s2<0) {
            System.out.println(s1*s2);
        } else if ( (s1<0 && s2>0) || (s1>0 && s2<0)) {  // DIKKAT !!  s1*s2 <0 ise demektir ki ikisinin isareti farkli demektir. parantez icine bunu yazmak kisa kod yazmak oldugu icin daha iyidir.
            System.out.println("Farkli isaretlere sahip sayilarla islem yapamazsin");
        } else {
            System.out.println("Sifir carpmaya gore yutan elemandir");
        }


    }
}
