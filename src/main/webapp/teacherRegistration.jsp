<!DOCTYPE html>
<html>
<head>
    <title>Teacher Registration</title>
    <link rel="stylesheet" type="text/css" href="styles3.css">
</head>
<body>
    <h2>Teacher Registration Form</h2>
    <form action="TeacherRegistrationServlet" method="post">
        <label for="teacherId">Teacher ID:</label><br>
        <input type="text" id="teacherId" name="teacherId"><br>
        
        <label for="firstName">First Name:</label><br>
        <input type="text" id="firstName" name="firstName"><br>
        
        <label for="lastName">Last Name:</label><br>
        <input type="text" id="lastName" name="lastName"><br>
        
        <label for="qualification">Qualification:</label><br>
        <select id="qualification" name="qualification">
            <option value="MASTER">Master</option>
            <option value="PHD">PhD</option>
            <option value="PROFESSOR">Professor</option>
        </select><br>
        
        <label for="courseId">Course ID:</label><br>
        <input type="text" id="courseId" name="courseId"><br>
        
        <!-- Add Academic Units selection if needed -->
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
