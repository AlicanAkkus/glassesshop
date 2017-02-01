package com.gozlukdukkanim.service;

import com.gozlukdukkanim.model.Musteri;

import java.util.List;

/**
 * Created by memoricAb on 1.02.2017.
 */
public interface MusteriService {
    void musteriEkle(Musteri musteri);
    Musteri getMusteriById(int musteriId);
    List<Musteri> getTumMusteriler();

}
