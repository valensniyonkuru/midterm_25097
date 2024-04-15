<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
    <link rel="stylesheet" type="text/css" href="styles5.css">
</head>
<body>
    <h2>Student Registration Form</h2>
    <form action="StudentRegistrationServlet" method="post">
        <label for="registrationCode">Registration Code:</label><br>
        <input type="text" id="registrationCode" name="registrationCode"><br>
        
        <label for="registrationDate">Registration Date:</label><br>
        <input type="date" id="registrationDate" name="registrationDate"><br>
        
        <label for="studentId">Student ID:</label><br>
        <input type="text" id="studentId" name="studentId"><br>
        
        <label for="semesterId">Semester ID:</label><br>
        <input type="text" id="semesterId" name="semesterId"><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
