package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import com.dao.IUserDao;
import com.model.*;
import com.service.CarServiceImpl;
import com.service.CommentService;
import com.service.ICarService;
import com.service.ICommentService;
import com.service.IUserService;
import com.service.JsonUtils;
import com.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Comment
 */
@WebServlet("/addcomment")
public class CommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doPost(req, resp);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String name = request.getParameter("username");
		String email = request.getParameter("email");
		String text=request.getParameter("textc");
		long vid = Long.parseLong(request.getParameter("vid"));
		Comments comment=new Comments();
		if(name==null) {
			comment.setName("游客");
		}else if(name.equals("")) {
			comment.setName("游客");
		}else {
			comment.setName(name);
		}
	    comment.setEmail(email);
	    comment.setText(text);
	    comment.setVid(vid);
	    
	    IUserService ius = new UserServiceImpl();
	    Users user = ius.searchUser2(email);
	    comment.setImg(user.getImage());
	    
	    ICarService ics = new CarServiceImpl();
	    ics.insertObject(comment);
	    
	    String json = JsonUtils.objectToJson(comment);
	    System.out.println("CommentServlet--comment--json--"+json);
	    response.getWriter().print(json);
	}

}
