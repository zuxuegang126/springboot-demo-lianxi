package com.renhe.service;

import com.renhe.modl.Guest;
import com.renhe.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    private GuestRepository guestRepository;
    public List<Guest> getGuestList(){
        return guestRepository.findAll();
    }
}
