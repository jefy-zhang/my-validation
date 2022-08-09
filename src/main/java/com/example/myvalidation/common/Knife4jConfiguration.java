package com.example.myvalidation.common;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class Knife4jConfiguration {

        @Bean
        public Docket defaultApi3() {
                return new Docket(DocumentationType.OAS_30)
                                .apiInfo(new ApiInfoBuilder()
                                                .title("jefy的接口文档")
                                                .description("欢迎使用jefy的接口文档")
                                                .termsOfServiceUrl("https://www.baidu.com/")
                                                .contact(new Contact("jefy_zhang", "https://www.baidu.com/", "fzqxt@qq.com"))
                                                .version("1.0")
                                                .build())
                                //分组名称
                                .groupName("3.X版本")
                                .select()                                
                                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                                .paths(PathSelectors.any())
                                .build();
        }
}
