package com.gozlukdukkanim.conroller;

import com.gozlukdukkanim.dao.UrunDao;
import com.gozlukdukkanim.model.Urun;
import org.omg.SendingContext.RunTime;
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
import java.util.List;

/**
 * Created by memoricAb on 19.01.2017.
 */
@Controller
public class AnasayfaController {

    private Path path;

    @Autowired
    private UrunDao urunDao;

    @RequestMapping("/")
    public String anasayfa() {

        return "anasayfa";

    }

    @RequestMapping("/urunListe")
    public String getUrunler(Model model) {

        List<Urun> urunler = urunDao.getTumUrunler();

        model.addAttribute("urunler", urunler);

        return "urunListe";


    }

    @RequestMapping("/urunListe/urunSayfa/{urunId}")
    public String urunGoster(@PathVariable String urunId, Model model) throws IOException {
        Urun urun = urunDao.getUrunById(urunId);
        model.addAttribute(urun);

        return "urunSayfa";

    }



}
