package ${package}.application.controller;

import ${package}.application.api.${entity}Api;
import ${package}.application.dto.${entity}Dto;
import ${package}.application.mapper.${entity}ApplicationMapper;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ${package}.domain.model.${entity};
import ${package}.domain.port.in.${entity}ServicePort;
import lombok.RequiredArgsConstructor;

@CrossOrigin(maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class ${entity}Controller implements ${entity}Api {
    private final ${entity}ServicePort ${entity.substring(0, 1).toLowerCase()}${entity.substring(1)}ServicePort;
    private final ${entity}ApplicationMapper mapper;

    @Override
    @GetMapping("/{id}")
    public ${entity}Dto get${entity}ById(@PathVariable String id) {

        ${entity} ${entity.substring(0, 1).toLowerCase()}${entity.substring(1)} = ${entity.substring(0, 1).toLowerCase()}${entity.substring(1)}ServicePort.get${entity}ById(id);

        return mapper.from${entity}(${entity.substring(0, 1).toLowerCase()}${entity.substring(1)});
    }
}