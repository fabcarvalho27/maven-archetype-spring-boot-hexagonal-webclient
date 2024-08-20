package com.example.application.api;

import com.example.application.dto.ExampleResDto;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;

/**
 * This Controller Api should represent all the endpoint of the Example Controller.
 * @author Fábio Carvalho
 */
@RequestMapping(path = "/example", produces = MediaType.APPLICATION_JSON_VALUE)
public interface ExampleApi {

    /**
     * @param id the id to be searched
     * @return ExampleResDto
     */
    @Operation(description = "This API allows to get Example by ID.")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ExampleResDto getExampleById(final String id);
}
