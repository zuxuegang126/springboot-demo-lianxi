package com.duing.controller;

import com.duing.bean.Foot;
import com.duing.bean.Vegetables;
import com.duing.cofig.FootConfig;
import com.duing.cofig.VegetableConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//说明此类所有方法都是以json格式做响应，不再是以视图即以html或jsp的后缀响应回浏览器的，@Controller是默认所有方法都以视图即以html或jsp为后缀响应回浏览器
public class JsonController {

    @Autowired//自动注入
     FootConfig footConfig;

    @Autowired
    VegetableConfig vegetableConfig;

    @Value("${foot.rice}")//@Value("${foot.rice}")获得配置文件application.properties中foot.rice的值,并且赋给JsonController类的属性rice
    private String rice;

    @Value("${tttt.goog}")//@Value("${foot.meat}")获得配置文件application.properties中foot.rice的值,并且赋给JsonController类的属性rice
    private String meat;

    @RequestMapping("/footJsonproperties")
    public Foot footJsonProperties(){//把对象以JSON形式响应回浏览器
        return new Foot(rice,meat);//把JsonController类的属性值给foot对象对应的属性
    }

    @RequestMapping("/v")
    public String json() {
        return "json   oooooo";
    }

    @RequestMapping("/footJson")
    public Foot footJson(){//把对象以JSON形式响应回浏览器
       return new Foot("拌饭","烤肉");
    }

    @RequestMapping("/footJsonObject")
    public Foot footJsonObject(){//把对象以JSON形式响应回浏览器
        return new Foot(footConfig.getRice(),footConfig.getMeat());
    }

    @RequestMapping("/getFootConfigJsonObject")
    public FootConfig getFootConfigJsonObject(){//把对象以JSON形式响应回浏览器
        return footConfig;
    }

    @RequestMapping("/getVegetablesJsonObject")
    public Vegetables getVegetablesJsonObject(){
        Vegetables vegetables=new Vegetables();
        vegetables.setEgg(vegetableConfig.getEgg());
        vegetables.setName(vegetableConfig.getName());
        return vegetables;
    }
}
