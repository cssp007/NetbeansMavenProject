<%-- 
    Document   : SignUpPage
    Created on : Nov 15, 2018, 1:05:44 PM
    Author     : spandey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignUp Page</title>
    </head>
    <body>
        <form action="SignUpData" method="post">
            <h2>Fill all the details mentioned below for the SignUp..!!</h2>  
          First Name : <input type="test" name="fname" >
          <br><br>
          Last Name : <input type="test" name="fname" >
          <br><br>
          Username : <input type="test" name="username" >
          <br><br>
          Password : <input type="password" name="pass" >
          <br><br>
          Confirm Password : <input type="password" name="cpass">
          <br><br>
          Email ID: <input type="email" name="mail">
          <br><br>
          <input type="submit" value="Submit">
        </form>
    </body>
</html>
