package aidid.customer.product.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Customer and Product API")
                        .version("1.0")
                        .description("API documentation for managing customers and products"));
    }

    @Bean
    public GroupedOpenApi customerApi() {
        return GroupedOpenApi.builder()
                .group("customers")
                .pathsToMatch("/api/customers/**")
                .build();
    }

    @Bean
    public GroupedOpenApi productApi() {
        return GroupedOpenApi.builder()
                .group("products")
                .pathsToMatch("/api/products/**")
                .build();
    }
}