package com.renhe.controller;

import com.renhe.bean.Guest;
import com.renhe.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GuestController {
    @Autowired//自动注入不能用于局部变量，不能再放放里面写
    GuestService guestService;


    @RequestMapping("/Guest/GuestList")
    public String getGuestList(Model model){

         List<Guest> guestList=guestService.getGuestList();
        model.addAttribute("guestList",guestList);
        return "GuestList";
    }
    @RequestMapping("/Guest/ToAddGuest")
    public String ToAddGuest(){
        return "AddGuest";
    }

    @RequestMapping("/Guest/AddGuest")
    public String addGuest(Guest guest){
        guestService.addGuest(guest);
        return "redirect:/Guest/GuestList";
    }
    @RequestMapping("/Guest/ToUpdataGuest")
    public String ToUpdataGuest( Model model, String name){
        Guest guest=guestService.get(name);
        model.addAttribute("guest",guest);
        return "UpdataGuest";
    }
    @RequestMapping("/Guest/UpdataGuest")
    public String updataGuest(Guest guest){
        guestService.updataGuest(guest);
        return "redirect:/Guest/GuestList";
    }
    @RequestMapping("/Guest/ToDeleteGuest")
    public String toDeleteGuest(Model model,String name){
        guestService.deleeGuest(name);
        return "redirect:/Guest/GuestList";
    }
}
