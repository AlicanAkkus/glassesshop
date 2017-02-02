package com.gozlukdukkanim.service.Impl;

import com.gozlukdukkanim.dao.MusteriSiparisDao;
import com.gozlukdukkanim.model.MusteriSiparis;
import com.gozlukdukkanim.model.Sepet;
import com.gozlukdukkanim.model.SepetItem;
import com.gozlukdukkanim.service.MusteriSiparisService;
import com.gozlukdukkanim.service.SepetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by memoricAb on 2.02.2017.
 */
@Service
public class MusteriSiparisServiceImpl implements MusteriSiparisService {
    @Autowired
    SepetService sepetService;
    @Autowired
    MusteriSiparisDao musteriSiparisDao;

    public void musteriSiparisEkle(MusteriSiparis musteriSiparis) {
        musteriSiparisDao.musteriSiparisEkle(musteriSiparis);

    }

    public double getMusteriSiparisSepetToplam(int sepetId) {
        double sepetToplam = 0;
        Sepet sepet = sepetService.getSepetById(sepetId);
        List<SepetItem> sepetItemler = sepet.getSepetItemler();
        for (SepetItem item : sepetItemler) {
            sepetToplam+=item.getToplamFiyat();

        }

        return sepetToplam;
    }
}
