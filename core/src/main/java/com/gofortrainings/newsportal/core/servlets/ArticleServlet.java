package com.gofortrainings.newsportal.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component(service = Servlet.class)
@SlingServletPaths("/bin/content/services/author")
@SlingServletResourceTypes(resourceTypes = {"newsportal/services/author"}, extensions = {"json", "txt"}, methods = {"GET", "POST", "PUT", "DELETE"}, selectors = {"author"})
public class ArticleServlet extends SlingAllMethodsServlet {
    private final Logger log = LoggerFactory.getLogger(ArticleServlet.class);

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        String userid = request.getParameter("userid");

        ResourceResolver resolver = request.getResourceResolver();
        Resource resource = resolver.getResource("/content/author/" + userid);
        if (resource != null) {
            ValueMap prop = resource.getValueMap();
            String firstname = prop.get("firstname").toString();
            String lastname = prop.get("lastname", String.class);
            response.getWriter().write("This is for Articleservlet do GET response " + firstname + " " + lastname);
        }
    }

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        String userid = request.getParameter("userid");
        ResourceResolver resolver = request.getResourceResolver();
        Resource resource = resolver.getResource("/content/author/" + userid);
        if (resource == null) {
            Resource userResource = resolver.getResource("/content/author");

            Map<String, Object> properties = new HashMap<>();

            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            if (firstname != null) {
                properties.put("firstname", firstname);
            }
            if (lastname != null) {
                properties.put("lastname", lastname);
            }
            resolver.create(userResource, userid, properties);
            response.getWriter().write("This is for Articleservlet do POST response");
            resolver.commit();
        }

    }

    @Override
    protected void doPut(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        String userid = request.getParameter("userid");

        ResourceResolver resolver = request.getResourceResolver();
        Resource resource = resolver.getResource("/content/author/" + userid);
        if (resource != null) {
            ModifiableValueMap mprop = resource.adaptTo(ModifiableValueMap.class);
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");

            if (firstname != null) {
                mprop.put("firstname", firstname);
            }
            if (lastname != null) {
                mprop.put("lastname", lastname);
            }
            response.getWriter().write("This is for Articleservlet do PUT response" + firstname + " " + lastname);
            resolver.commit();

        }
    }

    @Override
    protected void doDelete(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        String userid = request.getParameter("userid");

        ResourceResolver resolver = request.getResourceResolver();
        Resource resource = resolver.getResource("/content/author/" + userid);

        if (resource != null) {
            resolver.delete(resource);
            response.getWriter().write("This is for Articleservlet do DELETE response");
            resolver.commit();

        }
    }
}
