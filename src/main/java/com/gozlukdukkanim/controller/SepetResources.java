package com.gozlukdukkanim.controller;

import com.gozlukdukkanim.model.Musteri;
import com.gozlukdukkanim.model.Sepet;
import com.gozlukdukkanim.model.SepetItem;
import com.gozlukdukkanim.model.Urun;
import com.gozlukdukkanim.service.MusteriService;
import com.gozlukdukkanim.service.SepetItemService;
import com.gozlukdukkanim.service.SepetService;
import com.gozlukdukkanim.service.UrunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by memoricAb on 2.02.2017.
 */
@Controller
@RequestMapping("/rest/sepet")
public class SepetResources {
    @Autowired
    private SepetService sepetService;
    @Autowired
    private MusteriService musteriService;
    @Autowired
    private UrunService urunService;
    @Autowired
    private SepetItemService sepetItemService;

    @RequestMapping("/{sepetId}")
    public @ResponseBody
    Sepet getSepetById(@PathVariable(value = "sepetId") int sepetId) {
        return sepetService.getSepetById(sepetId);
    }

    @RequestMapping(value = "/ekle/{urunId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void itemEkle(@PathVariable(value = "urunId") int urunId, @AuthenticationPrincipal User activeUser) {
        Musteri musteri = musteriService.getMusteriByKullaniciadi(activeUser.getUsername());
        Sepet sepet = musteri.getSepet();
        Urun urun = urunService.getUrunById(urunId);
        List<SepetItem> sepetItemler = sepet.getSepetItemler();

        for (int i = 0; i < sepetItemler.size(); i++) {
            if (urun.getUrunId() == sepetItemler.get(i).getUrun().getUrunId()) {
                SepetItem sepetItem = sepetItemler.get(i);
                sepetItem.setAdet(sepetItem.getAdet() + 1);
                sepetItem.setToplamFiyat(urun.getUrunFiyat() * sepetItem.getAdet());
                sepetItemService.sepetItemEkle(sepetItem);

                return;
            }

        }
        SepetItem sepetItem = new SepetItem();
        sepetItem.setUrun(urun);
        sepetItem.setAdet(1);
        sepetItem.setToplamFiyat(urun.getUrunFiyat() * sepetItem.getAdet());
        sepetItem.setSepet(sepet);
        sepetItemService.sepetItemEkle(sepetItem);

    }

    @RequestMapping(value = "/sil/{urunId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void itemSil(@PathVariable(value = "urunId") int urunId) {
        SepetItem sepetItem = sepetItemService.getSepetItemByUrunId(urunId);
        sepetItemService.sepetItemSil(sepetItem);

    }

    @RequestMapping(value = "/{sepetId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void sepetBosalt(@PathVariable(value = "sepetId") int sepetId) {
        Sepet sepet = sepetService.getSepetById(sepetId);
        sepetItemService.sepetBosalt(sepet);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "İstek geçersiz, lütfen yeniden deneyiniz.")
    public void clientHata(Exception e) {
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "İstek sunucuda geçersiz, lütfen yeniden deneyiniz.")
    public void sunucuHata(Exception e) {
    }
}


