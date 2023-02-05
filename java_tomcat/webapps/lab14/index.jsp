<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.io.*" %>
<%@page import="org.apache.commons.httpclient.*" %>
<%@page import="org.apache.commons.httpclient.methods.*" %>
<%@page import="org.apache.jackrabbit.webdav.client.methods.CopyMethod" %>
<%@page import=" org.apache.jackrabbit.webdav.client.methods.DeleteMethod" %>
<%@page import=" org.apache.jackrabbit.webdav.client.methods.MkColMethod" %>

<html>

    <head>
        <title>Index</title>
        <link rel="stylesheet" href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"
                integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

    </head>

    <body>
        <div>
            <div>
                <br/>
                <form class="pure-form pure-form-stacked" method="post" action="/Lab14/Aaa" enctype="multipart/form-data">
                    <fieldset>
                        <legend>File:</legend>
                        <input type="file" name="myfile">
                        <button type="submit" class="pure-button pure-button-primary">Upload file</button>
                    </fieldset>
                </form>
                <a href="Aaa?action=mkcol">Create folder "NewFolder"</a>
                <br/><br/>
                <a href="Aaa?action=download">Download file</a>
                <!-- Скачать с яндекс диска -->
                <br/><br/>
                <a href="Aaa?action=copy">Copy file to new folder</a>
                <br/><br/>
                <a href="Aaa?action=deleteFile">Delete file </a>
                <br/><br/>
                <a href="Aaa?action=deleteFolder">Delete folder "NewFolder"</a>
                <br/><br/>

            </div>
        </div>
    </body>

    </html>
