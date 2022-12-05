package day09_nestedforloop;

import java.util.Scanner;

public class C0_OdevSorusu {
    public static void main(String[] args) {

//                1 2 3 4 5 6
//                 2 3 4 5 6
//                  3 4 5 6
//                   4 5 6
//                    5 6
//                     6


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir degerini giriniz");
        int satir = input.nextInt();


        for (int i = 1; i <satir ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <satir ; k++) {
                System.out.print(k +" ");

            }
            System.out.println();

        }










































    }
}
