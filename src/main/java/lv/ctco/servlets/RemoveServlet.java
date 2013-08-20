package lv.ctco.servlets;

import lv.ctco.listViewerKVO.operations.Remove;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(urlPatterns = "/remove")
public class RemoveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String indexToDeleteElement = req.getParameter("deletedElementIndex");
        boolean success = (boolean) new Remove().doOperation(new ArrayList<String>(Arrays.asList(new String[]{indexToDeleteElement})));
        if (success) {
            resp.sendRedirect("removeSuccess.jsp");
        } else {
            resp.sendRedirect("removeFail.jsp");
        }
    }
}
