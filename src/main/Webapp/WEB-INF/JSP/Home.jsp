<html>
<head><title>
jsp page</title>
</head>
<body>
<h1>${kj}</h1>
<h2>User Registration</h2>
    <form action="/add" method="post">
        firstname: <input type="text" name="firstname" /><br>
        lastname: <input type="text" name="lastname" /><br>
         email: <input type="text" name="email" /><br>
        
        <input type="submit" value="submit" />
    </form>
</body>
</html>