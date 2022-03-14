<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Controller" method="GET">
	<span>Pid</span><input type="text" name = "id"><br/>
	<span>Name</span><input type="text" name = "name"><br/>
	<span>City</span><input type="text" name = "city"><br/>
	<span>Salary</span><input type="text" name = "salary"><br/>
	<span>Type create for createEmployee</span>
	<span>Type find for findEmployee</span>
	<span>Type update for updateEmployee</span>
	<span>Type delete for DeleteEmployee</span>
	<span>Type list for ListOfAllEmployee</span>
	<input type="text" name = "data"><br/>
	<input type="submit" name = "Send"><br/>
</form>

</body>
</html>