<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>All Cars</h2>
<br>
<table bordercolor="black" border="2" width="100%">
    <tr>
        <th bgcolor="#ffe4c4">Model</th>
        <th bgcolor="#ffe4c4">Color</th>
        <th bgcolor="#ffe4c4">Owner`s name</th>
        <th bgcolor="#ffe4c4">Owner`s phone</th>
        <th bgcolor="#ffe4c4">Owner`s email</th>
    </tr>
    <c:forEach var="car" items="${allCars}">

<%--         create link update button--%>
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="carId" value="${car.id}"/>
        </c:url>
        <tr>

<%--             create link delete button--%>
            <c:url var="deleteButton" value="/deleteCar">
                <c:param name="carId" value="${car.id}"/>
            </c:url>
        <tr>

            <td>${car.model}</td>
            <td>${car.color}</td>
            <td>${car.name_owner}</td>
            <td>${car.phone_owner}</td>
            <td>${car.email}</td>
<%--        create update button--%>
            <td>
                <input type="button" value="UPDATE"
                       onclick="window.location.href='${updateButton}'"/>

<%--        create delete button--%>

            <input type="button" value="DELETE"
                   onclick="window.location.href='${deleteButton}'"/>
        </td>
        </tr>
    </c:forEach>


</table>
<br>
<input type="button" value="Add"
       onclick="window.location.href = 'addNewCar'"/>

</body>


</html>