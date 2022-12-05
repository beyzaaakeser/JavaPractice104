package day03_ifstatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {

    //ascii == amerikan standart kodlama degerleri

        char harf = 'a';
        char harf2 = 'A';

        System.out.println("harf>harf2 ==> "+ ( harf>harf2));// true karsilastirma islemlerinin sonucu boolean true ya da false doner. buyuk harflerin ascii degerleri kucuk harflerinkinden daha kucuktur.

        // Example : herhangi bir char variablein ascii degerlerini kod yazarak bulunuz.
        // 2 yolu var

        // 1.Yol : 0 ile toplamak
        System.out.println('!'+0);

        char space = ' ';
        System.out.println("Space'in ASCII degeri : " + (space+0)); // 32 Space'in ascii degerini hesaplamak icin toplamaya etkisi olmayan '0' seceriz. boylece yazdigimiz deger bize space'in ASCII degerini verir.

        char m= 'm';
        System.out.println("m'nin ASCII degeri :"+ (m+0));

        // 2.Yol : 
        int harf3 ='m';
        System.out.println("m'nin ASCII degeri = " + harf3);
        // charlarda java karakterlere int de atayabiliyoruz cunku charin bir resim karaktereri bi de matematiksel degeri var yani inte uyarlanacak degeri vardir. bu yuzden inte atayabiliyoruz.

       byte b1 = 12;
       byte b2 = -125;

        System.out.println("b1>b2  ==> "+ (b1>b2));// true

        float f1 = 2.45645F;
        float f2 = 5.86786F;

        System.out.println(" f1>f2  ==> "+ (f1>f2)); // false
        System.out.println(" b1>f2  ==> "+ (b1>f1)); // true

        long lng1 = 45862625625L;
        System.out.println("b1< lng1  ==> " + (b1<lng1));// true

        char ch = 'h';
        System.out.println(" b1> ch ==> "+ (b1>ch));// false



















    }
}
