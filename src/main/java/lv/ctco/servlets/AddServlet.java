package lv.ctco.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(urlPatterns = "/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String university = req.getParameter("university");
        boolean success = (boolean) new lv.ctco.listViewerKVO.operations.Add().doOperation(new ArrayList<String>(Arrays.asList(new String[]{name, surname, university})));
        if (success) {
            resp.sendRedirect("addSuccess.jsp");
        } else {
            resp.sendRedirect("addFail.jsp");
        }
    }
}
