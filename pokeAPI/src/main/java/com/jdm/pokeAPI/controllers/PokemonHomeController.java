/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdm.pokeAPI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Joe McAdams
 * @email joedmcadams@gmail.com
 * 
 */
@Controller
public class PokemonHomeController {
    
    @GetMapping("home")
    public String home(){
        return "home";
    }
}
