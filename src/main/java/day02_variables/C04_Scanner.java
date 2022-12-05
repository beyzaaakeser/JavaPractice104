package day02_variables;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

//
//        Scanner input = new Scanner(System.in);
//        System.out.println("4 basamakli bir sayi giriniz..");
//        int sayi = input.nextInt();
//
//        int sonBasamak= sayi/1000;
//        int ilkBasamak= sayi % 10 ;
//        System.out.println(sonBasamak + ilkBasamak);
//



// Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
//
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Uc basamakli bir sayi giriniz");
//
//        int sayi2 = scan2.nextInt();
//                // 1ler basamagindaki sayiyi bulmak icin sayimizi %10 yapabiliriz ya da 10a bolebiliriz.
//        int birler = sayi2%10;
//        System.out.println("Girdiginiz sayinin birler basamagi "+ birler);
//
//        int yeniSayi = sayi2/10;
//        System.out.println("yeniSayi = "+ yeniSayi);
//
//        //10lar basamagi
//
//        int onlar = yeniSayi%10;
//        System.out.println("Girdiginiz sayinin onlar basamagi "+ onlar);
//
//        int yuzler = sayi2/=10;
//        System.out.println("Girdiginiz sayinin yuzler basamagi "+ yuzler);
//
//


//        Scanner scan = new Scanner(System.in);
//        System.out.println("3 basamakli bir sayi giriniz");
//        int sayi = scan.nextInt();
//// 1) 1 ler basamagindaki sayiyi bulun
//        int birler = sayi % 10;
//        System.out.println("girdiginiz sayinin birler basamagi " + birler);
//        sayi /= 10;
//// 2) 10 lar basamagindaki sayiyi bulun
//        int onlar = sayi % 10;
//        System.out.println("girdiginiz sayinin onlar basamagi " + onlar);
//// 3) 100 ler basamagindaki sayiyi bulun
//        int yuzler = sayi /= 10;
//        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);
//
//

// kullaniciodan 5 basamakli sayi iste ve ilk iki rakami ile son iki rakami topla
        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz.");
        int num = input.nextInt();

        int ilkIkirkm = num/1000;//12 oluyor
        System.out.println("ilkIkirkm = " + ilkIkirkm);
        int ilkIkiTopl = (ilkIkirkm%10)+ (ilkIkirkm/10);
        System.out.println("ilkIkiTopl = " + ilkIkiTopl);

        int sonIkirkm = num%100;
        System.out.println("sonIkirkm = " + sonIkirkm);
        
        int sonIkiTopl= (sonIkirkm%10)+ (sonIkirkm/10);
        System.out.println("sonIkiTopl = " + sonIkiTopl);

        System.out.println(ilkIkiTopl+sonIkiTopl);





    }
}
