package com.gozlukdukkanim.service;

import com.gozlukdukkanim.model.MusteriSiparis;

/**
 * Created by memoricAb on 2.02.2017.
 */
public interface MusteriSiparisService {

    void musteriSiparisEkle(MusteriSiparis musteriSiparis);
    double getMusteriSiparisSepetToplam(int sepetId);

}
