<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Registration</title>
<link rel="stylesheet" type="text/css" href="styles2.css">
</head>
<body>
    <div class="container">
        <h2>Course Registration</h2>
        <form action="RegisterCourseServlet" method="post">
            <label for="courseId">Course ID:</label>
            <input type="text" id="courseId" name="courseId" required><br>
            
            <label for="courseCode">Course Code:</label>
            <input type="text" id="courseCode" name="courseCode" required><br>
            
            <label for="courseName">Course Name:</label>
            <input type="text" id="courseName" name="courseName" required><br>
            
            <!-- Add more fields for semester, department, etc. if needed -->
            
            <input type="submit" value="Register">
        </form>
    </div>
</body>
</html>
