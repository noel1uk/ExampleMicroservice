package com.intro.returnjson.controllers;

import com.intro.returnjson.model.ExampleObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="some-json")
public class ExampleController {

//    @Autowired
//    private ExampleObject exampleObject;

    @RequestMapping(method = RequestMethod.GET)
    public ExampleObject getExample() {
        ExampleObject exampleObject = new ExampleObject();
        exampleObject.setId("1");
        exampleObject.setOrganisation("cats");
        exampleObject.setPrice("£1");
        return exampleObject;
    }


}
