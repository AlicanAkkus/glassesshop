package com.gozlukdukkanim.model;

/**
 * Created by memoricAb on 22.01.2017.
 */
public class SepetItem {

    private Urun urun;
    private int adet;
    private double toplamFiyat;


    public SepetItem() {
    }

    public SepetItem(Urun urun) {
        this.urun = urun;
        this.adet = 1;
        this.toplamFiyat = urun.getUrunFiyat();

    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public double getToplamFiyat() {
        return toplamFiyat*adet;
    }

    public void setToplamFiyat(double toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }
}
