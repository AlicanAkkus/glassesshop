package com.gozlukdukkanim.conroller;

import com.gozlukdukkanim.dao.UrunDao;
import com.gozlukdukkanim.model.Urun;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by memoricAb on 19.01.2017.
 */
@Controller
public class AnasayfaController {
    private UrunDao urunDao = new UrunDao();

    @RequestMapping("/")
    public String anasayfa() {

        return "anasayfa";

    }

    @RequestMapping("/urunListe")
    public String getUrunler(Model model) {

        List<Urun> urunler = urunDao.getUrunListe();

        model.addAttribute("urunler", urunler);

        return "urunListe";


    }

    @RequestMapping("/urunListe/urunSayfa/{urunId}")
    public String urunGoster(@PathVariable String urunId, Model model) throws IOException{
        Urun urun = urunDao.getUrunById(urunId);
        model.addAttribute(urun);

    return "urunSayfa";

    }
}
