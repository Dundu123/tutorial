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
package org.apache.sling.scripting.sightly.apps.newsportal.components.navigation;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class navigation__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_navigation = null;
Collection var_collectionvar0_list_coerced$ = null;
Collection var_collectionvar16_list_coerced$ = null;
_global_navigation = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Navigation.class.getName(), obj());
out.write("\n\n<div class=\"nav-bar\">\n\t<div class=\"container\">\n\t\t<nav class=\"navbar navbar-expand-md bg-dark navbar-dark\">\n\t\t\t<a href=\"#\" class=\"navbar-brand\">MENU</a>\n\t\t\t<button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\n\t\t\t</button>\n\n\t\t\t <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n                        ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_navigation, "items");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            out.write("<div class=\"navbar-nav mr-auto\">");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object nav : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\n                            ");
                                        {
                                            boolean var_testvariable10 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "children"), "size"), 0));
                                            if (var_testvariable10) {
                                                out.write("<a");
                                                {
                                                    String var_attrcontent11 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "page"), "path"), "uri")) + ".html");
                                                    out.write(" href=\"");
                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                                    out.write("\"");
                                                }
                                                out.write(" class=\"nav-item nav-link\">");
                                                {
                                                    Object var_12 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "page"), "title"), "text");
                                                    out.write(renderContext.getObjectModel().toString(var_12));
                                                }
                                                out.write("</a>");
                                            }
                                        }
                                        out.write("\n                            \n                            ");
                                        {
                                            boolean var_testvariable13 = (!(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.leq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "children"), "size"), 0)));
                                            if (var_testvariable13) {
                                                out.write("<div class=\"nav-item dropdown\">\n                                <a");
                                                {
                                                    String var_attrcontent14 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "page"), "path"), "uri")) + ".html");
                                                    out.write(" href=\"");
                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent14));
                                                    out.write("\"");
                                                }
                                                out.write(" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">");
                                                {
                                                    Object var_15 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(nav, "page"), "title"), "text");
                                                    out.write(renderContext.getObjectModel().toString(var_15));
                                                }
                                                out.write("</a>\n                                ");
                                                {
                                                    Object var_collectionvar16 = renderContext.getObjectModel().resolveProperty(nav, "children");
                                                    {
                                                        long var_size17 = ((var_collectionvar16_list_coerced$ == null ? (var_collectionvar16_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar16)) : var_collectionvar16_list_coerced$).size());
                                                        {
                                                            boolean var_notempty18 = (var_size17 > 0);
                                                            if (var_notempty18) {
                                                                {
                                                                    long var_end21 = var_size17;
                                                                    {
                                                                        boolean var_validstartstepend22 = (((0 < var_size17) && true) && (var_end21 > 0));
                                                                        if (var_validstartstepend22) {
                                                                            out.write("<div class=\"dropdown-menu\">");
                                                                            if (var_collectionvar16_list_coerced$ == null) {
                                                                                var_collectionvar16_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar16);
                                                                            }
                                                                            long var_index23 = 0;
                                                                            for (Object childnav : var_collectionvar16_list_coerced$) {
                                                                                {
                                                                                    boolean var_traversal25 = (((var_index23 >= 0) && (var_index23 <= var_end21)) && true);
                                                                                    if (var_traversal25) {
                                                                                        out.write("\n                                    <a");
                                                                                        {
                                                                                            String var_attrcontent26 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(childnav, "page"), "path"), "uri")) + ".html");
                                                                                            out.write(" href=\"");
                                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent26));
                                                                                            out.write("\"");
                                                                                        }
                                                                                        out.write(" class=\"dropdown-item\">");
                                                                                        {
                                                                                            Object var_27 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(childnav, "page"), "title"), "text");
                                                                                            out.write(renderContext.getObjectModel().toString(var_27));
                                                                                        }
                                                                                        out.write("</a>\n                                ");
                                                                                    }
                                                                                }
                                                                                var_index23++;
                                                                            }
                                                                            out.write("</div>");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    var_collectionvar16_list_coerced$ = null;
                                                }
                                                out.write("\n                            </div>");
                                            }
                                        }
                                        out.write("\n                        ");
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\n\t   \t\t\t<div class=\" social ml-auto\">\n\t\t\t\t\t<a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n\t\t\t\t\t<a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n\t\t\t\t\t<a href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\n\t\t\t\t\t<a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n\t\t\t\t\t<a href=\"#\"><i class=\"fab fa-youtube\"></i></a>\n\t\t\t\t</div>\n\t\t\t</div>\n\t\t</nav>\n\t</div>\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

