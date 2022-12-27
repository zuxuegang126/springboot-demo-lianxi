package com.duing.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasypUtil {//加盐加密类
    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor=new BasicTextEncryptor();
        textEncryptor.setPassword("123456!@#");//加盐，盐"123456!@#"
        String username=textEncryptor.encrypt("root");//给"root"加密
        String password=textEncryptor.encrypt("root123456");
        System.out.println(username);
        System.out.println(password);
    }
}
