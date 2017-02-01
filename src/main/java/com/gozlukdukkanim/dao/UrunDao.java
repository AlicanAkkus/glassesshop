package com.gozlukdukkanim.dao;

import com.gozlukdukkanim.model.Urun;

import java.util.List;

/**
 * Created by memoricAb on 22.01.2017.
 */
public interface UrunDao {
    List<Urun> getUrunListe();

    Urun getUrunById(int id);

    void urunEkle(Urun urun);

    void urunDuzenle(Urun urun);

    void urunSil(Urun urun);

}
