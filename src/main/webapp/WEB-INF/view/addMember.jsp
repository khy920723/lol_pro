<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta content="text/html" charset="EUC-KR" http-equiv="Content-Type">
        <title>add lol pro</title>
    </head>

    <body>
    <form name="inputBoard" id="inputBoard" method="post" action="/insert">
        <select name="team" id="team">
            <option value="t1"> T1 </option>
            <option value="geng"> GenG </option>
        </select>
        <table border="1">
            <thead>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>nickname</th>
                    <th>position</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="text" id="id" name="id"></td>
                    <td><input type="text" id="name" name="name"></td>
                    <td><input type="text" id="nickname" name="nickname"></td>
                    <td><input type="text" id="position" name="position"></td>
                </tr>
            </tbody>
        </table>
        <input type="submit" name="add" value="add" id="insert">
    </form>
    </body>
</html>
