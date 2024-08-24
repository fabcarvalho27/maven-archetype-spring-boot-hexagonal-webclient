package ${package}.application.mapper;

import ${package}.application.dto.${entity}Dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ${package}.domain.model.${entity};

@Mapper(componentModel = "spring")
public interface ${entity}ApplicationMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
            ${entity}Dto from${entity}(${entity} ${entity.substring(0, 1).toLowerCase()}${entity.substring(1)});
}