package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(adaptables = {Resource.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Articledetails {
    @ValueMapValue
    private String text;

    @ValueMapValue
    private String image;

    @ValueMapValue
    private String desc;

    // Fields to store the default values
    private String defaultText = "Default Text";
    private String defaultImage = "/content/dam/wknd-shared/en/adventures/cycling-southern-utah/adobestock-185324648.jpg";
    private String defaultDesc = "Default Description";

    @PostConstruct
    protected void init() {
        // Check if 'text' property is null or empty and set the default value if needed
        if (text == null || text.isEmpty()) {
            text = defaultText;
        }

        // Check if 'image' property is null or empty and set the default value if needed
        if (image == null || image.isEmpty()) {
            image = defaultImage;
        }

        // Check if 'desc' property is null or empty and set the default value if needed
        if (desc == null || desc.isEmpty()) {
            desc = defaultDesc;
        }
    }

    // Getter methods for your fields
    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }

    public String getDesc() {
        return desc;
    }
}
