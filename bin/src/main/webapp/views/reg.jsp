<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    


<h1 style="color:red">New Employee Register</h1>
<a href="/viewemp" >ViewRecords</a>
<form action="/empsave" method="post">
Employee Id:<input type="text" name="id"><p></p>
Name:<input type="text" name="name"><p></p>
Password:<input type="password" name="password"><p></p>
Email:<input type="email" name="email"><p></p>
Address:<input type="text" name="address"><p></p>
<input type="submit" value="SaveEmployee">
</form>