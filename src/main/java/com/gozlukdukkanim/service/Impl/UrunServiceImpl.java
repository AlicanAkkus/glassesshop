package com.gozlukdukkanim.service.Impl;

import com.gozlukdukkanim.dao.UrunDao;
import com.gozlukdukkanim.model.Urun;
import com.gozlukdukkanim.service.UrunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Service
public class UrunServiceImpl implements UrunService {

    @Autowired
    private UrunDao urunDao;

    public List<Urun> getUrunListe() {
        return urunDao.getUrunListe();
    }

    public Urun getUrunById(int urunId) {
        return urunDao.getUrunById(urunId);
    }

    public void urunEkle(Urun urun) {
        urunDao.urunEkle(urun);
    }

    public void urunDuzenle(Urun urun) {
        urunDao.urunDuzenle(urun);
    }

    public void urunSil(Urun urun) {
        urunDao.urunSil(urun);
    }
}
