<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>New Employee Info</h2>
<br>

<%--@elvariable id="car" type="car"--%>
<form:form action="saveCar" modelAttribute="car">

    <form:hidden path="id"/>

    Model <form:input path="model"/>
    <br><br>
    Color <form:input path="color"/>
    <br><br>
    Owner`s name <form:input path="name_owner"/>
<%--    <form:errors path="name_owner"/>--%>
    <br><br>
    Owner`s phone <form:input path="phone_owner"/>
    <br><br>
    Owner`s email <form:input path="email"/>
    <br><br>

    <input type="submit" value="OK">


</form:form>

</body>


</html>