package com.gozlukdukkanim.controller;

import com.gozlukdukkanim.model.Musteri;
import com.gozlukdukkanim.service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Controller
@RequestMapping("/musteri/sepet")
public class SepetController {
    @Autowired
    private MusteriService musteriService;

    @RequestMapping
    public String getSepet(@AuthenticationPrincipal User activeUser) {

        Musteri musteri = musteriService.getMusteriByKullaniciadi(activeUser.getUsername());
        int sepetId = musteri.getSepet().getSepetId();

        return "redirect:/musteri/sepet/" + sepetId;
    }

    @RequestMapping("/{sepetId}")
    public String getSepetYonlendirme(@PathVariable(value = "sepetId") int sepetId, Model model) {
        model.addAttribute("sepetId", sepetId);
        return "sepet";
    }
}
