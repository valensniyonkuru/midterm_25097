<!DOCTYPE html>
<html>
<head>
    <title>Academic Unit Registration</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<h2>Academic Unit Registration</h2>

<form action="AcademicUnitRegistrationServlet" method="post">
    <label for="academic_id">Academic ID:</label><br>
    <input type="text" id="academic_id" name="academic_id"><br>

    <label for="academic_code">Academic Code:</label><br>
    <input type="text" id="academic_code" name="academic_code"><br>

    <label for="academic_name">Academic Name:</label><br>
    <input type="text" id="academic_name" name="academic_name"><br>

    <label for="type">Type:</label><br>
    <select id="type" name="type">
        <option value="PROGRAMME">Programme</option>
        <option value="FACULTY">Faculty</option>
        <option value="DEPARTMENT">Department</option>
    </select><br>

    <label for="parent_id">Parent ID:</label><br>
    <input type="text" id="parent_id" name="parent_id"><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>
