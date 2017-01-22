package com.gozlukdukkanim.dao.impl;

import com.gozlukdukkanim.dao.SepetDao;
import com.gozlukdukkanim.model.Sepet;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by memoricAb on 22.01.2017.
 */
@Repository
public class SepetDaoImpl implements SepetDao {


    private Map<String, Sepet> sepetListesi;

    public SepetDaoImpl() {
        sepetListesi = new HashMap<String, Sepet>();

    }

    public Sepet olustur(Sepet sepet) {
        if (sepetListesi.keySet().contains(sepet.getSepetId())) {
            throw new IllegalArgumentException(String.format("Yeni bir sepet oluşturulamadı. Verilen id(%) ile sepet zaten var!", sepet.getSepetId()));

        }

        sepetListesi.put(sepet.getSepetId(), sepet);

        return sepet;

    }

    public Sepet oku(String sepetId) {
        return sepetListesi.get(sepetId);
    }

    public void guncelle(String sepetId, Sepet sepet) {
        if (!sepetListesi.keySet().contains(sepetId)) {
            throw new IllegalArgumentException(String.format("Sepet güncellenemedi. Verilen id(%) ile sepet bulunamadı!", sepet.getSepetId()));

        }
        sepetListesi.put(sepetId, sepet);

    }

    public void sil(String sepetId) {
        if (!sepetListesi.keySet().contains(sepetId)) {
            throw new IllegalArgumentException(String.format("Sepet silinemedi. Verilen id(%) ile sepet bulunamadı!", sepetId));
        }

        sepetListesi.remove(sepetId);


    }
}
