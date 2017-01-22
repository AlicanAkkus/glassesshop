package com.gozlukdukkanim.conroller;

import com.gozlukdukkanim.dao.SepetDao;
import com.gozlukdukkanim.dao.UrunDao;
import com.gozlukdukkanim.model.Sepet;
import com.gozlukdukkanim.model.SepetItem;
import com.gozlukdukkanim.model.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by memoricAb on 22.01.2017.
 */
@Controller
@RequestMapping("/rest/sepet")
public class SepetController {

    @Autowired
    private SepetDao sepetDao;

    @Autowired
    UrunDao urunDao;


    @RequestMapping(value = "/{sepetId}", method = RequestMethod.GET)
    public
    @ResponseBody
    Sepet oku(@PathVariable(value = "sepetId") String sepetId) {
        return sepetDao.oku(sepetId);

    }

    @RequestMapping(value = "/{sepetId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void guncelle(@PathVariable(value = "sepetId") String sepetId, @RequestBody Sepet sepet) {
        sepetDao.guncelle(sepetId, sepet);

    }

    @RequestMapping(value = "/{sepetId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void sil(@PathVariable(value = "sepetId") String sepetId) {
        sepetDao.sil(sepetId);

    }

    @RequestMapping(value = "/ekle/{urunId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void itemEkle(@PathVariable(value = "urunId") String urunId, HttpServletRequest request) {
        String sessionId = request.getSession(true).getId();
        Sepet sepet = sepetDao.oku(sessionId);

        if (sepet == null) {
            sepet = sepetDao.olustur(new Sepet(sessionId));

        }

        Urun urun = urunDao.getUrunById(urunId);
        if (urun == null) {
            throw new IllegalArgumentException(new Exception());

        }


        sepet.sepetItemEkle(new SepetItem(urun));

        sepetDao.guncelle(sessionId, sepet);
    }

    @RequestMapping(value = "/sil/{urunId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void itemSil(@PathVariable String urunId, HttpServletRequest request) {
        String sessionId = request.getSession(true).getId();
        Sepet sepet = sepetDao.oku(sessionId);

        if (sepet == null) {
            sepet = sepetDao.olustur(new Sepet(sessionId));

        }

        Urun urun = urunDao.getUrunById(urunId);
        if (urun == null) {
            throw new IllegalArgumentException(new Exception());

        }


        sepet.sepetItemSil(new SepetItem(urun));

        sepetDao.guncelle(sessionId, sepet);
    }
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST,reason = "İstek bulunamadı, lütfen yeniden deneyin")
    public void clientHata(Exception e){}
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR,reason = "Sunucu Hatası")
    public void serverHata(Exception e){}


}
