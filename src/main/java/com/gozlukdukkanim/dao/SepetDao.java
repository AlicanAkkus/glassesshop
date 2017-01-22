package com.gozlukdukkanim.dao;

import com.gozlukdukkanim.model.Sepet;

/**
 * Created by memoricAb on 22.01.2017.
 */
public interface SepetDao {

    Sepet olustur(Sepet sepet);


    Sepet oku(String sepetId);


    void guncelle(String sepetId, Sepet sepet);

    void sil(String sepetId);

}
