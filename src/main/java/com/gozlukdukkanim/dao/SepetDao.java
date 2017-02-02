package com.gozlukdukkanim.dao;

import com.gozlukdukkanim.model.Sepet;

/**
 * Created by memoricAb on 22.01.2017.
 */
public interface SepetDao {

    Sepet getSepetById(int sepetId);
    void guncelle(Sepet sepet);

}
