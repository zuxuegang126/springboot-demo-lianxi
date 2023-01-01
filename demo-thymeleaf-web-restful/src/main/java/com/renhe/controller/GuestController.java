package com.renhe.controller;
import com.renhe.bean.Guest;
import com.renhe.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/Guest")
public class GuestController {
    @Autowired
    GuestService  guestService;
    private String path="/Guest";
    @GetMapping
    public String getGuestList(Model model){

        List<Guest> guestList=guestService.getGuestList();
        model.addAttribute("guestList",guestList);
        return "GuestList";
    }
    @GetMapping("ToAddGuest")
    public String ToAddGuest(){
        return "AddGuest";
    }

    @PostMapping
    public String addGuest(Guest guest){
        guestService.addGuest(guest);
        return "redirect:/Guest";
    }

    @GetMapping("ToUpdataGuest")
    public String ToUpdataGuest( Model model, String name){
        Guest guest=guestService.get(name);
        model.addAttribute("guest",guest);
        return "UpdataGuest";
    }
    @PostMapping("updataGuest")
    public String updataGuest(Guest guest){
        guestService.updataGuest(guest);
        return "redirect:/Guest";
    }
    @GetMapping("ToDeleteGuest")
    public String toDeleteGuest(String name){
        guestService.deleeGuest(name);
        return "redirect:/Guest";
    }
    @GetMapping ("ToQueryGuest")
    public String toQueryGuest(){
        return "QueryGuest";
    }
    @PostMapping("QueryGuest")
    public String queryGuest(Model model,Guest guest){

        model.addAttribute("guest", guestService.queryGuest(guest));
        return "resultQueryGuest";
    }
}
