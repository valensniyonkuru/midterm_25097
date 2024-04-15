<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
<link rel="stylesheet" type="text/css" href="styles1.css">
</head>
<body>
    <div class="container">
        <h2>Student Registration</h2>
        <form action="RegisterStudentServlet" method="post">
            <label for="studentId">Student ID:</label>
            <input type="text" id="studentId" name="studentId" required><br>
            
            <label for="firstName">First Name:</label>
            <input type="text" id="firstName" name="firstName" required><br>
            
            <label for="lastName">Last Name:</label>
            <input type="text" id="lastName" name="lastName" required><br>
            
            <label for="dateOfBirth">Date of Birth:</label>
            <input type="date" id="dateOfBirth" name="dateOfBirth" required><br>
            
            <!-- Add more fields for courses if needed -->
            
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>
