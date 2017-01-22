package com.gozlukdukkanim.dao;

import com.gozlukdukkanim.model.Urun;

import java.util.List;

/**
 * Created by memoricAb on 22.01.2017.
 */
public interface UrunDao {
    void urunEkle(Urun urun);

    Urun getUrunById(String id);

    List<Urun> getTumUrunler();


    void urunSil(String id);
    void urunDuzenle(Urun urun);
}
