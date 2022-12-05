package day06_nestedifswitch;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {


    /*
        Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
        ornek
        Kullanici  : A , B , C harflerinden birini secsin
        A'yi secmis ise, ==> Java kolay
        B'yi secmis ise, ==> Java eglenceli
        C'yi secmis ise, ==> Calismaliyim :)
   */


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen harflerden birini giriniz : \nA\tB\tC");

        char harf = input.next().toLowerCase().charAt(0);

        switch (harf){

            case 'a' :
                System.out.println("Java Kolay");
                break;
            case 'b' :
                System.out.println("Java Eglenceli");
                break;
            case 'c' :
                System.out.println("Calismaliyim :)");
                break;
            default:
                System.out.println("Gecerli bir harf giriniz");




        }






























    }
}
