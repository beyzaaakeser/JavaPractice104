package day05ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {



        // Kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = input.nextInt();


        // 1.Yol :
//        if (yas>= 65){
//            System.out.println("Emekli olabilirsiniz");
//        } else{
//            System.out.println("Emekli olamazsiniz");
//            System.out.println(65-yas + " Sene daha calismalisiniz");
//        }




        // 2.yol : nested if else

        if(yas>0){

            if (yas>=65){
                System.out.println("Emekli olabiilirsiniz.");
            }else{
                System.out.print("Emekli olamazsin "+ (65-yas) + " sene daha calismalisin");
            }

        }else {
            System.out.println("Lutfen sifirdan buyuk bir sayi giriniz.");
        }




























































    }
}
