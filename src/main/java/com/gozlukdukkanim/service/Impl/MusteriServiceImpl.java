package com.gozlukdukkanim.service.Impl;

import com.gozlukdukkanim.dao.MusteriDao;
import com.gozlukdukkanim.model.Musteri;
import com.gozlukdukkanim.service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Service
public class MusteriServiceImpl implements MusteriService {

    @Autowired
    private MusteriDao musteriDao;

    public void musteriEkle(Musteri musteri) {
        musteriDao.musteriEkle(musteri);


    }

    public Musteri getMusteriById(int musteriId) {
        return musteriDao.getMusteriById(musteriId);
    }

    public List<Musteri> getTumMusteriler() {
        return musteriDao.getTumMusteriler();
    }

    public Musteri getMusteriByKullaniciadi(String kullaniciadi) {
        return musteriDao.getMusteriByKullaniciadi(kullaniciadi);
    }
}
