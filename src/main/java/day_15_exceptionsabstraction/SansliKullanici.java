package day_15_exceptionsabstraction;

import java.util.ArrayList;
import java.util.List;

public class SansliKullanici {
    public void sansliKullaniciYazdir(List<String> listKullaniciID, List<Integer> listKullaniciSaniye) {


        List<String> sansluKullaniciIndexes = new ArrayList<>();

        for (int i = 0; i <listKullaniciSaniye.size() ; i++) {

            if (listKullaniciSaniye.get(i)<10){
                sansluKullaniciIndexes.add(listKullaniciID.get(i));
            }

        }

        System.out.println("Sansli Kullanicilar" );
        System.out.println(sansluKullaniciIndexes);





    }
}
