package com.gozlukdukkanim.service;

import com.gozlukdukkanim.model.Urun;

import java.util.List;

/**
 * Created by memoricAb on 1.02.2017.
 */
public interface UrunService {
    List<Urun> getUrunListe();

    Urun getUrunById(int id);

    void urunEkle(Urun urun);

    void urunDuzenle(Urun urun);

    void urunSil(Urun urun);
}
