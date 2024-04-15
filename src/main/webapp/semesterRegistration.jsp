<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Semester Registration</title>
<link rel="stylesheet" type="text/css" href="styles4.css">
</head>
<body>
    <div class="container">
        <h2>Semester Registration</h2>
        <form action="RegisterSemesterServlet" method="post">
            <label for="semesterId">Semester ID:</label>
            <input type="text" id="semesterId" name="semesterId" required><br>
            
            <label for="semesterName">Semester Name:</label>
            <input type="text" id="semesterName" name="semesterName" required><br>
            
            <label for="startDate">Start Date:</label>
            <input type="date" id="startDate" name="startDate" required><br>
            
            <label for="endDate">End Date:</label>
            <input type="date" id="endDate" name="endDate" required><br>
            
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>
