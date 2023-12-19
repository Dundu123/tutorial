package com.gofortrainings.newsportal.core.models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;

@Model(
    adaptables = { Resource.class },
        resourceType = "newsportal/components/article-details",
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ArticledetailsModel implements ArticleDetailsJsonExporter {

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

    @Inject
    private ObjectMapper objectMapper;

    @Override
    public JsonNode exportToJson() {
        ObjectNode jsonNode = objectMapper.createObjectNode();
        jsonNode.put("text", text != null ? text : defaultText);
        jsonNode.put("image", image != null ? image : defaultImage);
        jsonNode.put("desc", desc != null ? desc : defaultDesc);
        return jsonNode;
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
