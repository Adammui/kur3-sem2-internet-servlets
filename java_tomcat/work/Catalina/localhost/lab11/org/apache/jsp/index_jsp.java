/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-06-06 05:05:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Index</title>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\r\n");
      out.write("            integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-4 mt-5\">\r\n");
      out.write("            <p><b>TASK 1</b></p>\r\n");
      out.write("            <form>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"number\" name=\"Value-x\" class=\"form-control\" id=\"task1x\" placeholder=\"X\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"number\" name=\"Value-y\" class=\"form-control\" id=\"task1y\" placeholder=\"Y\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"number\" READONLY class=\"form-control\" id=\"task1z\" placeholder=\"Z\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <button type=\"submit\" id=\"btn-submit-t1\" class=\"btn btn-primary btn-submit-t1\">Submit</button>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <p><b>TASK 2 (XML), 3 (JSON)</b></p>\r\n");
      out.write("            <form>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"number\" name=\"XRand-N\" class=\"form-control\" id=\"task2z\" placeholder=\"Z\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <input type=\"text\" READONLY class=\"form-control\" id=\"task2randomInts\" placeholder=\"Z\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <button type=\"submit\" id=\"btn-submit-t2\" class=\"btn btn-primary\">Submit (XML)</button>\r\n");
      out.write("                <button type=\"submit\" id=\"btn-submit-t3\" class=\"btn btn-primary\">Submit (JSON)</button>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <p><b>TASK 4 </b></p>\r\n");
      out.write("            <input value=\"Async\" class=\"btn btn-primary mb-2\" type=\"button\"\r\n");
      out.write("                   onclick=\"sendXMLHTTPRequest({isAsyncRequest: true})\">\r\n");
      out.write("            <input value=\"Sync\" class=\"btn btn-primary mb-2\" type=\"button\"\r\n");
      out.write("                   onclick=\"sendXMLHTTPRequest({isAsyncRequest: false})\"><br/>\r\n");
      out.write("\r\n");
      out.write("            <input type=\"text\" style=\"margin-top: 15px\" READONLY class=\"form-control\" id=\"task4a\" placeholder=\"SUM\">\r\n");
      out.write("            <input type=\"text\" READONLY class=\"form-control\" id=\"task4b\" placeholder=\"XML\">\r\n");
      out.write("            <input type=\"text\" READONLY class=\"form-control\" id=\"task4c\" placeholder=\"JSON\">\r\n");
      out.write("\r\n");
      out.write("            <p><b>TASK 5</b></p>\r\n");
      out.write("            <button type=\"submit\" id=\"btn-submit-t5\" class=\"btn btn-primary btn-submit-t1\">Jquery</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    ///////////////////////////// TASK 1 ///////////////////////////////////////////////////\r\n");
      out.write("    document.getElementById(\"btn-submit-t1\").addEventListener(\"click\", function (event) {\r\n");
      out.write("        event.preventDefault()\r\n");
      out.write("\r\n");
      out.write("        let xhr = new XMLHttpRequest();\r\n");
      out.write("\r\n");
      out.write("        xhr.open('GET', '/lab11/SssHeader');\r\n");
      out.write("        xhr.setRequestHeader(\"Value-x\", document.querySelector(\"#task1x\").value);\r\n");
      out.write("        xhr.setRequestHeader(\"Value-y\", document.querySelector(\"#task1y\").value);\r\n");
      out.write("\r\n");
      out.write("        xhr.send();\r\n");
      out.write("\r\n");
      out.write("        xhr.onreadystatechange = () => {\r\n");
      out.write("            if (xhr.readyState === 4) {\r\n");
      out.write("                document.querySelector(\"#task1z\").value = xhr.getResponseHeader(\"Value-z\");\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        xhr.onprogress = function (event) {\r\n");
      out.write("            if (event.lengthComputable) {\r\n");
      out.write("                console.log('onProgress');\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        xhr.onerror = function () {\r\n");
      out.write("            alert(\"Запрос не удался\");\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    ///////////////////////////////// TASK 2 /////////////////////////////////////////////\r\n");
      out.write("    document.getElementById(\"btn-submit-t2\").addEventListener(\"click\", function (event) {\r\n");
      out.write("        event.preventDefault()\r\n");
      out.write("\r\n");
      out.write("        let xhr = new XMLHttpRequest();\r\n");
      out.write("\r\n");
      out.write("        xhr.open('GET', '/lab11/SssXml');\r\n");
      out.write("        xhr.setRequestHeader(\"XRand-N\", document.querySelector(\"#task2z\").value);\r\n");
      out.write("\r\n");
      out.write("        xhr.send();\r\n");
      out.write("\r\n");
      out.write("        xhr.onreadystatechange = () => {\r\n");
      out.write("            if (xhr.readyState === 4) {\r\n");
      out.write("                console.log(stringifyXML(xhr));\r\n");
      out.write("                document.querySelector(\"#task2randomInts\").value = stringifyXML(xhr).toString();\r\n");
      out.write("                // альтернатвный способ\r\n");
      out.write("                // document.querySelector(\"#task2randomInts\").value = xhr.responseXML.getElementsByTagName(\"num\").item(1).textContent;\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        xhr.onprogress = function (event) {\r\n");
      out.write("            if (event.lengthComputable) {\r\n");
      out.write("                console.log('onProgress');\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        xhr.onerror = function () {\r\n");
      out.write("            alert(\"Запрос не удался\");\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    ///////////////////// TASK 3  json////////////////////////////////////////\r\n");
      out.write("    document.getElementById(\"btn-submit-t3\").addEventListener(\"click\", function (event) {\r\n");
      out.write("        event.preventDefault()\r\n");
      out.write("\r\n");
      out.write("        let xhr = new XMLHttpRequest();\r\n");
      out.write("\r\n");
      out.write("        xhr.open('GET', '/lab11/SssJson');\r\n");
      out.write("        xhr.setRequestHeader(\"XRand-N\", document.querySelector(\"#task2z\").value);\r\n");
      out.write("\r\n");
      out.write("        xhr.send();\r\n");
      out.write("        xhr.onreadystatechange = () => {\r\n");
      out.write("            if (xhr.readyState === 4) {\r\n");
      out.write("                document.querySelector(\"#task2randomInts\").value = xhr.responseText.toString()\r\n");
      out.write("                //document.querySelector(\"#task2randomInts\").value = stringifyJSON(xhr).toString();\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        xhr.onprogress = function (event) {\r\n");
      out.write("            if (event.lengthComputable) {\r\n");
      out.write("                console.log('onProgress');\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        xhr.onerror = function () {\r\n");
      out.write("            alert(\"Запрос не удался\");\r\n");
      out.write("        };\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    /////////////// TASK 4 ////////////////////////////////////////\r\n");
      out.write("    function sendXMLHTTPRequest({isAsyncRequest}) {\r\n");
      out.write("\r\n");
      out.write("        let xhr1 = new XMLHttpRequest();\r\n");
      out.write("\r\n");
      out.write("        xhr1.open('GET', '/lab11/SssHeader', isAsyncRequest);\r\n");
      out.write("        xhr1.setRequestHeader(\"Value-x\", document.querySelector(\"#task1x\").value);\r\n");
      out.write("        xhr1.setRequestHeader(\"Value-y\", document.querySelector(\"#task1y\").value);\r\n");
      out.write("\r\n");
      out.write("        xhr1.send();\r\n");
      out.write("\r\n");
      out.write("        if (isAsyncRequest) {\r\n");
      out.write("\r\n");
      out.write("            xhr1.onreadystatechange = () => {\r\n");
      out.write("                if (xhr1.readyState === 4) {\r\n");
      out.write("                    document.querySelector(\"#task4a\").value = xhr1.getResponseHeader(\"Value-z\");\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("            xhr1.onprogress = function (event) {\r\n");
      out.write("                if (event.lengthComputable) {\r\n");
      out.write("                    console.log('onProgress');\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            xhr1.onerror = function () {\r\n");
      out.write("                alert(\"Request error\");\r\n");
      out.write("            };\r\n");
      out.write("        } else {\r\n");
      out.write("            if (xhr1.status === 200) document.querySelector(\"#task4a\").value = xhr1.getResponseHeader(\"Value-z\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        let xhr2 = new XMLHttpRequest();\r\n");
      out.write("\r\n");
      out.write("        xhr2.open('GET', '/lab11/SssXml', isAsyncRequest);\r\n");
      out.write("        xhr2.setRequestHeader(\"XRand-N\", document.querySelector(\"#task2z\").value);\r\n");
      out.write("\r\n");
      out.write("        xhr2.send();\r\n");
      out.write("\r\n");
      out.write("        if (isAsyncRequest) {\r\n");
      out.write("            xhr2.onreadystatechange = () => {\r\n");
      out.write("                if (xhr2.readyState === 4) {\r\n");
      out.write("                    console.log(stringifyXML(xhr2));\r\n");
      out.write("                    document.querySelector(\"#task4b\").value = stringifyXML(xhr2).toString();\r\n");
      out.write("                    // альтернатвный способ\r\n");
      out.write("                    // document.querySelector(\"#task2randomInts\").value = xhr.responseXML.getElementsByTagName(\"num\").item(1).textContent;\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            xhr2.onprogress = function (event) {\r\n");
      out.write("                if (event.lengthComputable) {\r\n");
      out.write("                    console.log('onProgress');\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            xhr2.onerror = function () {\r\n");
      out.write("                alert(\"Запрос не удался\");\r\n");
      out.write("            };\r\n");
      out.write("        } else {\r\n");
      out.write("            if (xhr2.status === 200) document.querySelector(\"#task4b\").value = \"XML \" + stringifyXML(xhr2).toString();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        let xhr3 = new XMLHttpRequest();\r\n");
      out.write("\r\n");
      out.write("        xhr3.open('GET', '/lab11/SssJson', isAsyncRequest);\r\n");
      out.write("        xhr3.setRequestHeader(\"XRand-N\", document.querySelector(\"#task2z\").value);\r\n");
      out.write("\r\n");
      out.write("        xhr3.send();\r\n");
      out.write("\r\n");
      out.write("        if (isAsyncRequest) {\r\n");
      out.write("            xhr3.onreadystatechange = () => {\r\n");
      out.write("                if (xhr3.readyState === 4) {\r\n");
      out.write("                    document.querySelector(\"#task4c\").value = xhr3.responseText.toString()\r\n");
      out.write("                    //document.querySelector(\"#task2randomInts\").value = stringifyJSON(xhr).toString();\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            xhr3.onprogress = function (event) {\r\n");
      out.write("                if (event.lengthComputable) {\r\n");
      out.write("                    console.log('onProgress');\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("\r\n");
      out.write("            xhr3.onerror = function () {\r\n");
      out.write("                alert(\"Запрос не удался\");\r\n");
      out.write("            };\r\n");
      out.write("        } else {\r\n");
      out.write("            if (xhr3.status === 200) document.querySelector(\"#task4c\").value = \"JSON \" + (xhr3.responseText).replace(/[^+\\d]/g, ' ');\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //////////////////////// TASK 5 /////////////////////////////\r\n");
      out.write("    // https://habr.com/ru/post/42426/\r\n");
      out.write("    document.getElementById(\"btn-submit-t5\").addEventListener(\"click\", function (event) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"/lab11/SssJson\",\r\n");
      out.write("            type: 'GET',\r\n");
      out.write("            headers: {\r\n");
      out.write("                'XRand-N': document.querySelector(\"#task2z\").value\r\n");
      out.write("            },\r\n");
      out.write("            contentType: 'application/json; charset=utf-8',\r\n");
      out.write("            success: function (result) {\r\n");
      out.write("                //alert(result)\r\n");
      out.write("                document.querySelector(\"#task2randomInts\").value = result\r\n");
      out.write("\r\n");
      out.write("            },\r\n");
      out.write("            error: function (error) {\r\n");
      out.write("                //alert(JSON.parse(error.responseText)['res'])\r\n");
      out.write("                document.querySelector(\"#task2randomInts\").value = JSON.parse(error.responseText)['res']\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function stringifyXML(req) {\r\n");
      out.write("        const xmlDoc = req.responseXML;\r\n");
      out.write("        const arr = Array.from(xmlDoc.getElementsByTagName(\"num\"));\r\n");
      out.write("        return arr.map(number => number.innerHTML).join(\" \");\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function stringifyJSON(req) {\r\n");
      out.write("        const arr = JSON.parse(req.responseText);\r\n");
      out.write("        return arr.res.join(' ');\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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
