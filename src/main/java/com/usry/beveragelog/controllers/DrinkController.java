package com.usry.beveragelog.controllers;

import com.usry.beveragelog.forms.Drink;
import com.usry.beveragelog.models.DrinkDao;
import com.usry.beveragelog.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;


@Controller
public class DrinkController {

    @Autowired
    private DrinkDao drinkDao;

    //home page
    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title","Home");
        return "index";
    }
    //add drink page
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddDrinkForm(Model model) {
        model.addAttribute("title", "Liquor Log");
        model.addAttribute(new Drink());
        return "add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddDrinkForm(@ModelAttribute @Valid Drink newDrink) {
        drinkDao.save(newDrink);
        return "redirect:";
    }

    // list drinks page

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public  String list(Model model){
        model.addAttribute("drinks", drinkDao.findAll());
        model.addAttribute("title", "Your Drinks");
        return "list";
    }

    //register
    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String displayRegisterForm(Model model) {
        model.addAttribute("title","Login");

        return "Login";
    }
}
