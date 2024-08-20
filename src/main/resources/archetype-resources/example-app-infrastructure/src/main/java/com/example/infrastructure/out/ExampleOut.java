package com.example.infrastructure.out;

import com.example.infrastructure.dao.ExampleDao;
import com.example.infrastructure.mapper.ExampleInfrastructureMapper;

import org.springframework.stereotype.Service;

import com.example.domain.model.Example;
import com.example.domain.port.out.ExampleRemotePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ExampleOut implements ExampleRemotePort {

    //private final WebClientHandler webClientHandler;
    private final ExampleInfrastructureMapper mapper;

    @Override
    public Example getExampleById(String id) {

        log.trace("Infrastructure | Get Example By ID | Id {}", id);
        ExampleDao exampleDao = new ExampleDao();
        exampleDao.setId(id);

        return mapper.toExample(exampleDao);
    }
}