package com.service;

import java.util.List;

import com.dao.CommentDaoImpl;
import com.dao.ICommentDao;
import com.model.Comments;

public class CommentService  implements ICommentService{
	private ICommentDao commentdao=new CommentDaoImpl();
	@Override
	public void addComment(Comments comment) {
		commentdao.addComment(comment);
		
	}
	@Override
	public List<Comments> queryPreparedStatement() {
		return commentdao.queryPreparedStatement();
	}
	@Override
	public void setCommentImgByUserName(String userName, String img) {
		ICommentDao icd = new CommentDaoImpl();
		icd.setCommentImgByUserName(userName, img);
	}
	
}
