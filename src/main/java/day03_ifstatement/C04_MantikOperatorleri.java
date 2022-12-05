package day03_ifstatement;

public class C04_MantikOperatorleri {
    public static void main(String[] args) {

    // && ile & arasindaki fark
    // && de boolean sonuc 3te bir tane false bulunca durur ve tum satriri kontrol etmeye calismaz
        // Ancak & tum sartiri kontrol eder ondan sonra durur.
        // sonucrta fark yok sadece biri ilk hatayi bulduysa durur digeri sonuna kadar gider &7 tekliye gore dah ahizli ccalisir

        System.out.println(5+2 == 8);// false

    boolean sonuc1 = 5>4 && 7<9 && 6+3 ==9 && 5+2!=8;
        System.out.println("sonuc1 ==> " +sonuc1);// true

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc2 = "+ sonuc2);// false

        int sayi1 = 15;
        System.out.println(sayi1>10 && sayi1<20);// true

        int sayi2 = 5;
        System.out.println(sayi2<10 || sayi2>20);// true
        System.out.println(sayi2<10 || sayi2<20);// true

















    }
}
