<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>lol pro team</title>
    </head>

    <body>
        <form name="selectTeam" action="/list" method="post" id="select">
            <select name="team" id="team">
                <option value="t1"> T1 </option>
                <option value="geng"> GenG </option>
            </select>
            <input type="submit" name="selectBut" id="selectBut" value="Team select" />
        </form>
    </body>
</html>