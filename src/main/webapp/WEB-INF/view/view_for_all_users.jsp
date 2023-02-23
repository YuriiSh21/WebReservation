<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>

<body>

<h3>Information for all users</h3>
<br><br>

<security:authorize access="hasRole('USER')">
    <input type="button" value="Create reservation"
           onclick="window.location.href = 'user_interface'">
</security:authorize>
Reservations


<br><br>

<security:authorize access="hasRole('ADMIN')">
    <input type="button" value="Change reservation"
           onclick="window.location.href = 'admin_interface'">
</security:authorize>
Reservations details


</body>

</html>
