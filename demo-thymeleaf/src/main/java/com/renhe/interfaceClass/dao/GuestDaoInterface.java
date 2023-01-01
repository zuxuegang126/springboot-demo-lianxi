package com.renhe.interfaceClass.dao;

import com.renhe.bean.Guest;

import java.util.List;

public interface GuestDaoInterface {
    List<Guest> getGuestList();
    void addGuest(Guest guest);
    void updataGuest(Guest guest);
}
