package ${package}.infrastructure.out;

import ${package}.infrastructure.dao.${entity}Dao;
import ${package}.infrastructure.mapper.${entity}InfrastructureMapper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import ${package}.domain.model.${entity};
import ${package}.domain.port.out.${entity}RemotePort;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ${entity}Out implements ${entity}RemotePort {

    private final WebClient webClient;
    private final ${entity}InfrastructureMapper mapper;

    @Value("${webclient.base-url}")
    private String baseUrl;

    @Value("${webclient.path}")
    private String path;

    public ${entity}Out(WebClient webClient, ${entity}InfrastructureMapper mapper) {
        this.webClient = webClient;
        this.mapper = mapper;
    }

    @Override
    public ${entity} get${entity}ById(String id) {

        log.trace("Infrastructure | Get ${entity} By Id | Id {}", id);

        WebClient client = webClient.mutate()
                .baseUrl(baseUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();

        String uri = UriComponentsBuilder.newInstance()
                .path(path)
                .buildAndExpand(id)
                .toUriString();

        ${entity}Dao ${entity.substring(0, 1).toLowerCase()}${entity.substring(1)}Dao = client
                .method(HttpMethod.GET)
                .uri(uri).retrieve()
                .bodyToMono(${entity}Dao.class)
                .block();

        return mapper.to${entity}(${entity.substring(0, 1).toLowerCase()}${entity.substring(1)}Dao);
    }
}