package lv.ctco.servlets;

import lv.ctco.listViewerKVO.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = "/find")
public class FindServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String university = req.getParameter("university");
        ArrayList<String> findByValues = new ArrayList<String>(Arrays.asList(new String[]{name, surname, university}));
        List<Student> foundedStudents = new lv.ctco.listViewerKVO.operations.Find().doOperation(findByValues);
        int size = foundedStudents.size();
        if (size == 0) {
            resp.sendRedirect("notFound.jsp");
        } else {
            resp.sendRedirect("findSuccess.jsp");
        }
    }
}
