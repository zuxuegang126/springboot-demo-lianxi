package com.renhe.service;

import com.renhe.bean.Guest;
import com.renhe.mapper.GuestDao;
import com.renhe.interfaceClass.service.GuestServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestService implements GuestServiceInterface {
    @Autowired
    GuestDao guestDao;
    @Override
    public List<Guest> getGuestList() {
        GuestDao guestDao=new GuestDao();

        return guestDao.getGuestList();
    }

    @Override
    public void addGuest(Guest guest) {
         guestDao.addGuest(guest);
    }

    @Override
    public void updataGuest(Guest guest) {
        guestDao.updataGuest(guest);
    }

    @Override
    public void deleeGuest(String name) {
        guestDao.deleteGuest(name);
    }

    @Override
    public Guest get(String name) {
        return guestDao.get(name);
    }


}
