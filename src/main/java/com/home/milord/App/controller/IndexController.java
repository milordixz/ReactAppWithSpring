package com.home.milord.App.controller;


import com.home.milord.App.beans.TestBean;
import com.home.milord.App.configuration.ReadProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

//    @Autowired
//    private TestBean testBean;
//
//    @Autowired
//    private ReadProperties rp;
//
//    @Value("${test}")
//    private String testProp;
//
//    private String getString(){
//        return "asdsadsadasd";
//    }


    @RequestMapping("/")
    public String greeting() {
        return "index";
    }

//    @RequestMapping("/prop")
//    public String test(){
//        return getString();
//    }
//
//    @RequestMapping("/myprop")
//    public String getMyProp(){
//        return rp.getTemp();
//    }

}