package ${package}.infrastructure.mapper;

import ${package}.infrastructure.dao.${entity}Dao;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import ${package}.domain.model.${entity};

@Mapper(componentModel = "spring")
public interface ${entity}InfrastructureMapper {

    @Mapping(target = ".", source = ".")
            ${entity} to${entity}(${entity}Dao ${entity.substring(0, 1).toLowerCase()}${entity.substring(1)}Dao);

}