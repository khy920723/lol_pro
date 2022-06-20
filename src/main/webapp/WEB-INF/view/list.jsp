<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="EUC-KR">
        <title>lol pro</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>id(number)</th>
                    <th>name</th>
                    <th>nickname</th>
                    <th>position</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${memberList}" var="member">
                    <tr>
                        <td>${member.id}</td>
                        <td>${member.name}</td>
                        <td>${member.nickname}</td>
                        <td>${member.position}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>