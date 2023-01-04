package com.renhe.service;

import com.renhe.model.Guest;
import com.renhe.tk.mapper.TkGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
     TkGuestMapper tkGuestMapper;
    public List<Guest> getGuestList(){

        return tkGuestMapper.selectAll();
    }
}
