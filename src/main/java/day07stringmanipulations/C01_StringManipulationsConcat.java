package day07stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulationsConcat {

    public static void main(String[] args) {


        System.out.println(15+20+ "Merhaba");//35Merhaba
        System.out.println("Merhaba"+15+20);//Merhaba1520
        System.out.println("Merhaba"+ (15+20));//Merhaba35
        System.out.println("Merhaba"+15*20);//Merhaba300

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soy isminizi giriniz.");
        String isim = input.nextLine().toUpperCase(), soyIsim = input.nextLine().toUpperCase();

        System.out.println(isim.concat(" " +soyIsim));















































    }
}
