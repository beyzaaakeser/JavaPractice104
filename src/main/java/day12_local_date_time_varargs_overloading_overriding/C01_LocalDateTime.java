package day12_local_date_time_varargs_overloading_overriding;

import java.util.Scanner;

public class C01_LocalDateTime {
    public static void main(String[] args) {

        // Kullanicidan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz ayi String olarak giriniz");
        String ay = input.nextLine();

        System.out.println("Lutfen dogdugunuz gun bilgisini yaziniz");
        int gun = input.nextInt();

        String burc = "";

        if (ay.equalsIgnoreCase("ocak")){

            if (gun>22)
                burc = "Kova";
            else
                burc="Oglak";
        }
        if (ay.equalsIgnoreCase("subat")){

            if (gun>20)
                burc = "Balik";
            else
                burc="Kova";
        }
        if (ay.equalsIgnoreCase("mart")){

            if (gun>21)
                burc = "Koc";
            else
                burc="Balik";
        }
        if (ay.equalsIgnoreCase("nisan")){

            if (gun>21)
                burc = "Boga";
            else
                burc="Koc";
        }
        if (ay.equalsIgnoreCase("mayis")){

            if (gun>22)
                burc = "Ikizler";
            else
                burc="Boga";
        }
        if (ay.equalsIgnoreCase("haziran")){

            if (gun>23)
                burc = "Yengec";
            else
                burc="Ikizler";
        }
        if (ay.equalsIgnoreCase("temmuz")){

            if (gun>23)
                burc = "Aslan";
            else
                burc="Yengec";
        }
        if (ay.equalsIgnoreCase("agustos")){

            if (gun>23)
                burc = "Basak";
            else
                burc="Aslan";
        }
        if (ay.equalsIgnoreCase("eylul")){

            if (gun>23)
                burc = "Terazi";
            else
                burc="Basak";
        }
        if (ay.equalsIgnoreCase("ekim")){

            if (gun>23)
                burc = "Akrep";
            else
                burc="Terazi";
        }
        if (ay.equalsIgnoreCase("kasim")){

            if (gun>22)
                burc = "Yay";
            else
                burc="Akrep";
        }  if (ay.equalsIgnoreCase("aralik")){

            if (gun>22)
                burc = "Oglak";
            else
                burc="Yay";
        }

        System.out.println(gun+" "+ ay+ " "+ "tarihinde dogduysaniz burcunuz "+ burc);














































    }
}
