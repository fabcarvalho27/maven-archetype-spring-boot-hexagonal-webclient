package ${package}.application.api;

import ${package}.application.dto.${entity}Dto;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;

/**
 * This Controller Api should represent all the endpoint of the ${entity} Controller.
 * @author Fábio Carvalho
 */
@RequestMapping(path = "/${entity.substring(0, 1).toLowerCase()}${entity.substring(1)}", produces = MediaType.APPLICATION_JSON_VALUE)
public interface ${entity}Api {

    /**
     * @param id of ${entity} to GET
     * @return ${entity}Dto
     */
    @Operation(description = "This API allows to get ${entity} by id.")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    ${entity}Dto get${entity}ById(final String id);
}
