package com.gozlukdukkanim.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by memoricAb on 22.01.2017.
 */
@Entity
public class SepetItem implements Serializable {
    private static final long serialVersionUID = 4938317054338767752L;
    @Id
    @GeneratedValue
    private int sepetItemId;
    @ManyToOne
    @JoinColumn(name = "sepetId")
    @JsonIgnore
    private Sepet sepet;
    @ManyToOne
    @JoinColumn(name = "urunId")
    private Urun urun;
    private int adet;
    private double toplamFiyat;

    public int getSepetItemId() {
        return sepetItemId;
    }

    public void setSepetItemId(int sepetItemId) {
        this.sepetItemId = sepetItemId;
    }

    public Sepet getSepet() {
        return sepet;
    }

    public void setSepet(Sepet sepet) {
        this.sepet = sepet;
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
        return toplamFiyat;
    }

    public void setToplamFiyat(double toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }
}
