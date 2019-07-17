package com.service;

import java.util.List;

import com.model.Comment;

public interface ICommentService {
	public void addComment(Comment comment);
	public List<Comment> queryPreparedStatement();
}
