package com.wql;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by He on 2016/11/3.
 */
@WebServlet("/mytest")
public class HelloController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        request.setCharacterEncoding("UTF-8");
        String name=request.getParameter("name");
        request.setAttribute("name",name);
        System.out.println("-sss-");
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
