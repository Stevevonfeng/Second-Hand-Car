package com.dao;

import java.util.List;

import com.model.Comment;

public interface ICommentDao {
	public void addComment(Comment comment);
	public 	List<Comment> queryPreparedStatement();
}
