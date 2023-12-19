package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
// import java.util.Date;


@Model(adaptables = Resource.class,adapters = Author.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AuthorImpl implements Author{
    @ValueMapValue
    @Required
    @Default(values = "user value")
    String firstname;
    @ValueMapValue
    @Default(values = "lastname")
    String lastname;
    @ValueMapValue
    boolean status;



    @PostConstruct
    public void init(){

    }


    @Override
    public String firstname() {
        return firstname;
    }

    @Override
    public String lastname() {
        return lastname;
    }

    @Override
    public boolean status() {
        return status;
    }
}
