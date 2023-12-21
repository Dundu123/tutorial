package com.gofortrainings.newsportal.core.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

// MyApiService.java
@Component(service = MyApiService.class, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class MyApiService {

    @Reference
    private MyApiServiceConfig config;

    public List<MyObject> getObjects() {
        String apiUrl = config.apiUrl();

        // Initialize an HTTP client (you may need to handle exceptions)
        HttpClient httpClient = HttpClients.createDefault();

        // Prepare an HTTP GET request to the API URL
        HttpGet httpGet = new HttpGet(apiUrl);

        try {
            // Execute the HTTP request and get the response
            HttpResponse response = httpClient.execute(httpGet);

            // Check if the response status is OK (200)
            if (response.getStatusLine().getStatusCode() == 200) {
                // Parse the JSON response and convert it to a list of MyObject
                ObjectMapper objectMapper = new ObjectMapper();
                return objectMapper.readValue(response.getEntity().getContent(), new TypeReference<List<MyObject>>() {});
            } else {
                // Handle non-OK response, e.g., log an error
                System.err.println("Error: " + response.getStatusLine().getReasonPhrase());
            }
        } catch (IOException e) {
            // Handle IO exceptions, e.g., log an error
            e.printStackTrace();
        }

        // Return an empty list if there was an error
        return new ArrayList<>();
    }
}
