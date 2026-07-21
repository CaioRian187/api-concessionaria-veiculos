package com.api.concessionaria_veiculos.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Concessionária")
                                .version("1.0")
                                .description("Api focada em colocar em prática todos os conhecimentos sobre Back-end com Spring boot")
                );
    }
}
