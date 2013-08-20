package lv.ctco.servlets;

import lv.ctco.listViewerKVO.ListViewer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/indexChoiceOfOperation")
public class OperationsChoice extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        new ListViewer().start();
        String choice = req.getParameter("operationChoice");
        switch (choice) {
            case "Add":
                resp.sendRedirect("add.jsp");
            case "View":
                resp.sendRedirect("view.jsp");
            case "Remove":
                resp.sendRedirect("remove.jsp");
            case "Find":
                resp.sendRedirect("find.jsp");
            case "Sort":
                resp.sendRedirect("sort.jsp");
        }
    }
}
