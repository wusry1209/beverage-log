package com.usry.beveragelog.controllers;

import com.usry.beveragelog.DrinkData;
import com.usry.beveragelog.forms.Drink;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class DrinkController {
    
    //home page
    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title","Home");
        return "index";
    }
    //add drink page
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("title", "Liquor Log");
        return "add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute Drink newDrink) {
        DrinkData.add(newDrink);
        return "redirect:";
    }

    // list drinks page

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public  String list(Model model){
        model.addAttribute("drink", DrinkData.getAll());
        model.addAttribute("title", "Your Drinks");
        return "list";
    }
}
