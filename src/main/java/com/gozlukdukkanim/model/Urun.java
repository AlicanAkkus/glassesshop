package com.gozlukdukkanim.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;

/**
 * Created by memoricAb on 19.01.2017.
 */
@Entity
public class Urun {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String urunId;
    @NotEmpty(message = "Ürün markası boş bırakılamaz!")
    private String urunMarka;
    private String urunKategori;
    private String urunAciklama;
    @Min(value=0,message = "Ürün fiyatı 0'dan az olamaz.")
    private double urunFiyat;
    private String urunRenk;
    @Min(value = 0,message = "Ürün stok durumu 0'dan az olamaz!")
    private int urunStok;
    private String urunDurum;
    private String urunCins;

    @Transient
    private MultipartFile urunResim;

    public String getUrunId() {
        return urunId;
    }

    public void setUrunId(String urunId) {
        this.urunId = urunId;
    }

    public String getUrunMarka() {
        return urunMarka;
    }

    public void setUrunMarka(String urunMarka) {
        this.urunMarka = urunMarka;
    }

    public String getUrunKategori() {
        return urunKategori;
    }

    public void setUrunKategori(String urunKategori) {
        this.urunKategori = urunKategori;
    }

    public String getUrunAciklama() {
        return urunAciklama;
    }

    public void setUrunAciklama(String urunAciklama) {
        this.urunAciklama = urunAciklama;
    }

    public double getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(double urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

    public String getUrunRenk() {
        return urunRenk;
    }

    public void setUrunRenk(String urunRenk) {
        this.urunRenk = urunRenk;
    }

    public int getUrunStok() {
        return urunStok;
    }

    public void setUrunStok(int urunStok) {
        this.urunStok = urunStok;
    }

    public String getUrunDurum() {
        return urunDurum;
    }

    public void setUrunDurum(String urunDurum) {
        this.urunDurum = urunDurum;
    }

    public String getUrunCins() {
        return urunCins;
    }

    public void setUrunCins(String urunCins) {
        this.urunCins = urunCins;
    }

    public MultipartFile getUrunResim() {
        return urunResim;
    }

    public void setUrunResim(MultipartFile urunResim) {
        this.urunResim = urunResim;
    }
}
