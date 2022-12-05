package day05ifstatement;

import java.util.Scanner;

public class C07_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin
        //ve dikdortgenin kare olup  olmadigini yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen birini kenar uzunlugunu giriniz");
        int k1 = input.nextInt();
        System.out.println("Lutfen ikinci kenar uzunlugunuu girinniz");
        int k2 = input.nextInt();
        System.out.println("Lutfen ikinci kenar uzunlugunuu girinniz");
        int k3 = input.nextInt();
        System.out.println("Lutfen ikinci kenar uzunlugunuu girinniz");
        int k4 = input.nextInt();
        System.out.println("Lutfen ikinci kenar uzunlugunuu girinniz");


        boolean a =(k1+k2+k3+k4)/4 == k2;

        if (a){
            System.out.println("Kare");
        }else System.out.println("Kare degil");






































    }
}
