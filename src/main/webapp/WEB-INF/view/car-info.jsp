<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>New Employee Info</h2>
<br>

<%--@elvariable id="car" type="car"--%>
<form:form action="saveCar" modelAttribute="car">

    <form:hidden path="id"/>

    <%--    Model <form:input path="model"/>--%>
    Model <form:select path="model">
    <form:option value="BMW x5" label="BMW"/>
    <form:option value="AUDI A6" label="Audi"/>
    <form:option value="TOYOTA RAV4" label="Toyota"/>
    <form:option value="Punto" label="Fiat"/>
    <form:option value="Creta" label="Hyundai"/>
</form:select>


    <br><br>
<%--    Color <form:input path="color"/>--%>
    Chose a color:

    Black<form:radiobutton path="color" value="Black"/>
    Red<form:radiobutton path="color" value="Red"/>
    White<form:radiobutton path="color" value="White"/>
    Grey<form:radiobutton path="color" value="Grey"/>
    <br><br>

    Owner`s name <form:input path="name_owner"/>
    <form:errors path="name_owner"/>
    <br><br>
    Owner`s phone <form:input path="phone_owner"/>
    <br><br>
    Owner`s email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>

    <input type="submit" value="OK">


</form:form>

</body>


</html>