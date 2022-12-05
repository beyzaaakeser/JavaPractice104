package day04ifstatementt;

import java.util.Scanner;

public class C03IfStatement {
    public static void main(String[] args) {


        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun = input.next();


        //1.Yol :

        if (gun.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }else if(gun.equalsIgnoreCase("Pazartesi") &&
                 gun.equalsIgnoreCase("Sali") &&
                 gun.equalsIgnoreCase("Carsamba") &&
                 gun.equalsIgnoreCase("Persembe")) {
            System.out.println("Kutsal gun olarak tanimlanmamistir.");
        }else {
            System.out.println("Gecerli bir gun ismi giriniz.");
        }





























    }
}
