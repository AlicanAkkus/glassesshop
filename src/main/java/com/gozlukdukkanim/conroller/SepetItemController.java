package com.gozlukdukkanim.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by memoricAb on 22.01.2017.
 */
@Controller
@RequestMapping("/sepet")
public class SepetItemController {

    @RequestMapping
    public String get(HttpServletRequest request) {

        return "redirect:/sepet/" + request.getSession(true).getId();

    }
    @RequestMapping(value = "/{sepetId}",method = RequestMethod.GET)
    public String getSepet(@PathVariable(value = "sepetId")String sepetId, Model model){
        model.addAttribute("sepetId",sepetId);


        return "sepet";


    }

}
