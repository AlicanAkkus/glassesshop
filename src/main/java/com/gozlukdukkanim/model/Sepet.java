package com.gozlukdukkanim.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by memoricAb on 22.01.2017.
 */
@Entity
public class Sepet implements Serializable {

    private static final long serialVersionUID = 1944136909119391556L;
    @Id
    @GeneratedValue
    private int sepetId;
    @OneToMany(mappedBy = "sepet", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SepetItem> sepetItemler;
    @OneToOne
    @JoinColumn(name = "musteriId")
    @JsonIgnore
    private Musteri musteri;
    private double sepetToplam;

    public int getSepetId() {
        return sepetId;
    }

    public void setSepetId(int sepetId) {
        this.sepetId = sepetId;
    }

    public List<SepetItem> getSepetItemler() {
        return sepetItemler;
    }

    public void setSepetItemler(List<SepetItem> sepetItemler) {
        this.sepetItemler = sepetItemler;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public double getSepetToplam() {
        return sepetToplam;
    }

    public void setSepetToplam(double sepetToplam) {
        this.sepetToplam = sepetToplam;
    }
}
