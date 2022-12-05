package day_15_exceptionsabstraction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02TryCatch {

    /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
        Kullaniciya index sorup, o indexdeki urunu yazdiran bir program yaziniz.
        (Kullanici marketteki urun sayisindan fazla sayida bir index girerse exeption vermesinin onune gecelim)
        public static void main(String[] args)
    */


    public static void main(String[] args) {

        String []urunler = {"Et","Sut","Findik","Fistik"};

        Scanner input;
        boolean flag = true;

        int index = 0;

        while (flag) {

            try {
                input = new Scanner(System.in);
                System.out.println("Istediginiz urunun sira numarasini giriniz.");
                index = input.nextInt();
                flag = false;
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }


        try {
            System.out.println(urunler[index]); // dukkanda olmayan buyuk bir sayi girdiyse
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz deger 0 ile 3 arasinda olmali");
        }


    }//main




}//class






