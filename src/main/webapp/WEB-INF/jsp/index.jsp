<%-- 
    Document   : index.jsp
    Created on : Dec 26, 2016, 10:16:23 PM
    Author     : edwin < edwinkun at gmail dot com >
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <c:if test="${not empty dosens}">
        <table class="table table-hover table-striped">
            <thead>
                <tr>
                    <th>ID Dosen</th>
                    <th>Nama Dosen</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${dosens}" var="dosen">
                <tr>
                    <td>${dosen.iddosen}</td>
                    <td>${dosen.namadosen}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        </c:if>
        
        <c:if test="${not empty dosen}">
            <h1>Hello Dosen ${dosen.namadosen}!</h1>
        </c:if>
        
    </body>
</html>
