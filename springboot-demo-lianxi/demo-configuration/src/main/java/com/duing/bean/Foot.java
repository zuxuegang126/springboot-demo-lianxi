package com.duing.bean;

public class Foot {//数据最终接收类
    private String rice;
    private String meat;
    public Foot(String rice, String meat) {
        this.rice = rice;
        this.meat = meat;
    }

    public Foot() {
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
