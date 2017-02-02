package com.gozlukdukkanim.service;

import com.gozlukdukkanim.model.Sepet;

/**
 * Created by memoricAb on 2.02.2017.
 */
public interface SepetService {
    Sepet getSepetById(int sepetId);
    void guncelle(Sepet sepet);
}
