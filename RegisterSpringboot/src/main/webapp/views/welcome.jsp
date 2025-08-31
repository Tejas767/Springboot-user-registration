<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/welcome.css">
</head>
<body>
 <div class="welcome-card">
        <img src="https://cdn-icons-png.flaticon.com/512/847/847969.png" alt="Welcome Icon">
        <h1>Welcome, <span style="color:#74ebd5;"> ${modelname}🎉</h1>
        <p>You have successfully logged in. Enjoy exploring your dashboard!</p>
        <a href="index.html">Go to Profile</a>
        <a href="logout">Logout</a>
    </div>
</body>
</html>