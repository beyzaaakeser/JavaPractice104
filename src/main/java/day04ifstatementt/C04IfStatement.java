package day04ifstatementt;

import java.util.Scanner;

public class C04IfStatement {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi girin");
        String jobTitle = input.nextLine().toLowerCase();

        if (jobTitle.equals("qa")){
            System.out.println(" Is unvani Quality Analyst ");
        } else if(jobTitle.equals("dev")){
            System.out.println(" Is unvani Developer ");
        } else if (jobTitle.equals("ba")) {
            System.out.println(" Is unvani Business Analyst ");
        } else if (jobTitle.equals("pm")) {
            System.out.println(" Is unvani Project Manager ");
        } else
            System.out.println(" Gecerli data giriniz... ");






































    }
}
