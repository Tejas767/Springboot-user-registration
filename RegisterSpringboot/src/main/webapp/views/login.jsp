<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/login.css">
</head>
<body>
  <div class="login-card">
        <h2>Login</h2>
        
         <c:if test="${not empty errorMsg}">
           <h4 style="color: red"> ${errorMsg}</h4>
    </c:if>
    
    
    
    
    <c:if test="${not empty msg}">
    <p style="color:green; text-align:center;">${msg}</p>
</c:if>
    
        <form action="login" method="post">
            <input type="email" name="email" placeholder="Enter Email" required>
            <input type="password" name="password" placeholder="Enter Password" required>
            <button type="submit">Login</button>
        </form>
        <p>Don’t have an account? <a href="register">Register</a></p>
    </div>
</body>
</html>