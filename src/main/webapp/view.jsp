<%@ page import="lv.ctco.listViewerKVO.Student" %>
<%@ page import="lv.ctco.listViewerKVO.StudentsList" %>
<html>

<body>

<table border="1">
    <tr>
        <th>Index</th>
        <th>Name</th>
        <th>Surname</th>
        <th>University</th>
    </tr>
    <% for (int i = 0, x = 1; i < StudentsList.getStudentList().size(); i++) {
        Student student = StudentsList.getStudentList().get(i);
    %>
    <tr>
        <td><%= x++%>
        </td>
        <td><%= student.getName()%>
        </td>
        <td><%= student.getSurname()%>
        </td>
        <td><%= student.getUniversity()%>
        </td>
    </tr>
    <%}%>
</table>
<input type="button" value="Go To Menu" onclick="location.href='http://localhost:8080'">
</body>

</html>