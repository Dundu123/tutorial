
package com.gofortrainings.newsportal.core.servlets;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.WCMException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Iterator;

@Component(service = Servlet.class)
@SlingServletPaths("/bin/newsportal/content/pressrealsed")
@SlingServletResourceTypes(resourceTypes = "newsportal/services/author",extensions = {"json","txt"},methods = {"GET","POST","PUT","DELETE"},selectors = "press")
public class PressReleasedservlet extends SlingAllMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        ResourceResolver resolver = request.getResourceResolver();
        PageManager pageManager =  resolver.adaptTo(PageManager.class);
        Page articles = pageManager.getPage("/content/newsportal/us/en/userdetails");
        Iterator<Page> chidpages =  articles.listChildren();
        JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();
        while (chidpages.hasNext()){
            Page pages = chidpages.next();
            JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
            jsonObjectBuilder.add("title", pages.getTitle());
            jsonObjectBuilder.add("pagepath",pages.getPath());
            jsonArrayBuilder.add(jsonObjectBuilder);
        }
        response.getWriter().write(jsonArrayBuilder.build().toString());

    }

    @Override
    protected void doPost( SlingHttpServletRequest request,SlingHttpServletResponse response) throws ServletException, IOException {
        ResourceResolver resolver = request.getResourceResolver();
        PageManager pageManager =  resolver.adaptTo(PageManager.class);
        String pageTitle = request.getParameter("pageTitle");
        String pageName = request.getParameter("pageName");
        try {
            pageManager.create("/content/newsportal/us/en/userdetails",
                                pageName,
                            "/conf/newsportal/settings/wcm/templates/article-template-new",
                                pageTitle);
        } catch (WCMException e) {
            throw new RuntimeException(e);
        }
        response.getWriter().write("post method for press released");
    }

    @Override
    protected void doPut(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("put method for press released");

    }

    @Override
    protected void doDelete(SlingHttpServletRequest request,SlingHttpServletResponse response) throws ServletException, IOException {

        ResourceResolver resolver = request.getResourceResolver();
        PageManager pageManager =  resolver.adaptTo(PageManager.class);
        String pageName = request.getParameter("pageName");
        Page page = pageManager.getPage("/content/newsportal/us/en/userdetails/"+pageName);
        if(page != null){
            try {
                pageManager.delete(page,false);
            } catch (WCMException e) {
                throw new RuntimeException(e);
            }
        }
        response.getWriter().write("Delete method for press released");
    }
}