package com.home.milord.App.beans;

import com.home.milord.App.configuration.ReadProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class TestBean {

    @Autowired
    private ReadProperties rp;

   public String getHello(){
     return rp.getTemp();
    }
}
