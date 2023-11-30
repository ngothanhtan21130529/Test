package test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet(name="testlogout",value="/logout")
public class testlogout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data=req.getParameter("data");
        HttpSession session=req.getSession();
        if(session!=null){
            session.invalidate();
            resp.sendRedirect("login.jsp");
        }else{
            resp.sendRedirect("login.jsp");
        }
    }
}
