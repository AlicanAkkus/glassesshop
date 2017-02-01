package com.gozlukdukkanim.controller.admin;

import com.gozlukdukkanim.model.Urun;
import com.gozlukdukkanim.service.UrunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Controller
@RequestMapping("/admin")
public class AdminUrunController {

    private Path path;
    @Autowired
    private UrunService urunService;

    @RequestMapping("/urun/urunEkle")
    public String urunEkle(Model model) {
        Urun urun = new Urun();
        urun.setUrunKategori("Güneş Gözlüğü");
        urun.setUrunCins("Erkek");
        urun.setUrunDurum("Aktif");

        model.addAttribute("urun", urun);

        return "urunEkle";
    }

    @RequestMapping(value = "/urun/urunEkle", method = RequestMethod.POST)
    public String urunEklePost(@Valid @ModelAttribute("urun") Urun urun, BindingResult result, HttpServletRequest request) {
        if (result.hasErrors()) {
            return "urunEkle";
        }
        urunService.urunEkle(urun);
        MultipartFile urunResim = urun.getUrunResim();
        String rootDir = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDir + "\\WEB-INF\\resources\\urun_resimler\\" + urun.getUrunId() + ".png");
        if (urunResim != null && !urunResim.isEmpty()) {
            try {
                urunResim.transferTo(new File(path.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Urun resmi kaydedilemedi!");
            }

        }
        return "redirect:/admin/urunEnvanter";
    }

    @RequestMapping("/urun/urunDuzenle/{id}")
    public String urunDuzenle(@PathVariable("id") int id, Model model) {
        Urun urun = urunService.getUrunById(id);
        model.addAttribute("urun", urun);
        return "urunDuzenle";
    }

    @RequestMapping(value = "/urun/urunDuzenle", method = RequestMethod.POST)
    public String urunDuzenlePost(@Valid @ModelAttribute("urun") Urun urun, BindingResult result, HttpServletRequest request) {
        if (result.hasErrors()) {
            return "urunDuzenle";
        }

        MultipartFile urunResim = urun.getUrunResim();
        String rootDir = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDir + "\\WEB-INF\\resources\\urun_resimler\\" + urun.getUrunId() + ".png");

        if (urunResim != null && !urunResim.isEmpty()) {
            try {
                urunResim.transferTo(new File(path.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Urun resmi kaydedilemedi!");
            }

        }

        urunService.urunDuzenle(urun);

        return "redirect:/admin/urunEnvanter";
    }

    @RequestMapping("/urun/urunSil/{id}")
    public String urunSil(@PathVariable int id, Model model, HttpServletRequest request) {
        String rootDir = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDir + "\\WEB-INF\\resources\\urun_resimler\\" + id + ".png");
        if (Files.exists(path)) {
            try {
                Files.delete(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Urun urun = urunService.getUrunById(id);
        urunService.urunSil(urun);
        return "redirect:/admin/urunEnvanter";
    }


}
