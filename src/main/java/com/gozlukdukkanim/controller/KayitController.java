package com.gozlukdukkanim.controller;

import com.gozlukdukkanim.model.KargoAdres;
import com.gozlukdukkanim.model.Musteri;
import com.gozlukdukkanim.model.MusteriAdres;
import com.gozlukdukkanim.service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Controller
public class KayitController {
     @Autowired
     private MusteriService musteriService;

    @RequestMapping("/kayit")
    public String musteriKayit(Model model) {

        Musteri musteri = new Musteri();
        MusteriAdres musteriAdres = new MusteriAdres();
        KargoAdres kargoAdres = new KargoAdres();
        musteri.setMusteriAdres(musteriAdres);
        musteri.setKargoAdres(kargoAdres);
        model.addAttribute("musteri", musteri);

        return "musteriKayit";
    }

    @RequestMapping(value = "/kayit", method = RequestMethod.POST)
    public String musteriKayitPost(@ModelAttribute("musteri") Musteri musteri, Model model) {
        musteri.setEnabled(true);
        musteriService.musteriEkle(musteri);

        return "musteriKayitBasarili";


    }

}
