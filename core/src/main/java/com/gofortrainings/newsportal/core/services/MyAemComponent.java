package com.gofortrainings.newsportal.core.services;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import com.gofortrainings.newsportal.core.services.MyApiService;
import com.gofortrainings.newsportal.core.services.MyObject;

import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MyAemComponent {

    @Inject
    private MyApiService myApiService;

    // This annotation is used to adapt the current resource (page) to the MyAemComponent model.
    @SlingObject
    private Resource currentResource;

    public List<MyObject> getObjects() {
        // Assuming you have a method in your MyApiService to get the objects.
        return myApiService.getObjects();
    }
}
