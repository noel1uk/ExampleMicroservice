package com.intro.returnjson.controllers;

import com.intro.returnjson.model.ExampleObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="some-json")
public class ExampleController {

    @Value("${example.property}")
    private String mu;

    @RequestMapping(value = "mu", method = RequestMethod.GET)
    public ExampleObject getExample() {
        return new ExampleObject()
                .withId("1")
                .withOrganisation(mu)
                .withPrice("£1");
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public ExampleObject getPathVariables(
            @PathVariable("id") String id) {
        return new ExampleObject()
                .withId(id)
                .withOrganisation("soo")
                .withPrice("£10");
    }
}
