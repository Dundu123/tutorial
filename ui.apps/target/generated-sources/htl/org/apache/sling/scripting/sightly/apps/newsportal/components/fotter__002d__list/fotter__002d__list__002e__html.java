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
package org.apache.sling.scripting.sightly.apps.newsportal.components.fotter__002d__list;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class fotter__002d__list__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Collection var_collectionvar1_list_coerced$ = null;
Object _global_contentresurce = null;
out.write("<div class=\"footer-widget\">\n       \n\t<h3 class=\"title\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h3>\n\t");
{
    Object var_collectionvar1 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "navlist");
    {
        long var_size2 = ((var_collectionvar1_list_coerced$ == null ? (var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1)) : var_collectionvar1_list_coerced$).size());
        {
            boolean var_notempty3 = (var_size2 > 0);
            if (var_notempty3) {
                {
                    long var_end6 = var_size2;
                    {
                        boolean var_validstartstepend7 = (((0 < var_size2) && true) && (var_end6 > 0));
                        if (var_validstartstepend7) {
                            out.write("<ul>");
                            if (var_collectionvar1_list_coerced$ == null) {
                                var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1);
                            }
                            long var_index8 = 0;
                            for (Object nav : var_collectionvar1_list_coerced$) {
                                {
                                    boolean var_traversal10 = (((var_index8 >= 0) && (var_index8 <= var_end6)) && true);
                                    if (var_traversal10) {
                                        out.write("\n\t");
_global_contentresurce = renderContext.call("use", (renderContext.getObjectModel().toString(nav) + "/jcr:content"), obj());
                                        out.write("\n\t\t<li>\n        <a");
                                        {
                                            String var_attrcontent11 = (renderContext.getObjectModel().toString(renderContext.call("xss", nav, "uri")) + ".html");
                                            out.write(" href=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                            out.write("\"");
                                        }
                                        out.write(">");
                                        {
                                            Object var_12 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_contentresurce, "jcr:title"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_12));
                                        }
                                        out.write("</a>\n        </li>\n\t");
                                    }
                                }
                                var_index8++;
                            }
                            out.write("</ul>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar1_list_coerced$ = null;
}
out.write(" \n    \n   ");
{
    boolean var_testvariable13 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "getintouch"), "true"));
    if (var_testvariable13) {
        out.write("<div class=\"contact-info\">\n            <p>");
        {
            Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "text");
            out.write(renderContext.getObjectModel().toString(var_14));
        }
        out.write("</p>\n        <div class=\"social\">\n            <a href=\"\"><i class=\"fab fa-twitter\"></i></a>\n            <a href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\n            <a href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\n            <a href=\"\"><i class=\"fab fa-instagram\"></i></a>\n            <a href=\"\"><i class=\"fab fa-youtube\"></i></a>\n        </div>\n   </div>");
    }
}
out.write("\n\t\n    \n\t");
{
    boolean var_testvariable15 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "newsletter"), "true"));
    if (var_testvariable15) {
        out.write("<div class=\"newsletter\">\n\t\t<p>");
        {
            String var_16 = (("\n\t\t\t" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "text"))) + "\n\t\t");
            out.write(renderContext.getObjectModel().toString(var_16));
        }
        out.write("</p>\n\t\t<form>\n\t\t\t<input class=\"form-control\" type=\"email\" placeholder=\"Your email here\"/>\n\t\t\t<button class=\"btn\">Submit</button>\n\t\t</form>\n   </div>");
    }
}
out.write("\n    \n</div>\n\n\n \n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

