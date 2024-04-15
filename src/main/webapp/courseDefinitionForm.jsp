<!DOCTYPE html>
<html>
<head>
    <title>Course Definition Form</title>
    <link rel="stylesheet" type="text/css" href="styles6.css">
</head>
<body>
    <h2>Course Definition Form</h2>
    <form action="CourseDefinitionServlet" method="post">
        <label for="courseDefinitionId">Course Definition ID:</label><br>
        <input type="text" id="courseDefinitionId" name="courseDefinitionId"><br>
        
        <label for="courseDefinitionCode">Course Definition Code:</label><br>
        <input type="text" id="courseDefinitionCode" name="courseDefinitionCode"><br>
        
        <label for="courseDefinitionDescription">Course Definition Description:</label><br>
        <textarea id="courseDefinitionDescription" name="courseDefinitionDescription"></textarea><br>
        
        <label for="courseId">Course ID:</label><br>
        <input type="text" id="courseId" name="courseId"><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
