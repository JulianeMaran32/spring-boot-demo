package com.example.demo.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Demo")
@OpenAPIDefinition(
    info = @Info(title = "Exemplo", description = "Exemplo de aplicação", version = "1.0.0"),
    servers = @Server(url = "http://localhost:8080/api")
)
@RestController
@RequestMapping(value = "/demo", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class DemoController {

    @Operation(summary = "Método de exemplo")
    @GetMapping
    public String demoExemplo() {
        return "Demo";
    }
}
