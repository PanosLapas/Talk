<%-- 
    Document   : TalkTalk
    Created on : Jul 9, 2013, 4:39:56 PM
    Author     : scify
--%>

<%@page import="javax.xml.namespace.QName"%>
<%@page import="java.net.URL"%>
<%@page import="javax.xml.ws.WebServiceFeature"%>
<%@page import="org.scify.newsumserver.server.newsumfreeservice.GetSummary"%>
<%@page import="org.scify.newsumserver.server.newsumfreeservice.NewSumFreeService_Service"%>
<%@page import="org.scify.newsumserver.server.newsumfreeservice.NewSumFreeService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    public class Talk extends NewSumFreeService_Service{

    public Talk() {
    }

    public Talk(WebServiceFeature... features) {
        super(features);
    }

    public Talk(URL wsdlLocation) {
        super(wsdlLocation);
    }

    public Talk(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, features);
    }

    public Talk(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Talk(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }
    
}
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% 
           java.net.URL link=new java.net.URL("http://143.233.226.97:60001/NewSumFreeService/NewSumFreeService?wsdl");
           javax.xml.namespace.QName serviceName=new javax.xml.namespace.QName("NewSumFreeService");
           Talk communicate=new Talk(link);
           out.print(communicate.getWSDLDocumentLocation());
           //out.print(communicate.getNewSumFreeServicePort());
        %>
    </body>
</html>
