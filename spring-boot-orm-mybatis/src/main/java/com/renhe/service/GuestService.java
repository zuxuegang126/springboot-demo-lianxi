package com.renhe.service;

import com.renhe.mapper.GuestMapper;
import com.renhe.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
   @Autowired(required = true)
   GuestMapper guestMapper;
   public List<Guest> getGuestList(){

       return  guestMapper.getGuestList();
   }
}
