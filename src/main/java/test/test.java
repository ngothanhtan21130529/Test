package test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="test",value="/test")
public class test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

        String index=req.getParameter("index");
        Integer i=Integer.valueOf(index);
        req.setAttribute("index",i);
        req.getRequestDispatcher("pagination_2.jsp").forward(req,resp);
    }
}
