<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <style>
        /* CSS for dashboard styling */
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 80%;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            margin-bottom: 10px;
        }
        a {
            text-decoration: none;
            color: #333;
        }
        a:hover {
            color: #007bff;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Dashboard</h2>
        <ul>
            <li><a href="academicUnitForm.jsp">Academic Unit Form</a></li>
            <li><a href="courseDefinitionForm.jsp">Course Definition Form</a></li>
            <li><a href="courseRegistration.jsp">Course Registration</a></li>
            <li><a href="semesterRegistration.jsp">Semester Registration</a></li>
            <li><a href="studentRegistration.jsp">Student Registration</a></li>
            <li><a href="studentRegistrationForm.jsp">Student Registration Form</a></li>
            <li><a href="teacherRegistration.jsp">Teacher Registration</a></li>
        </ul>
    </div>
</body>
</html>
