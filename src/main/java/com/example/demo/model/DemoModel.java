package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DemoModel {

    @Schema(description = "ID",
            example = "1",
            type = "Long")
    @JsonProperty
    private Long id;

    @Schema(description = "Nome",
            example = "João da Silva",
            type = "String")
    @JsonProperty
    private String nome;
}
