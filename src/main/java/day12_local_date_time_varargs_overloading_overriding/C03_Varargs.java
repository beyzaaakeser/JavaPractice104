package day12_local_date_time_varargs_overloading_overriding;

public class C03_Varargs {
    public static void main(String[] args) {

        // Varargs kullanarak verilen string ifadeleri birlestiren concat() isimli bir method olusturunuz.

        concat("Safran","bolu"," evleri"," cok"," guzel");







    }

    private static void concat(String ...str) {
        String sonuc ="";

        for (String w: str){
            sonuc+=w;
        }

        System.out.println(sonuc);

    }


}
