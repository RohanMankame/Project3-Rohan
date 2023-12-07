package com.rohan.maintanencemanagementsystem.controller;

import com.rohan.maintanencemanagementsystem.entity.ManTenent;
import com.rohan.maintanencemanagementsystem.service.ManTenentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ManController {

    private ManTenentService manTenentService;

    public ManController(ManTenentService manTenentService) {
        super();
        this.manTenentService=manTenentService;

    }

    //handeler method to handle list tenent and return mode view
    @GetMapping("/mantenents")
    public String listTenents(Model model){
        model.addAttribute("Mantenents", manTenentService.getAllTenents());
        return "redirect:/Man";
        //return null;
    }



    @GetMapping("/mantenents/new")
    public String createTenentForm(Model model){
        //create tenent obj to hold tenent from data
        ManTenent manTenent = new ManTenent();
        model.addAttribute("mantenents",manTenent);
        return "create_Mantenent";

    }
    @PostMapping("/mantenents")
    public String saveTenent(@ModelAttribute("mantenents") ManTenent manTenent){
        manTenentService.saveTenent(manTenent);
        return "redirect:/Man";

    }





}