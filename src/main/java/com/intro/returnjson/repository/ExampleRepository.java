package com.intro.returnjson.repository;

import com.intro.returnjson.model.Example;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExampleRepository extends CrudRepository<Example,String> {
    public List<Example> findByOrganisationId(String organisationId);
    public Example findByOrganisationIdAndExampleId(String organisationId,String exampleId);
}
