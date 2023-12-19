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
package org.apache.sling.scripting.sightly.apps.newsportal.components.footer;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class footer__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write(" <div class=\"footer\">\n            <div class=\"container\">\n                <div class=\"row\">\n                    <div class=\"col-lg-3 col-md-6\">\n                        <div>");
{
    Object var_resourcecontent0 = renderContext.call("includeResource", "fotter-link-1", obj().with("resourceType", "newsportal/components/fotter-list"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent0));
}
out.write("</div>\n                    </div>\n                    \n                    <div class=\"col-lg-3 col-md-6\">\n                        <div>");
{
    Object var_resourcecontent1 = renderContext.call("includeResource", "fotter-link-2", obj().with("resourceType", "newsportal/components/fotter-list"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent1));
}
out.write("</div>\n                    </div>\n\n                    <div class=\"col-lg-3 col-md-6\">\n                       <div>");
{
    Object var_resourcecontent2 = renderContext.call("includeResource", "fotter-link-3", obj().with("resourceType", "newsportal/components/fotter-list"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent2));
}
out.write("</div>\n                    </div>\n                    \n                    <div class=\"col-lg-3 col-md-6\">\n                       <div>");
{
    Object var_resourcecontent3 = renderContext.call("includeResource", "fotter-link-4", obj().with("resourceType", "newsportal/components/fotter-list"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent3));
}
out.write("</div>\n                        </div>\n                    </div>\n                </div>\n            </div>\n        </div>\n        <!-- Footer End -->\n        \n        <!-- Footer Menu Start -->\n        <div class=\"footer-menu\">\n            <div class=\"container\">\n                <div class=\"f-menu\">\n                    <a href=\"\">Terms of use</a>\n                    <a href=\"\">Privacy policy</a>\n                    <a href=\"\">Cookies</a>\n                    <a href=\"\">Accessibility help</a>\n                    <a href=\"\">Advertise with us</a>\n                    <a href=\"\">Contact us</a>\n                </div>\n            </div>\n        </div>\n        <!-- Footer Menu End -->\n\n        <!-- Footer Bottom Start -->\n        <div class=\"footer-bottom\">\n            <div class=\"container\">\n                <div class=\"row\">\n                    <div class=\"col-md-6 copyright\">\n                        <p>Copyright &copy; <a href=\"https://htmlcodex.com\">HTML Codex</a>. All Rights Reserved</p>\n                    </div>\n\n                    <div class=\"col-md-6 template-by\">\n                        <p>Template By <a href=\"https://htmlcodex.com\">HTML Codex</a></p>\n                    </div>\n                </div>\n            </div>\n        </div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

