package day10_arrays;

import java.util.ArrayList;
import java.util.List;

public class C01_Arrays {
    public static void main(String[] args) {

        //EX:Size verilen ArrayListte 8 (inclusive-dahil) ve 8 den onceki tum elemanlari 2 katina cikariniz

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        System.out.println("Listenin ilk hali " + nums);  // Listenin ilk hali [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        for (int i = 0; i <nums.size() ; i++) {

            if (nums.get(i) == 8){
                nums.set(i,nums.get(i)*2);
                break;
            }

            nums.set(i,nums.get(i)*2); // sirayla butun degerleri getir 2 ile carp demek bu



        }
        System.out.println("Degistirilmis hali "+ nums);

        






































    }
}
