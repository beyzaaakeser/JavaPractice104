package day11_multidimensionalarrays;

public class C04_IncrementDecrement {
    public static void main(String[] args) {

        int a =15;

        int b=a++;

        System.out.println(b);// 15

        int sayi1= 10;
        int sayi2 =20;
        int sayi3 =30;

        sayi2=sayi1++;
        System.out.println(sayi1+","+sayi2+","+sayi3);//11.10.30

        sayi3=++sayi1;
        System.out.println(sayi3++);//12
        System.out.println(--sayi2);//9
        System.out.println(sayi3++);//13
        System.out.println(sayi1);//12
        System.out.println(sayi3);//14


































    }
}
