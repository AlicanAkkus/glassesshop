package com.gozlukdukkanim.dao;

import com.gozlukdukkanim.model.Sepet;
import com.gozlukdukkanim.model.SepetItem;

/**
 * Created by memoricAb on 2.02.2017.
 */
public interface SepetItemDao {

    void sepetItemEkle(SepetItem sepetItem);

    void sepetItemSil(SepetItem sepetItem);

    void sepetBosalt(Sepet sepet);

    SepetItem getSepetItemByUrunId(int urunId);

}
