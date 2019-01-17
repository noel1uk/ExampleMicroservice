package com.intro.returnjson.services;

import com.intro.returnjson.Config.ServiceConfig;
import com.intro.returnjson.model.Example;
import com.intro.returnjson.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    @Autowired
    ServiceConfig config;

    public Example getExample(String organisationId, String exampleId) {
        Example example = exampleRepository.findByOrganisationIdAndExampleId(organisationId, exampleId);
        return  example.withComment(config.getExampleProperty());
    }

    public List<Example> getExamplesByOrg(String organisationId) {
        return exampleRepository.findByOrganisationId(organisationId);
    }

    public void saveExample(Example example) {
        example.withId(UUID.randomUUID().toString());

        exampleRepository.save(example);
    }

    public void updateExample(Example example) { exampleRepository.save(example); }

    public void deleteExample(Example example) { exampleRepository.deleteById(example.getExampleId());}
}
