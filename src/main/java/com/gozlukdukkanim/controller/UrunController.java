package com.gozlukdukkanim.controller;

import com.gozlukdukkanim.model.Urun;
import com.gozlukdukkanim.service.UrunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Controller
@RequestMapping("/urun")
public class UrunController {

    @Autowired
    private UrunService urunService;

    @RequestMapping("/urunListe")
    public String getUrunler(Model model){
        List<Urun> urunler = urunService.getUrunListe();
        model.addAttribute("urunler",urunler);


        return "urunListe";

    }
    @RequestMapping("/urunSayfa/{urunId}")
    public String urunSayfa(@PathVariable int urunId, Model model) throws IOException{
        Urun urun = urunService.getUrunById(urunId);
        model.addAttribute("urun",urun);
        return "urunSayfa";

    }

}
