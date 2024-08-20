package com.example.domain.mapper;

import com.example.domain.model.Example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ExampleDomainMapper {

    @Mapping(target = "name", source = ".")
    void enrichExample(@MappingTarget Example example, String name);

}