package test;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class Pagination {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        super.doPost(req, resp);
//
//    }


    public Connection Connection() throws SQLException {
        Connection c=null;
        DriverManager.registerDriver(new Driver());

        String url="jdbc:mysql://localhost:3306/gemstore";
        String username="root";
        String pass="";
       c=DriverManager.getConnection(url,username,pass);
        return c;
    }



    public int Getindex(int index){
        return index;
    }

}
