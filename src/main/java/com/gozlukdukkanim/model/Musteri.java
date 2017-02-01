package com.gozlukdukkanim.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Entity
public class Musteri implements Serializable {

    private static final long serialVersionUID = 2227893779263971898L;
    @Id
    @GeneratedValue
    private int musteriId;
    @NotEmpty(message = "Müşteri ismi boş kalamaz!")
    private String musteriIsim;
    @NotEmpty(message = "Müşteri e-maili boş kalamaz!")
    private String musteriEmail;
    private String musteriTel;
    @NotEmpty(message = "Müşteri kullanıcı adı boş kalamaz!")
    private String kullaniciadi;
    @NotEmpty(message = "Müşteri şifresi boş kalamaz!")
    private String sifre;
    private boolean enabled;
    @OneToOne
    @JoinColumn(name = "musteriAdresId")
    private MusteriAdres musteriAdres;
    @OneToOne
    @JoinColumn(name = "kargoAdresId")
    private KargoAdres kargoAdres;
    @OneToOne
    @JoinColumn(name = "sepetId")
    @JsonIgnore
    private Sepet sepet;

    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public String getMusteriIsim() {
        return musteriIsim;
    }

    public void setMusteriIsim(String musteriIsim) {
        this.musteriIsim = musteriIsim;
    }

    public String getMusteriEmail() {
        return musteriEmail;
    }

    public void setMusteriEmail(String musteriEmail) {
        this.musteriEmail = musteriEmail;
    }

    public String getMusteriTel() {
        return musteriTel;
    }

    public void setMusteriTel(String musteriTel) {
        this.musteriTel = musteriTel;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public MusteriAdres getMusteriAdres() {
        return musteriAdres;
    }

    public void setMusteriAdres(MusteriAdres musteriAdres) {
        this.musteriAdres = musteriAdres;
    }

    public KargoAdres getKargoAdres() {
        return kargoAdres;
    }

    public void setKargoAdres(KargoAdres kargoAdres) {
        this.kargoAdres = kargoAdres;
    }

    public Sepet getSepet() {
        return sepet;
    }

    public void setSepet(Sepet sepet) {
        this.sepet = sepet;
    }
}
