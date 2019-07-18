package com.dao;

import java.util.List;

import com.model.Comments;

public interface ICommentDao {
	public void addComment(Comments comment);
	public 	List<Comments> queryPreparedStatement();
	public void setCommentImgByUserName(String userName,String img);
}
