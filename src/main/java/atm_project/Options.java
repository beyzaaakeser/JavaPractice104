package atm_project;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00"); // parayi dolar formatina cevirmek.

    boolean flag = true;

    HashMap<Integer,Integer> data = new HashMap<>();

    // butun uygulamalarin kullandigi 3 asama, 3 yonu :
    // user interface = ara yuz ==> kullanicinin etkilesimde oldugu herhangi bir yer. kayit olma giris yapma vs vs gibi
    // data base = veri bankasi ==> Uygulamada girilen bililerin depolandigi yer
    // API ==>  uygulamalar arasinda birbirleri arasindaki agi kuran kisma api denir. application programming interface
    public void login(){
        System.out.println("Techproed ATM'e Hosgeldiniz!");

        do {
            data.put(12345,1234);
            data.put(23456,2345);
            data.put(34567,3456);
            data.put(45678,4567);

            try{
                System.out.println("Hesap numaranizi giriniz:");
                setAccountNumber(input.nextInt());
                System.out.println("Pin numaranizi giriniz");
                setPinNumber(input.nextInt());
            }catch (Exception e){
                System.out.println("Yanlis karakter girdiniz! Lutfen sadece rakam giriniz veya q'ya basip cikabilirsiniz");
                input.nextLine();
                String exit = input.next();
                if (exit.equalsIgnoreCase("q")){
                    flag = false;
                }
            }


            int count = 0;
            for (Map.Entry<Integer,Integer> w: data.entrySet()){
                if (w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber())){
                    getAccountTypes();// hesap islemlerine gidiniz
                }else{
                    count++;
                }
            }
            if (count==data.size()){
                System.out.println("Hesap numarasi veya pin yanlis");
            }


        }while (flag);
    }



    // checking(vadesiz) hesap islemleri
    public void checkingOperations(){

        do {
            displayMessage();
            int option = input.nextInt();

            if (option==4){
                break;
            }

            switch (option){
                case 1:
                    System.out.println("Checking hesabinizda kalan bakiye : "+ moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("Yanlis secenek! Lutfen 1,2,3 veya 4'u kullaniniz");
            }

        }while (true);
        getAccountTypes();
    }



    // saving hesap(vadeli hesap islemleri)
    public void savingOperations(){
        do {
            displayMessage();
            int option = input.nextInt();

            if (option==4){
                break;
            }

            switch (option){
                case 1:
                    System.out.println("Saving hesabinizda kalan bakiye : "+ moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("Yanlis secenek! Lutfen 1,2,3 veya 4'u kullaniniz");
            }

        }while (true);
        getAccountTypes();
    }
    //ilgili hesabi seciniz
    public void getAccountTypes(){
        System.out.println("Hangi hesaptan islem yapmak istersiniz");
        System.out.println("1: Checking Account"); // vadesiz hesap
        System.out.println("2: Saving Account"); // vadeli hesap
        System.out.println("3: Quit");
        int option = input.nextInt();

        switch (option){
            case 1:
                System.out.println("Checkin/vadesiz hesabinizdasiniz");
                checkingOperations();
                break;
            case 2:
                System.out.println("Saving/ vadeli hesabinizdasiniz");
                savingOperations();
                break;
            case 3:
                System.out.println("ATM makinemizi kullandiginiz icin tesekkur ederiz.");
                flag=false;
            default:
                System.out.println("Yanlis secenek girdiniz. Lutfen 1,2 veya 3'u seciniz.");
        }
    }

    // kisi icin secenekleri goruntule
    public void displayMessage(){
        System.out.println("Opsiyon seciniz!");
        System.out.println("1: View Balance"); // Bakiyenizi goruntuleyiniz.
        System.out.println("2: Withdraw"); // para cekme islemi
        System.out.println("3: Deposit"); // para yatirma
        System.out.println("4: Exit "); // Cikis islemi sonlandirma
    }


}
