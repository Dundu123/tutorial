package com.gofortrainings.newsportal.core.services.impl;

import com.gofortrainings.newsportal.core.services.ArticleServer;
import com.gofortrainings.newsportal.core.services.ArticleservieConfig;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


@Component(service = ArticleServer.class,
        name = "ArticleIMPL",
        enabled = true,
        immediate = true)
@Designate(ocd = ArticleservieConfig.class)
public class ArticleServiceImpl implements ArticleServer {

    private static final Logger LOG = LoggerFactory.getLogger(ArticleServiceImpl.class);
    ArticleservieConfig config;
    @Activate
    public void active(ArticleservieConfig config) throws IOException {
        LOG.info("Active method in articelserviceimpl");
        this.config = config;
        getuserdetails(1);
        getuserinfo("employees");
    }

    @Deactivate
    public void deactive(ArticleservieConfig config){
        LOG.info("deactive method in articelserviceimpl");
    }

    @Modified
    public void modified(ArticleservieConfig config){
        LOG.info("modified method in articleserviceimpl");
        this.config = config;
    }

    @Override
    public String getuserdetails(int pageid) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String result = null;

        try {

            HttpGet request = new HttpGet(config.user_rest_url()+pageid);

            CloseableHttpResponse response = httpClient.execute(request);

            try {

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    // return it as a String
                    result = EntityUtils.toString(entity);
                    LOG.info("Articleserviceimpl restapi{}",result);
                }

            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }

        return result;
    }

    @Override
    public String getuserinfo(String pageName) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String result = null;

        try {

            HttpGet request = new HttpGet(config.user_list_rest_url()+pageName);

            CloseableHttpResponse response = httpClient.execute(request);

            try {

                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    // return it as a String
                    result = EntityUtils.toString(entity);
                    LOG.info("Articleserviceimpl restapi{}",result);
                }

            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }

        return result;
    }



}
