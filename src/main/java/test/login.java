package test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="login",value="/login")
public class login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String user=req.getParameter("name");
        String pass=req.getParameter("pass");

        if(user.equals("1")&&pass.equals("1")){
            HttpSession session=req.getSession();
            session.setAttribute("user","hihihi");
            resp.sendRedirect("result.jsp");

        }else{
            System.out.println("khong duoc");
        }



    }
}
