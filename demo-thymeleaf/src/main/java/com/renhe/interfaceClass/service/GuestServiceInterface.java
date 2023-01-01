package com.renhe.interfaceClass.service;

import com.renhe.bean.Guest;

import java.util.List;

public interface GuestServiceInterface {
    List<Guest> getGuestList();
    void addGuest(Guest guest);
    void updataGuest(Guest guest);
    void deleeGuest(String name);
    Guest get(String name);
}
