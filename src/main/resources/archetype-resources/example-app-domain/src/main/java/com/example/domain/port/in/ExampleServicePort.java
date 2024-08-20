package com.example.domain.port.in;

import com.example.domain.model.Example;

public interface ExampleServicePort {

    Example getExampleById(String id);
}