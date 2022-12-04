<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    


<h1 style="color:red">Edit Employee Record</h1>
<a href="/viewemp" >ViewRecords</a>
<form action="/editu" method="post">

Name:<input type="text" name="name"><p></p>
Password:<input type="password" name="password"><p></p>
Email:<input type="email" name="email"><p></p>
Address:<input type="text" name="address"><p></p>
<input type="submit" value="EditEmployee">
</form>