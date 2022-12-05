package day13_overriding_overloading_statickeyword;

import java.util.Scanner;

public class Test {

    // kullanici A Ayse; kullanici B Burak ismini data olarak girerse cikti ne olur?

    String studentName; // instance variable
    String year = "2020"; // instance variable
    String studentId; // instance variable
    static int counter=1000;

    public Test(){ // Constructor
        Scanner input = new Scanner(System.in);
        System.out.println("Isminizi giriniz ");
        studentName= input.next();
        setStudentId();
    }

    private void setStudentId() { // method
        counter++;
        this.studentId=year+""+counter;
    }


    public static void main(String[] args) {

        Test student1 =new Test(); // ilk obje
        System.out.println(student1.studentName+student1.studentId); //Kullanici A  Ayse20201001
        Test student2 =new Test(); // ikinci obje
        System.out.println(student2.studentName+student2.studentId); //Kullanici B  Burak20201002










    }

}
