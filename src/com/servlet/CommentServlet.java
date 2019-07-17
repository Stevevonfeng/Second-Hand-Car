package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import com.model.*;
import com.service.CommentService;
import com.service.ICommentService;

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
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String text=request.getParameter("textc");
		System.out.println("addCommet:text:"+text);
		long vid = Long.parseLong(request.getParameter("vid"));
		Comment comment=new Comment();
	    comment.setName(name);
	    comment.setEmail(email);
	    comment.setText(text);
	    comment.setVid(vid);
	    ICommentService commentservice=new CommentService();
	    commentservice.addComment(comment);
	}

}
