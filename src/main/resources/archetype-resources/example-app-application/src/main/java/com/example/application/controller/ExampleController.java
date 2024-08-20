package com.example.application.controller;

import com.example.application.api.ExampleApi;
import com.example.application.dto.ExampleResDto;
import com.example.application.mapper.ExampleApplicationMapper;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.model.Example;
import com.example.domain.port.in.ExampleServicePort;
import lombok.RequiredArgsConstructor;

@CrossOrigin(maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class ExampleController implements ExampleApi {
    private final ExampleServicePort exampleServicePort;
    private final ExampleApplicationMapper mapper;

    @Override
    @GetMapping("/{id}")
    public ExampleResDto getExampleById(@PathVariable String id) {

        Example example = exampleServicePort.getExampleById(id);

        return mapper.fromExample(example);
    }
}