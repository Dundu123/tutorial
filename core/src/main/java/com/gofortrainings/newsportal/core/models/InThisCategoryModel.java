// package com.gofortrainings.newsportal.core.models;

// import org.apache.sling.api.SlingHttpServletRequest;
// import org.apache.sling.api.resource.Resource;
// import org.apache.sling.api.resource.ValueMap;
// import org.apache.sling.models.annotations.Model;
// import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
// import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

// import javax.annotation.PostConstruct;

// // @Model(adapters = {Resource.class, SlingHttpServletRequest.class})
// public class InThisCategoryModel {
//     @ValueMapValue
//     private String title;

//     @ScriptVariable
//     ValueMap pageProperties;

//     @PostConstruct
//     public void init(){
//        if(pageProperties != null){
//           String[] tags = pageProperties.get("cq:tags",String[].class);
//        }
//     }
// }
