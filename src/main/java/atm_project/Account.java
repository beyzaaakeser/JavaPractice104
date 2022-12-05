package atm_project;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber; // hesap numarasi
    private int pinNumber; // sifre

    private double checkingBalance; // vadesiz hesap bakiyesi
    private double savingBalance; // vadeli hesap bakiyesi

    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00"); // parayi dolar formatina cevirmek. basina $ koyuyor.

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }



    // para cekme ==> paraCekmeIslemindenSonraKalanMiktar       amount : miktar
    private double calculateCheckingBalanceAfterWithdraw(double amount){

        checkingBalance = checkingBalance-amount;
        return checkingBalance;
    }

    // para yatirma ==> para yatirma isleminden sonra kalan bakiyeyi hesapla      amount : miktar
    private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance = checkingBalance+amount;
        return checkingBalance;
    }

    // para cekme ==> saving hesabindan para cekildikten sonra kalan bakiye
    private double calculateSavingBalanceAfterWithdraw(double amount){

        savingBalance = savingBalance-amount;
        return savingBalance;
    }


    // para yatirma ==> saving hesabina para yatridiktan sonra kalan bakiyeyi hesaplayiniz
    private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance = savingBalance+amount;
        return savingBalance;
    }


    // Musteri ile para cekmek icin ilk etkilesime gecelim. : checking hesap icin
    public void getCheckingWithdraw(){
        displayCurrentAmount(checkingBalance);
        System.out.println("Cekmek istediginiz bakiyeyi giriniz.");
        double amount = input.nextDouble();

        if (amount <=0 ){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getCheckingWithdraw();// recursive method ==>  ayni isimli methodu buraya tekrar cagrirsak ayni islemi tekraralamis oluyoruz. kendisini methodu yani tekrardan cagirma oluyor
        }else if(amount <= checkingBalance ){
            calculateCheckingBalanceAfterWithdraw(amount);
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }else{
            System.out.println("Yetersiz Bakiye!");
        }

    }


    // Musteri ile para yatirmak icin etkilesime gecelim : checking hesap
    public void getCheckingDeposit(){
        displayCurrentAmount(checkingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz.");
        double amount = input.nextDouble();
        
        if (amount<=0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getCheckingDeposit(); // recursive method ==> islemi tekrardan almasi icin yapildi
        } else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }

    }


    // Musteri ile para cekmek icin etkilesime gecelim : saving account
    public  void getSavingWithdraw(){
        displayCurrentAmount(savingBalance);
        System.out.println("Cekmek istediginiz bakiyeyi giriniz.");
        double amount = input.nextDouble();

        if (amount <=0 ){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getSavingWithdraw();// recursive method ==>  ayni isimli methodu buraya tekrar cagrirsak ayni islemi tekraralamis oluyoruz. kendisini methodu yani tekrardan cagirma oluyor
        }else if(amount <= savingBalance ){
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }else{
            System.out.println("Yetersiz Bakiye!");
        }

    }



    // Musteri ile para yatirmak icin etkilesime gecelim : saving hesap
    public void getSavingDeposit(){
        displayCurrentAmount(savingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz.");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getSavingDeposit(); // recursive method ==> islemi tekrardan almasi icin yapildi
        } else {
            calculateSavingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }

    }



    // son bakiyeyi goster
    public void displayCurrentAmount(double balance){
        System.out.println("Hesabinizda bulunan bakiye : "+ moneyFormat.format(balance));
    }






























}//class
