package com.example.domain.port.out;

import com.example.domain.model.Example;

public interface ExampleRemotePort {

    Example getExampleById(String id);

}