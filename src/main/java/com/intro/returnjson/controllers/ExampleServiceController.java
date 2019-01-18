package com.intro.returnjson.controllers;

import com.intro.returnjson.config.ServiceConfig;
import com.intro.returnjson.model.Example;
import com.intro.returnjson.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="v1/organisations/{organisationId}/examples")
public class ExampleServiceController {
    @Autowired
    private ExampleService exampleService;

    @Autowired
    private ServiceConfig serviceConfig;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Example> getExamples(@PathVariable("organisationId") String organisationId) {
        return exampleService.getExamplesByOrg(organisationId);
    }

    @RequestMapping(value= "/{exampleId}", method = RequestMethod.GET)
    public Example getExamples(@PathVariable("organisationId") String organisationId,
                               @PathVariable("exampleId") String exampleId) {
        return exampleService.getExample(organisationId, exampleId);
    }

    @RequestMapping(value="/{exampleId}", method = RequestMethod.PUT)
    public String updateExamples(@PathVariable("exampleId") String exampleID) {
        return String.format("This is the put");
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public void saveExamples(@RequestBody Example example) {
        exampleService.saveExample(example);
    }

    @RequestMapping(value="{exampleId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteExamples(@PathVariable("exampleId") String exampleId) {
        return String.format("This is the delete");
    }
}
