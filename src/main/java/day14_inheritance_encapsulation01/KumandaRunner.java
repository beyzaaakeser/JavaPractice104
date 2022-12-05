package day14_inheritance_encapsulation01;

public class KumandaRunner {

    public static void main(String[] args) {


        Test tv = new Test(102.10 , 80.00,40.45);

        tv.gucDugmesi();// Kumandayla tv acildi.
        System.out.println(tv.kanalDegistirme(2));
        System.out.println(tv.sesAzaltma());
        System.out.println(tv.sesArtirma());

    }//main

}//class
