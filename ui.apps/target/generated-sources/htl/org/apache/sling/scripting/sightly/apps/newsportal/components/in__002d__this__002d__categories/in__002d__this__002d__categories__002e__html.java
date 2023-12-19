/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.newsportal.components.in__002d__this__002d__categories;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class in__002d__this__002d__categories__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("\n                            <div class=\"sidebar-widget\">\n                                <h2 class=\"sw-title\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h2>\n                                <div class=\"news-list\">\n                                     <div class=\"nl-item\">\n                                        <div class=\"nl-img\">\n                                            <img src=\"/content/dam/newsportal/images/news-350x223-2.jpg\"/>\n                                        </div>\n                                        <div class=\"nl-title\">\n                                            <a href=\"\">Lorem ipsum dolor sit amet consec adipis elit</a>\n                                        </div>\n                                    </div>\n                                    <div class=\"nl-item\">\n                                        <div class=\"nl-img\">\n                                            <img src=\"/content/dam/newsportal/images/news-350x223-2.jpg\"/>\n                                        </div>\n                                        <div class=\"nl-title\">\n                                            <a href=\"\">Lorem ipsum dolor sit amet consec adipis elit</a>\n                                        </div>\n                                    </div>\n                                    <div class=\"nl-item\">\n                                        <div class=\"nl-img\">\n                                            <img src=\"/content/dam/newsportal/images/news-350x223-3.jpg\"/>\n                                        </div>\n                                        <div class=\"nl-title\">\n                                            <a href=\"\">Lorem ipsum dolor sit amet consec adipis elit</a>\n                                        </div>\n                                    </div>\n                                    <div class=\"nl-item\">\n                                        <div class=\"nl-img\">\n                                            <img src=\"/content/dam/newsportal/images/news-350x223-4.jpg\"/>\n                                        </div>\n                                        <div class=\"nl-title\">\n                                            <a href=\"\">Lorem ipsum dolor sit amet consec adipis elit</a>\n                                        </div>\n                                    </div>\n                                    <div class=\"nl-item\">\n                                        <div class=\"nl-img\">\n                                            <img src=\"/content/dam/newsportal/images/news-350x223-5.jpg\"/>\n                                        </div>\n                                        <div class=\"nl-title\">\n                                            <a href=\"\">Lorem ipsum dolor sit amet consec adipis elit</a>\n                                        </div>\n                                    </div>\n                      ");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

