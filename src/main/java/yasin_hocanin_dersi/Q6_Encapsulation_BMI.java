package yasin_hocanin_dersi;

import java.util.Scanner;

public class Q6_Encapsulation_BMI {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu KG cinsinden giriniz");
        double kilo = input.nextDouble();
        System.out.println("Boyunuzu Metre cinsinden giriniz");
        double boy = input.nextDouble();


        BMI kisi1 = new BMI(kilo,boy);
        kisi1.BMIHesapla();


    }//main








}//class
