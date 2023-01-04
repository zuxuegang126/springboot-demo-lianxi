package com.renhe.controller;

import com.renhe.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class GuestController {
    @Autowired
    GuestService guestService;
    @RequestMapping("/Guest" )
    public String  getGuestList(Model model){
        model.addAttribute( "guestList",guestService.getGuestList());
        return "GuestList";
    }
}
