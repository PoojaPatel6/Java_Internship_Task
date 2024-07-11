<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link rel="stylesheet" href="styleR.css">
</head>
<body>

  <div class="form-box">
        <form action="regForm" method="post">
            <h2>Register</h2>
            <label for="name1">Name:</label>
            <input type="text" id="name1" name="name1"/><br><br>

            <label for="email1">Email:</label>
            <input type="text" id="email1" name="email1"/><br><br>

            <label for="pass1">Password:</label>
            <input type="password" id="pass1" name="pass1"/><br><br>

            <label>Gender:</label><br>
            <input type="radio" id="male" name="gender1" value="Male"/>
            <label for="male">Male</label>
            <input type="radio" id="female" name="gender1" value="Female"/>
            <label for="female">Female</label><br><br>

            <label for="city1">City:</label>
            <select id="city1" name="city1">
                <option>Select City</option>
                <option>Delhi</option>
                <option>Mumbai</option>
                <option>Lucknow</option>
                <option>Allahabad</option>
                <option>Bangalore</option>
            </select>
            <br><br>

            <input type="submit" value="Register"/>
        </form>
    </div>

</body>
</html>
