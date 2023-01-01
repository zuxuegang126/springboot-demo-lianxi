package com.renhe.service;

import com.renhe.bean.Guest;
import com.renhe.dao.GuestDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    GuestDao guestDao;

    public List<Guest> getGuestList() {
        GuestDao guestDao=new GuestDao();

        return guestDao.getGuestList();
    }


    public void addGuest(Guest guest) {
         guestDao.addGuest(guest);
    }


    public void updataGuest(Guest guest) {
        guestDao.updataGuest(guest);
    }


    public void deleeGuest(String name) {
        guestDao.deleteGuest(name);
    }


    public Guest get(String name) {
        return guestDao.get(name);
    }
    public Guest queryGuest( Guest guest){return guestDao.queryGuest(guest);};


}
