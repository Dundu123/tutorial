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
package org.apache.sling.scripting.sightly.apps.newsportal.components.grid__002d__container;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class grid__002d__container__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<div class=\"single-news\">\n    <div class=\"container\">\n        <div class=\"row\">\n            <div class=\"col-lg-8\">\n                <div>");
{
    Object var_resourcecontent0 = renderContext.call("includeResource", "left-container", obj().with("resourceType", "newsportal/components/container"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent0));
}
out.write("</div>\n            </div>\n            <div class=\"col-lg-4\">\n                <div class=\"sidebar\">\n                    <div>");
{
    Object var_resourcecontent1 = renderContext.call("includeResource", "grid-container", obj().with("resourceType", "newsportal/components/container"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent1));
}
out.write("</div>\n                </div>\n            </div>\n        </div>\n    </div>\n</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

