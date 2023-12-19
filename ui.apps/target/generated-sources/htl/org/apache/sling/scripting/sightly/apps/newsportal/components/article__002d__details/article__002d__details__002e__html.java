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
package org.apache.sling.scripting.sightly.apps.newsportal.components.article__002d__details;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class article__002d__details__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_article = null;
out.write("\n\n\n");
_global_article = renderContext.call("use", com.gofortrainings.newsportal.core.models.Articledetails.class.getName(), obj());
out.write("\n    <div>\n        <h1>");
{
    Object var_0 = renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_article, "text")) ? renderContext.getObjectModel().resolveProperty(_global_article, "text") : "Default Text"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h1>\n        <p>");
{
    Object var_1 = renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_article, "desc")) ? renderContext.getObjectModel().resolveProperty(_global_article, "desc") : "Default Description"), "html");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n       <img");
{
    Object var_attrvalue2 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_article, "image")) ? renderContext.getObjectModel().resolveProperty(_global_article, "image") : "");
    {
        Object var_attrcontent3 = renderContext.call("xss", var_attrvalue2, "uri");
        {
            boolean var_shoulddisplayattr5 = (((null != var_attrcontent3) && (!"".equals(var_attrcontent3))) && ((!"".equals(var_attrvalue2)) && (!((Object)false).equals(var_attrvalue2))));
            if (var_shoulddisplayattr5) {
                out.write(" src");
                {
                    boolean var_istrueattr4 = (var_attrvalue2.equals(true));
                    if (!var_istrueattr4) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent3));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue6 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_article, "desc")) ? renderContext.getObjectModel().resolveProperty(_global_article, "desc") : "no image");
    {
        Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "attribute");
        {
            boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (!((Object)false).equals(var_attrvalue6))));
            if (var_shoulddisplayattr9) {
                out.write(" alt");
                {
                    boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                    if (!var_istrueattr8) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent7));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" style=\"width: 500px; height: 300px;\"/>\n\n        \n    </div>\n    \n\n\n        \n    ");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

