package com.gozlukdukkanim.dao;

import com.gozlukdukkanim.model.Musteri;

import java.util.List;

/**
 * Created by memoricAb on 1.02.2017.
 */
public interface MusteriDao {

    void musteriEkle(Musteri musteri);

    Musteri getMusteriById(int musteriId);

    List<Musteri> getTumMusteriler();
}
