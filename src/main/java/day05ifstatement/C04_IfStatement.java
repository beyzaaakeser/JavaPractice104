package day05ifstatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {


        //Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cinsiyet = input.next().toLowerCase();
        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        if (cinsiyet.equals("kadin")){
            if (yas>=60){
                System.out.println("Emekli olabilirsiniz");
            } else if (yas<60) {
                System.out.println("Emekli olamazsiniz");
            }
        }
        if (cinsiyet.equals("erkek")){
            if (yas>=65){
                System.out.println("Emekli olabilirsiniz");
            } else if (yas<65) {
                System.out.println("Emekli olamazsiniz");
            }
        }
































    }
}
