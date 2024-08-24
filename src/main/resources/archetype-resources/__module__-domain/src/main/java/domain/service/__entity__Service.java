package ${package}.domain.service;

import ${package}.domain.mapper.${entity}DomainMapper;
import ${package}.domain.model.${entity};
import ${package}.domain.port.in.${entity}ServicePort;
import ${package}.domain.port.out.${entity}RemotePort;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ${entity}Service implements ${entity}ServicePort {

    private final ${entity}RemotePort ${entity.substring(0, 1).toLowerCase()}${entity.substring(1)}RemotePort;
    private final ${entity}DomainMapper mapper;

    public ${entity} get${entity}ById(String id) {
        log.trace("Domain | Get ${entity} By Id | Id {}", id);

        return ${entity.substring(0, 1).toLowerCase()}${entity.substring(1)}RemotePort.get${entity}ById(id);
    }
}