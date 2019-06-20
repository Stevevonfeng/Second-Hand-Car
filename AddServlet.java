package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Users;
import com.util.Conversion;
import com.util.JdbcUtil;


/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/Add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //成功插入数据库
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		JdbcUtil jdbc = new JdbcUtil();
 
		 Users users = new  Users();//试试设成全员变量引用
		 
		 Conversion.req_obj(users, request);
		 
 
             String sql = "insert into userse(seq,username, email, upassword) "
						+ "values(userse_seq.nextval,?,?,?)";
    
		 List<Object> params = new ArrayList<Object>();
			
			params.add(users.getUsername());
			params.add(users.getEmail());
			params.add(users.getPassword());
			
			jdbc .updatePreparedStatement(sql, params);
		 
		   request.getRequestDispatcher("profile-settings.jsp").forward(request, response);
		   
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
