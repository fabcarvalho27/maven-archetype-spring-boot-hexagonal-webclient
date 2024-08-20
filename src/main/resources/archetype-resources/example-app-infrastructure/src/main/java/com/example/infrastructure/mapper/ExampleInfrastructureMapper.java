package com.example.infrastructure.mapper;

import com.example.infrastructure.dao.ExampleDao;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.domain.model.Example;

@Mapper(componentModel = "spring")
public interface ExampleInfrastructureMapper {

    @Mapping(target = ".", source = ".")
    Example toExample(ExampleDao exampleDao);

}