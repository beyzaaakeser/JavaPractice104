package day04ifstatementt;

import java.util.Scanner;

public class C02IfStatement {
    public static void main(String[] args) {

         /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        int not = input.nextInt();

        if (not>=90 && not<=100){
            System.out.println("A  Cok Iyi");
        } else if (not>=80 && not<=89) {
            System.out.println("B  Iyi");
        } else if (not>=70 && not <=79) {
            System.out.println("C  Orta");
        } else if (not>=60 && not <=69) {
            System.out.println("D  Gecer");
        } else if (not>=0 && not <=59) {
            System.out.println("F  Zayif");
        }else {
            System.out.println("Boyle bir not araligi bulunmamaktadir.");
        }


    }
}
