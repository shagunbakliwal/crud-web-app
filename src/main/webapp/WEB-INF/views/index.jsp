<!DOCTYPE html>
<html>
<body>
Hello <%=request.getParameter("name") %>
How are you ${name}?
<form action = "/login.do" method="POST">
Enter your name 
<input type = "text" name = "name" >
<input type = "Submit" value = "Submit"> 
</form>
</body>
</html>