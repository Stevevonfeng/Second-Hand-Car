package com.service;

import com.dao.CommentDaoImpl;
import com.dao.ICommentDao;
import com.model.Comment;

public class CommentService  implements ICommentService{
	private ICommentDao commentdao=new CommentDaoImpl();
	@Override
	public void addComment(Comment comment) {
		commentdao.addComment(comment);
		
	}
	
}
