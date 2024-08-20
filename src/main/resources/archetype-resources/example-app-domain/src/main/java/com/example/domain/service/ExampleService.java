package com.example.domain.service;

import com.example.domain.mapper.ExampleDomainMapper;
import com.example.domain.model.Example;
import com.example.domain.port.in.ExampleServicePort;
import com.example.domain.port.out.ExampleRemotePort;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExampleService implements ExampleServicePort {

    private final ExampleRemotePort exampleRemotePort;
    private final ExampleDomainMapper mapper;

    public Example getExampleById(String id) {
        log.trace("Domain | Get Example By ID | Id {}", id);

        Example example = exampleRemotePort.getExampleById(id);

        mapper.enrichExample(example, "New Example");
        return example;
    }
}