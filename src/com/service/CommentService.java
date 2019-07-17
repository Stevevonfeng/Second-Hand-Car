package com.service;

import java.util.List;

import com.dao.CommentDaoImpl;
import com.dao.ICommentDao;
import com.model.Comment;

public class CommentService  implements ICommentService{
	private ICommentDao commentdao=new CommentDaoImpl();
	@Override
	public void addComment(Comment comment) {
		commentdao.addComment(comment);
		
	}
	@Override
	public List<Comment> queryPreparedStatement() {
		return commentdao.queryPreparedStatement();
	}
	
}
