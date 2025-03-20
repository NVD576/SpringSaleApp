/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author admin
 */@Controller
 
public class IndexController {
     @RequestMapping("/")
    public String index(Model model){
        
        model.addAttribute("msg", "xin chao ou");
        String[] cates={"Mobile", "Laptop"};
        model.addAttribute("categories", cates);
        return "index";
    }
}
