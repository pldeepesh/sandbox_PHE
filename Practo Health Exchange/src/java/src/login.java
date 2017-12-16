/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.*;
import java.net.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 *
 * @author Pradip
 */
public class login extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
    PrintWriter out ;
    List errorMsgs;
    Connection con = null;
    Statement stmt1 = null;
    ResultSet rs1 = null;
    String query1 = null;
   
    String name = null;
    String pwd = null;
    String log = null;
     String name1 = null;
    String pwd1 = null;
    public void invalidate()
    {
    out.print("bye");
    }
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException, IllegalStateException {
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        HttpSession session = request.getSession();
                
        //if(session.isNew())
        //{
        errorMsgs = new LinkedList();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-NPGK3CUE\\SQLEXPRESS;DatabaseName=Practo Health Exchange", "SA", "12345678");
            
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //con = DriverManager.getConnection("jdbc:sqlserver://localhost:1527;databaseName=BMS;user=SA;password=12345678");
            stmt1 = con.createStatement();
            
            request.setAttribute("errorMsgs",errorMsgs);
            
            name = request.getParameter("name");
            request.setAttribute("name",name);
            ServletContext context = getServletContext();
            context.setAttribute("uid",name);
            pwd =request.getParameter("pwd");
            if(name.length()==0 || pwd.length()==0)
            {
            errorMsgs.add("Please enter Login ID & Password");
            }
            
            log = request.getParameter("Log");
            context.setAttribute("log",log);
            query1 = "Select UserName,Password from UserDetails where UserName='"+name+"' and Password='"+pwd+"'";
            rs1 = stmt1.executeQuery(query1);              
            if(rs1.next())
            {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/donor.jsp");
            rd.forward(request, response);
            }            
            else
            {
                if(name.length()!=0 && pwd.length()!=0)
                {
            errorMsgs.add("Login ID and password didn't match!!");
                }
            }
            if(!errorMsgs.isEmpty())
            {
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
            }
           //response.setHeader("Cache-Control","private");
           //out.println(d);
            
        } 
        catch(SQLException se)
        {
            se.printStackTrace(); 
            errorMsgs.add("Login ID and Password didn't match");
            
        }
        catch(ClassNotFoundException se)
        {
            se.printStackTrace();
            out.println("Could not connect to server");
        }
                finally { 
            out.close();
         }
        //}
                
        
        
            
   } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
    * Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
