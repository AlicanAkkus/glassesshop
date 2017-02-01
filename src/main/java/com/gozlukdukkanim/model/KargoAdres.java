package com.gozlukdukkanim.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Entity
public class KargoAdres implements Serializable {

    private static final long serialVersionUID = -5200097358720383564L;
    @Id
    @GeneratedValue
    private int kargoAdresId;
    private String sokak;
    private String no;
    private String sehir;
    private String ilce;
    private String ulke;
    private String postaKodu;
    @OneToOne
    private Musteri musteri;

    public int getKargoAdresId() {
        return kargoAdresId;
    }

    public void setKargoAdresId(int kargoAdresId) {
        this.kargoAdresId = kargoAdresId;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(String postaKodu) {
        this.postaKodu = postaKodu;
    }

    @Override
    public String toString() {
        return "KargoAdres{" +
                "sokak='" + sokak + '\'' +
                ", no='" + no + '\'' +
                ", sehir='" + sehir + '\'' +
                ", ilce='" + ilce + '\'' +
                ", ulke='" + ulke + '\'' +
                ", postaKodu='" + postaKodu + '\'' +
                '}';
    }
}
