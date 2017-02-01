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
public class MusteriAdres implements Serializable {

    private static final long serialVersionUID = -7900104127331569861L;
    @Id
    @GeneratedValue
    private int musteriAdresId;
    private String sokak;
    private String no;
    private String sehir;
    private String ilce;
    private String ulke;
    private String postaKodu;
    @OneToOne
    private Musteri musteri;


    public int getMusteriAdresId() {
        return musteriAdresId;
    }

    public void setMusteriAdresId(int musteriAdresId) {
        this.musteriAdresId = musteriAdresId;
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

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }


    @Override
    public String toString() {
        return "MusteriAdres{" +
                "sokak='" + sokak + '\'' +
                ", no='" + no + '\'' +
                ", sehir='" + sehir + '\'' +
                ", ilce='" + ilce + '\'' +
                ", ulke='" + ulke + '\'' +
                ", postaKodu='" + postaKodu + '\'' +
                '}';
    }
}
