package com.gozlukdukkanim.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Entity
public class MusteriSiparis implements Serializable {

    private static final long serialVersionUID = -6452087955152986053L;
    @Id
    @GeneratedValue
    private int musteriSiparisId;
    @OneToOne
    @JoinColumn(name = "sepetId")
    private Sepet sepet;
    @OneToOne
    @JoinColumn(name = "musteriId")
    private Musteri musteri;
    @OneToOne
    @JoinColumn(name = "musteriAdresId")
    private MusteriAdres musteriAdres;
    @OneToOne
    @JoinColumn(name = "kargoAdresId")
    private KargoAdres kargoAdres;

    public int getMusteriSiparisId() {
        return musteriSiparisId;
    }

    public void setMusteriSiparisId(int musteriSiparisId) {
        this.musteriSiparisId = musteriSiparisId;
    }

    public Sepet getSepet() {
        return sepet;
    }

    public void setSepet(Sepet sepet) {
        this.sepet = sepet;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
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
}
