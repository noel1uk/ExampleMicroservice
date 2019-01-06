package com.intro.returnjson.controllers;

import com.intro.returnjson.model.ExampleObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="some-json")
public class ExampleController {

    @RequestMapping(method = RequestMethod.GET)
    public ExampleObject getExample() {
        return new ExampleObject()
                .withId("1")
                .withOrganisation("foo")
                .withPrice("£1");
    }


}
