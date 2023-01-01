package com.renhe.mapper;

import com.renhe.bean.Guest;
import com.renhe.interfaceClass.dao.GuestDaoInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class GuestDao implements GuestDaoInterface {
    @Override
    public List<Guest> getGuestList() {
        return guestList;
    }


    @Override
    public void addGuest(Guest guest) {
         guestList.add(guest);

    }

    @Override
    public void updataGuest(Guest guest) {
        Guest oldGuest=this.get(guest.getName());
        oldGuest.setPosition(guest.getPosition());
    }
    public void deleteGuest(String name){
        Guest oldGuest=this.get(name);
        guestList.remove(oldGuest);
    }

    static List<Guest> guestList=new ArrayList<Guest>();
    static {
        guestList.add(new Guest("张三","董事长"));
        guestList.add(new Guest("李四","首席执行官"));
        guestList.add(new Guest("王二麻子","总经理"));
        guestList.add(new Guest("周琦","副总经理"));
    }
    public Guest get(String name){
        for (Guest guest:guestList
             ) {
            if(guest.getName().equals(name)){
                return guest;
            }
        }
        return new Guest("","");
    }

}
