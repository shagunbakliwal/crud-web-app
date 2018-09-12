<%@taglib uri='/WEB-INF/tlds/acgcommon.tld' prefix='acg-common' %>
<html>
<head>
</head>
<body>
<jsp:useBean id='user' class='com.acg.web.beans.UserBean' scope='request' />
<form action='/signup.jsp'>
<acg-common:FormIdGenerator target='/whatever'/>
Roll number
<input type='text' id='rollNumber' name='rollNumber' value='${user.rollNumber}'>
<acg-common:ErrorMessage key='user.rollNumber'>
<%=errorMessage%>
</acg-common:ErrorMessage>
<br/>
Name
<input type='text' id='name' name='name' value='${user.name}'>
<acg-common:ErrorMessage key='user.name'>
<%=errorMessage%>
</acg-common:ErrorMessage>
<br/>
Gender
<input type='text' id='gender' name='gender' value='${user.gender}'>
<acg-common:ErrorMessage key='user.gender'>
<%=errorMessage%>
</acg-common:ErrorMessage>
<br/>
<input type='submit' value='Sign Up'>
</form>
</body>
</html>