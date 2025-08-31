<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/register.css">
</head>
<body>

<div class="register-container">
    <h2>Create Account</h2>
    
    <c:if test="${not empty successMsg}">
       <h4 style="color: green"> ${successMsg}</h4>
    </c:if> 
    
     <c:if test="${not empty errorMsg}">
       <h4 style="color: red"> ${errorMsg}</h4>
    </c:if> 
    
     
    <form action="regForm" method="post">
        <input type="text" name="name" placeholder="Full Name" required>
        <input type="email" name="email" placeholder="Email Address" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="text" name="phone" placeholder="phone number" required>
        <button type="submit">Register</button>
    </form>
    <p>Already have an account? <a href="login">Login here</a></p>
</div>
</body>
</html>