package com.gofortrainings.newsportal.core.models;

import com.fasterxml.jackson.databind.JsonNode;
import org.apache.sling.models.annotations.Exporter;

@Exporter(
    name = "json",
    extensions = "json",
    selector = "article"

)
public interface ArticleDetailsJsonExporter {
    JsonNode exportToJson();
}
