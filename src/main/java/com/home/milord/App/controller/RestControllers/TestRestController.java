package com.home.milord.App.controller.RestControllers;

import com.fasterxml.jackson.annotation.JsonView;
import com.home.milord.App.beans.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @Autowired
    private TestBean testBean;


    @RequestMapping(value = "/api/hello", method = RequestMethod.GET, produces = "application/json")
    @JsonView
    public String greeting() {
        return testBean.getHello();
    }

}
