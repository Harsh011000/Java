

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname=request.getParameter("fname");
		String hname="harsh";
        String lname=request.getParameter("lname");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String gender=request.getParameter("gender");
        String batch=request.getParameter("batch");
        /*PrintWriter out=response.getWriter();
        response.setContentType("text/html;charset=UTF-8");

        out.print(fname+"<br>");
        out.print(lname+"<br>");
        out.print(username+"<br>");
        out.print(password+"<br>");
        out.print(gender+"<br>");
        out.print(batch+"<br>");*/
        
        /*System.out.print(fname+"<br>");
        System.out.print(lname+"<br>");
        System.out.print(username+"<br>");
        System.out.print(password+"<br>");
        System.out.print(gender+"<br>");
        System.out.print(batch+"<br>");*/
        
        try {
			//Class.forName("com.mysql.jdbc.Driver");
        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/learn","root","Forti");
			System.out.println("Connected With the database successfully");
			Statement cur=conn.createStatement();
			cur.execute(String.format("insert into detail values('%s','%s','%s','%s','%s','%s');",fname,lname,username,password,gender,batch));
			RequestDispatcher view=request.getRequestDispatcher("SignUp.html");
			view.forward(request, response);
			
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String gender=request.getParameter("gender");
        String batch=request.getParameter("batch");
        PrintWriter out=response.getWriter();
        response.setContentType("text/html;charset=UTF-8");

        out.print(fname+"<br>");
        out.print(lname+"<br>");
        out.print(username+"<br>");
        out.print(password+"<br>");
        out.print(gender+"<br>");
        out.print(batch+"<br>");*/
	}

}
