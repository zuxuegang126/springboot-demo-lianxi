package com.renhe.mapper;

import com.renhe.model.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper//@Mapper//可以找到对应的mapper
public interface GuestMapper {
      @Select("select name,position from guest")
      List<Guest> getGuestList();
}
