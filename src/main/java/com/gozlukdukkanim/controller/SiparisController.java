package com.gozlukdukkanim.controller;

import com.gozlukdukkanim.model.Musteri;
import com.gozlukdukkanim.model.MusteriSiparis;
import com.gozlukdukkanim.model.Sepet;
import com.gozlukdukkanim.service.MusteriSiparisService;
import com.gozlukdukkanim.service.SepetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by memoricAb on 2.02.2017.
 */
@Controller
public class SiparisController {
    @Autowired
    private SepetService sepetService;

    @Autowired
    private MusteriSiparisService musteriSiparisService;

    @RequestMapping("/siparis/{sepetId}")
    public String siparis(@PathVariable("sepetId") int sepetId) {
        MusteriSiparis musteriSiparis = new MusteriSiparis();
        Sepet sepet = sepetService.getSepetById(sepetId);
        musteriSiparis.setSepet(sepet);


        Musteri musteri = sepet.getMusteri();
        musteriSiparis.setMusteri(musteri);
        musteriSiparis.setMusteriAdres(musteri.getMusteriAdres());
        musteriSiparis.setKargoAdres(musteri.getKargoAdres());

        musteriSiparisService.musteriSiparisEkle(musteriSiparis);

        return "redirect:/checkout?sepetId=" + sepetId;
    }
}
