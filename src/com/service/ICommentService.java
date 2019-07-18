package com.service;

import java.util.List;

import com.model.Comments;

public interface ICommentService {
	public void addComment(Comments comment);
	public List<Comments> queryPreparedStatement();
	void setCommentImgByUserName(String userName, String img);
}
