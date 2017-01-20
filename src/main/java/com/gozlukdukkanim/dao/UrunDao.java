package com.gozlukdukkanim.dao;

import com.gozlukdukkanim.model.Urun;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by memoricAb on 19.01.2017.
 */
public class UrunDao {

    private List<Urun> urunListe;


    public List<Urun> getUrunListe(){
        Urun urun = new Urun();
        Urun urun1 = new Urun();
        Urun urun2 = new Urun();
        Urun urun3= new Urun();

        urun.setUrunId("P32");
        urun.setUrunMarka("Rayban");
        urun.setUrunKategori("Gozluk");
        urun.setUrunAciklama("Güneş gözlüğüdür");
        urun.setUrunFiyat(1200);
        urun.setUrunDurum("aktif");
        urun.setUrunStok(20);
        urun.setUrunRenk("üüğğqğqğ");
        urun1.setUrunId("P33");
        urun1.setUrunMarka("dsadasd");
        urun1.setUrunKategori("Gozluk");
        urun1.setUrunAciklama("Güneş gözlüğüdür");
        urun1.setUrunFiyat(1200);
        urun1.setUrunDurum("aktif");
        urun1.setUrunStok(20);
        urun1.setUrunRenk("Kırmrrwrwrwwwşşşüüüızı");
        urun2.setUrunId("P34");
        urun2.setUrunMarka("Airopdsadstix");
        urun2.setUrunKategori("Godsadsadsazluk");
        urun2.setUrunAciklama("Gündsaeşdsa gödsadsadzlüğüdürGündsaeşdsa gödsadsadzlüğüdürGündsaeşdsa gödsadsadzlüğüdürGündsaeşdsa gödsadsadzlüğüdürGündsaeşdsa gödsadsadzlüğüdürGündsaeşdsa gödsadsadzlüğüdür");
        urun2.setUrunFiyat(1200);
        urun2.setUrunDurum("aktif");
        urun2.setUrunStok(20);
        urun2.setUrunRenk("Kırmızqqqqrrrrrrrrı");
        urun3.setUrunId("P35");
        urun3.setUrunMarka("dsadsa");
        urun3.setUrunKategori("Gozsadsaddsadluk");
        urun3.setUrunAciklama("Gündsadsadeş gözldddqqqqqqqüğüdür");
        urun3.setUrunFiyat(1200);
        urun3.setUrunDurum("aktif");
        urun3.setUrunStok(20);
        urun3.setUrunRenk("Kırmqqqqqqqızı");


        urunListe = new ArrayList<Urun>();
        urunListe.add(urun);
        urunListe.add(urun1);
        urunListe.add(urun2);
        urunListe.add(urun3);

        return urunListe;

    }


    public Urun getUrunById(String urunId) throws IOException{

        for(Urun urun : getUrunListe()){

            if(urun.getUrunId().equals(urunId)){

                return urun;

            }

        }

        throw new IOException("Ürün bulunamadı.");

    }
}
