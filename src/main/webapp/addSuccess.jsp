<html>

<body>

<form action="/add" method="POST">
    <table>
        <tr>
            <td colspan="2">Add the student</td>
        </tr>
        <tr>
            <td>Input name:</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>Input surname:</td>
            <td><input type="text" name="surname"/></td>
        </tr>
        <tr>
            <td>Input university:</td>
            <td><input type="text" name="university"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="submit" value="Add"></td>
        </tr>
    </table>
    <input type="button" value="Go To Menu" onclick="location.href='http://localhost:8080'">
</form>
<p> Student was successfully added to the list
</body>

</html>