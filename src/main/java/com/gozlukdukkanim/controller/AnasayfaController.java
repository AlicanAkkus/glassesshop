package com.gozlukdukkanim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Controller
public class AnasayfaController {

    @RequestMapping("/")
    public String home() {
        return "anasayfa";

    }

    @RequestMapping("/giris")
    public String giris(@RequestParam(value = "hata", required = false) String hata, @RequestParam(value = "cikis", required = false) String cikis, Model model) {
        if (hata != null) {
            model.addAttribute("hata", "Yanlış kullanıcı adı veya şifre!");

        }
        if (cikis != null) {
            model.addAttribute("msj", "Başarıyla çıkış yaptınız.");

        }

        return "giris";

    }
}
