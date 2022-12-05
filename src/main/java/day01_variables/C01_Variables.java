package day01_variables;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class C01_Variables {

    //PROJE OLUSTURMA===>File==>New==>Project==>Next==>Name(Buraya projenin ismini yaz kucuk harfle basla javaPractice103104105)==>finish

//PACKAGE OLUSTURMA==>java dosyasina sag click==>New==>Package==>istedigin ismi yaz kucuk harfle basla( day01_variables )

//CLASS OLUSTURMA==>olusturdugun package uzerine sag click==>New==Class==> istedigin ismi yaz buyuk harfle basla ( C01_Variables

    /*
    Javada temelde 2 farkli data type vardir
    1)Primitive(Ilkel) Data Type: 8 tane
    a)boolean==>true;false sadece 2 farkli deger alabilir.booleanlar sadec 2 farkli deger aldigi icin memoryde az yer kaplar1 bitlik yer kaplar
    b)char==>tek karakterli ifadeler icin kullanilir.1 char=16 bit yer kaplar.
    //char'larla matematiksel islem yaparsaniz karakterlerin ascii degerlerini kullanir
    c)byte===> -128 'dahil +127 dahil bu araliktaki tum tam sayilari icerir.memory de 8 bitlik yer kaplar
    d)short==>-32768 den 32767'e kadar tum tamsayilari icerir
    memoryde 16 bit yer kaplar
    e)int==>-2147483648'den 2147483647'e kadar tum tam sayilari icerir.memoryde 32 bit yer kaplar
    f)long==>-9223372036854755808'den 9223372036854755807'e kadar tum tam sayi degerelerini alir.memoryde 64 bit yer kaplar
    g)float==>ondalikli sayilar icin kullanilan data type laridir.float memeoryde 32 bit kullanir.ondalik kisimlarinda
     en fazla 7 rakam barindirir 0.1234567 gibi
    h)double==>ondalikli sayilar icin kullanilir.memoryde 64 bit yer kaplar.
    double'lar ondalik kisimlarinda 16 rakamm barindirir 0.1234567891234567 gibi.
    Programcilar float'a gore daha fazla yer kaplasada double'i kullanir;floatta f sonuna eklemek gerektigi icin tercih edilmez
    2)Non-Primitive Data Type==> ozelligi daha fazla daha kaliteli String;Arrays;Classes;Interface
     String==> cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusur.istersen cift tirnak arasina destanda yazabilirsin
*/

//byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

    public static void main(String[] args) {

        System.out.println("byteMax =" +Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);












    }



















}
