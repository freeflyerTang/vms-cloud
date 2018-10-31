package com.beisun.vmscloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Carol Tang
 * @version 1.0.0
 * @date 2018-09-27 15:07
 * @description swagger2配置类
 **/
@Configuration //Spring来加载该类配置
@EnableSwagger2 //启用Swagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) //创建该Api的基本信息（这些基本信息会展现在文档页面中）
                .select() //用来控制哪些接口暴露给Swagger来展现
                .apis(RequestHandlerSelectors.basePackage("com.beisun.vmscloud.controller"))// 扫描该包下的所有需要在Swagger中展示的API，@ApiIgnore注解标注的除外
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {// 创建API的基本信息，这些信息会在Swagger UI中进行显示
        return new ApiInfoBuilder()
                .title("VMS单证管理平台 - BillCheckJHK API接口")
                .description("BillCheckJHK-单证核销接口(激活卡)")
                .version("v1.0.0")
                .build();
    }

}
