package com.gozlukdukkanim.controller.admin;

import com.gozlukdukkanim.model.Musteri;
import com.gozlukdukkanim.model.Urun;
import com.gozlukdukkanim.service.MusteriService;
import com.gozlukdukkanim.service.UrunService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Controller
@RequestMapping("/admin")
public class AdminAnasayfaController {

    @Autowired
    private UrunService urunService;
    @Autowired
    MusteriService musteriService;

    @RequestMapping
    public String adminSayfa() {
        return "admin";
    }

    @RequestMapping("/urunEnvanter")
    public String urunEnvanter(Model model) {
        List<Urun> urunler = urunService.getUrunListe();
        model.addAttribute("urunler", urunler);

        return "urunEnvanter";
    }

    @RequestMapping("/musteri")
    public String musteriYonetim(Model model) {
        List<Musteri> musteriListe = musteriService.getTumMusteriler();
        model.addAttribute("musteriListe", musteriListe);
        return "musteriYonetim";

    }
}
