<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order</title>
<script type="text/javascript" src=Controllers/jQuery.js></script>
<script type="text/javascript" src=Controllers/controllerMain.js></script>
</head>
<body>

<form action="">
  <div class="">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="Userid"><b>UserId</b></label>
    <input type="number" placeholder="Enter ID" name="number" required>

    <label for="CustomerName"><b>CustomerName</b></label>
    <input type="text" placeholder="Enter cxname" name="text" required>

    <label for="number"><b>Amount</b></label>
    <input type="number" placeholder="Amount" name="number" required>
    <hr>

    <p>By creating an order <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="orderbtn">Order</button>
  </div>

  <div class="container Order">
    <p>Already have an account? <a href="#">ORDER</a>.</p>
  </div>
</form>

<h1>:)</h1>

</body>
</html>