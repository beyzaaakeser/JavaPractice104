package day_15_exceptionsabstraction;

public class C01TryCatch {

    public static void main(String[] args) {
//        // verilen iki sayiyi 10 kez bolen kodu yaziniz
//        int sayi1 = 100;
//        int sayi2 = 5;
//
//
//
//        int sayac=1;
////        while (sayac<10){
////            System.out.println(sayi1/sayi2);
////            sayi2--;
////            sayac++;
////        }
//
//        System.out.println("** IF ELSE ILE **");
//
//
//        while (sayac<11){
//            if (sayi2==0){
//                System.out.println("Islem yapilirken payda 0 oldu ");
//            }else {
//                System.out.println(sayi1/sayi2);
//            }
//            sayi2--;
//            sayac++;
//        }


        System.out.println("** TRY CATCH ILE COZUMU **");

        int a = 100;
        int b = 5;
        int sayac2= 1;

        while (sayac2<11){

            try {
                System.out.println(a/b);  // ctrl+alt+t yapinca kendisi direkt try catch icine atiyor
            } catch (ArithmeticException e) {
                System.out.println("Payda sifir oldu");
            }
            b--;
            sayac2++;


        }





    }

}
