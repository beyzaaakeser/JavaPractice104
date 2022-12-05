package day14_inheritance_encapsulation01;

public class Test {

    private double genislik;
    private double yukseklik;
    private double ekranBuyuklugu;
    private int maxSes=30;
    private int ses=12;
    private boolean guc;

    public Test(double genislik, double yukseklik, double ekranBuyuklugu){ // constructor olusturduk
        this.genislik = genislik;
        this.yukseklik= yukseklik;
        this.ekranBuyuklugu= ekranBuyuklugu;
    }

    public double kanalDegistirme(int kanal){
        switch (kanal){
            case 1:
                return 34.75;
            case 2:
                return 45.23;
            case 3 :
                return 50.89;

        }
        return 0;

    }

    public void gucDugmesi(){
        this.guc=!guc;
    }

    public int sesAzaltma(){

        if (0<ses){
            ses--;
        }
        return ses;
    }

    public int sesArtirma(){
        if (maxSes>ses){
            ses++;
        }
        return ses;
    }















}//class
