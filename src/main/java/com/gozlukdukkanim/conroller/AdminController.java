package com.gozlukdukkanim.conroller;

import com.gozlukdukkanim.dao.UrunDao;
import com.gozlukdukkanim.model.Urun;
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
 * Created by memoricAb on 22.01.2017.
 */
@Controller
public class AdminController {

    private Path path;

    @Autowired
    private UrunDao urunDao;


    @RequestMapping("/admin")
    public String adminSayfa() {
        return "admin";

    }

    @RequestMapping("/admin/urunEnvanter")
    public String urunEnvanter(Model model) {
        List<Urun> urunler = urunDao.getTumUrunler();
        model.addAttribute("urunler", urunler);


        return "urunEnvanter";


    }

    @RequestMapping("/admin/urunEnvanter/urunEkle")
    public String urunEkle(Model model) {
        Urun urun = new Urun();


        model.addAttribute("urun", urun);

        return "urunEkle";

    }

    @RequestMapping(value = "/admin/urunEnvanter/urunEkle", method = RequestMethod.POST)
    public String urunEklePost(@Valid @ModelAttribute("urun") Urun urun, BindingResult result, HttpServletRequest request) {

        if (result.hasErrors()) {
            return "urunEkle";

        }


        urunDao.urunEkle(urun);

        MultipartFile urunResim = urun.getUrunResim();
        String rootDir = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDir + "\\WEB-INF\\resources\\product_images\\" + urun.getUrunId() + ".png");


        if (urunResim != null && !urunResim.isEmpty()) {
            try {
                urunResim.transferTo(new File(path.toString()));

            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Ürün resmi kaydedilemedi", e);

            }

        }


        return "redirect:/admin/urunEnvanter";


    }

    @RequestMapping("/admin/urunEnvanter/urunSil/{id}")
    public String urunSil(@PathVariable String id, Model model, HttpServletRequest request) {
        String rootDir = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDir + "\\WEB-INF\\resources\\product_images\\" + id + ".png");
        if (Files.exists(path)) {
            try {
                Files.delete(path);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


        urunDao.urunSil(id);


        return "redirect:/admin/urunEnvanter";

    }

    @RequestMapping("admin/urunEnvanter/urunDuzenle/{id}")
    public String urunDuzenle(@PathVariable("id") String id, Model model) {
        Urun urun = urunDao.getUrunById(id);

        model.addAttribute(urun);

        return "urunDuzenle";

    }

    @RequestMapping(value = "/admin/urunEnvanter/urunDuzenle", method = RequestMethod.POST)
    public String urunDuzenle(@Valid @ModelAttribute("urun") Urun urun, BindingResult result, Model model, HttpServletRequest request) {
        if (result.hasErrors()) {
            return "urunDuzenle";

        }

        MultipartFile urunResim = urun.getUrunResim();
        String rootDir = request.getSession().getServletContext().getRealPath("/");
        path = Paths.get(rootDir + "\\WEB-INF\\resources\\product_images\\" + urun.getUrunId() + ".png");


        if (urunResim != null && !urunResim.isEmpty()) {
            try {
                urunResim.transferTo(new File(path.toString()));
            } catch (Exception e) {
                throw new RuntimeException("Urun resmi kaydedilemedi", e);

            }


        }

        urunDao.urunDuzenle(urun);

        return "redirect:/admin/urunEnvanter";

    }


}
