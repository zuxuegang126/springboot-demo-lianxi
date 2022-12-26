package com.duing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//@Controller表是HelloWorld 为控制类，负责业务逻辑的分析、请求的分发、数据的组装、对浏览器的响应
public class HelloWorld {
    @RequestMapping("/hello")//请求与映射之间的关系，服务器接收到浏览器的请求，截取请求获得"/hello",通过映射找到 并执行利用反射自动public String hello()然后把返回值  "HelloWorld"响应给浏览器
    @ResponseBody// @ResponseBody表示返回的"HelloWorld"是josn格式的字符窜，@ResponseBody则是一个叫HelloWorld的视图即页面
    public String hello(){
        return "HelloWorld,hi会话大爱是记录";
    }
}
