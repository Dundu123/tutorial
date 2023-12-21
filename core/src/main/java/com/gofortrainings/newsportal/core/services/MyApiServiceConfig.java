package com.gofortrainings.newsportal.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;

// MyApiServiceConfig.java
@Designate(ocd = MyApiServiceConfig.Configuration.class)
public @interface  MyApiServiceConfig {
    @AttributeDefinition(name = "API URL", description = "URL of the RESTful API")
    String apiUrl() default "https://api.restful-api.dev/objects";

    @interface Configuration {
        @AttributeDefinition(name = "API URL", description = "URL of the RESTful API")
        String apiUrl() default "https://api.restful-api.dev/objects";
    }
}
