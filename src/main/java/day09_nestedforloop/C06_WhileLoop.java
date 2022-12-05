package day09_nestedforloop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {


        /*
                                        !!! INTERVIEW SORUSU !!!
           kullanicidan toplanmak uzere sayialr isteyin. sayi adedi 10u gecerse ya da toplami 500u gecerse
           "bu kadar sayi yeter ... adet sayi girdiniz toplami ... " yazdirin
         */


        Scanner input = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;
        int sayac =0;



        while(sayac<10 && toplam < 500){

            System.out.println("Lutfen toplanmak uzere sayi giriniz.");
            sayi = input.nextInt(); // her seferinde sayilaar gozuksun diye input kismini loop icinde yazacagiz. disarida olsa 1 kere yazdirir.
            toplam += sayi;
            sayac++;

        }
        if (toplam>500){
            System.out.println(sayac+ " adet sayi girdiniz."+ "Sayilarin toplami " +toplam );
        } else System.out.println("Bu kadar sayi yeterli. "+sayac+ " adet sayi girdiniz. Sayilarin toplami "+ toplam);


































    }
}
