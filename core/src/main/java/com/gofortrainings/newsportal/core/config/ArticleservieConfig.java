package com.gofortrainings.newsportal.core.services;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition
public @interface ArticleservieConfig {

    @AttributeDefinition(name = "userresturl",
            description = " user rest url",
            required = true,
            type = AttributeType.STRING)
    String user_rest_url() default "https://dummy.restapiexample.com/api/v1/employee/1";

    @AttributeDefinition(name = "user list rest url",
            description = " user list rest url",
            required = true,
            type = AttributeType.STRING)
    String user_list_rest_url() default "https://dummy.restapiexample.com/api/v1/employee/";
}
