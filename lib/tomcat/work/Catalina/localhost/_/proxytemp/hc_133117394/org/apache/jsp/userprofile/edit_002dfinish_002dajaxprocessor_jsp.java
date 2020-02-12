/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.85
 * Generated at: 2020-02-12 06:37:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.userprofile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.commons.lang.StringUtils;
import org.owasp.encoder.Encode;
import org.wso2.carbon.CarbonConstants;
import org.wso2.carbon.identity.user.profile.stub.types.UserFieldDTO;
import org.wso2.carbon.identity.user.profile.stub.types.UserProfileDTO;
import org.wso2.carbon.identity.user.profile.ui.client.UserProfileCient;
import org.wso2.carbon.ui.CarbonUIMessage;
import org.wso2.carbon.ui.CarbonUIUtil;
import org.wso2.carbon.user.mgt.ui.Util;
import org.wso2.carbon.utils.ServerConstants;
import java.text.MessageFormat;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.user.profile.ui.client.UserProfileUIUtil;
import org.wso2.carbon.identity.user.profile.ui.client.UserProfileUIException;

public final class edit_002dfinish_002dajaxprocessor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tlds/carbontags.tld", Long.valueOf(1536208596000L));
    _jspx_dependants.put("/WEB-INF/tlds/fmt.tld", Long.valueOf(1536208596000L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\n");
      out.write(" ~ Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.\n");
      out.write(" ~\n");
      out.write(" ~ WSO2 Inc. licenses this file to you under the Apache License,\n");
      out.write(" ~ Version 2.0 (the \"License\"); you may not use this file except\n");
      out.write(" ~ in compliance with the License.\n");
      out.write(" ~ You may obtain a copy of the License at\n");
      out.write(" ~\n");
      out.write(" ~    http://www.apache.org/licenses/LICENSE-2.0\n");
      out.write(" ~\n");
      out.write(" ~ Unless required by applicable law or agreed to in writing,\n");
      out.write(" ~ software distributed under the License is distributed on an\n");
      out.write(" ~ \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\n");
      out.write(" ~ KIND, either express or implied.  See the License for the\n");
      out.write(" ~ specific language governing permissions and limitations\n");
      out.write(" ~ under the License.\n");
      out.write(" -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"extensions/js/vui.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../dialog/display_messages.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../extensions/core/js/vui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../admin/js/main.js\"></script>\n");
      out.write("\n");

    String httpMethod = request.getMethod();
    if (!"post".equalsIgnoreCase(httpMethod)) {
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
        return;
    }

    String BUNDLE = "org.wso2.carbon.identity.user.profile.ui.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale());
    String username = request.getParameter("username");
    String profile = request.getParameter("profile");
    String profileConfiguration = request.getParameter("profileConfiguration");
    String fromUserMgt = request.getParameter("fromUserMgt");
    String noOfProfiles = request.getParameter("noOfProfiles");
    String encryptedUsername;

    try {
        encryptedUsername = UserProfileUIUtil.getEncryptedAndBase64encodedUsername(username);
    } catch (UserProfileUIException e) {
        String message = MessageFormat.format(resourceBundle.getString("error.while.updating.profile"), null);
        CarbonUIMessage.sendCarbonUIMessage(message, CarbonUIMessage.ERROR, request);

      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            location.href = \"../user/user-mgt.jsp?ordinal=1\";\n");
      out.write("        </script>\n");

        return;
    }

      out.write('\n');
      out.write('\n');

    if (StringUtils.isBlank(username) || StringUtils.isBlank(profile)) {
        String message = MessageFormat.format(resourceBundle.getString("error.while.updating.profile"), null);
        CarbonUIMessage.sendCarbonUIMessage(message, CarbonUIMessage.ERROR, request);

      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            location.href = \"../user/user-mgt.jsp?ordinal=1\";\n");
      out.write("        </script>\n");

        return;
    }
	UserFieldDTO[] fieldDTOs = null;
	String forwardTo = null;
    if (StringUtils.isBlank(noOfProfiles)) {
        noOfProfiles = "0";
    }
    if (StringUtils.isBlank(fromUserMgt)) {
        fromUserMgt = "false";
    }

    try {
        String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
        String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
        ConfigurationContext configContext =
                (ConfigurationContext) config.getServletContext().getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
        UserProfileCient client = new UserProfileCient(cookie, backendServerURL, configContext);        

    	fieldDTOs = client.getProfileFieldsForInternalStore().getFieldValues();
    	
        if (fieldDTOs!=null)
        {
          for (UserFieldDTO field : fieldDTOs) {
            String value = request.getParameter(field.getClaimUri());
            if(value == null){
                value = "";
            }
            field.setFieldValue(value);   
          }
        }
        
        UserProfileDTO userprofile= new UserProfileDTO();
        userprofile.setProfileName(profile);
        userprofile.setFieldValues(fieldDTOs);      
        userprofile.setProfileConifuration(profileConfiguration);
        client.setUserProfile(username, userprofile);
        String message = resourceBundle.getString("user.profile.updated.successfully");
        CarbonUIMessage.sendCarbonUIMessage(message,CarbonUIMessage.INFO, request);
        if ("true".equals(fromUserMgt)) {
            //if there is only one profile, send directly to user-mgt.jsp
            if ((!client.isAddProfileEnabled()) && ((Integer.parseInt(noOfProfiles)) == 1)) {
                forwardTo = "../user/user-mgt.jsp?ordinal=1";
            } else {
                forwardTo = "index.jsp?username=" + Encode.forUriComponent(encryptedUsername) + "&fromUserMgt=" +
                        Encode.forUriComponent(fromUserMgt);
            }
        } else {
        	forwardTo ="index.jsp?region=region5&item=userprofiles_menu&ordinal=0";        	
        }

    } catch (Exception e) {
        String message = MessageFormat.format(resourceBundle.getString("error.while.updating.profile.user"),
                username, e.getMessage());
    	CarbonUIMessage.sendCarbonUIMessage(message, CarbonUIMessage.ERROR, request);
        forwardTo = "edit.jsp?username=" + Encode.forUriComponent(encryptedUsername) + "&profile=" +
                Encode.forUriComponent(profile) + "&fromUserMgt=true&noOfProfiles=" + Encode.forUriComponent(noOfProfiles);
    }

      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function forward() {\n");
      out.write("        location.href =\"");
      out.print(Encode.forJavaScriptBlock(forwardTo));
      out.write("\";\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    forward();\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
