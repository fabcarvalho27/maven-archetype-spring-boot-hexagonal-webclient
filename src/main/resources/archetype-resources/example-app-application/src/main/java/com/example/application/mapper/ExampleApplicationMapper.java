package com.example.application.mapper;

import com.example.application.dto.ExampleResDto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.domain.model.Example;

@Mapper(componentModel = "spring")
public interface ExampleApplicationMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    ExampleResDto fromExample(Example example);
}