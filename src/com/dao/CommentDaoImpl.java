package com.dao;

import java.util.ArrayList;
import java.util.List;
import com.model.Comment;
import com.service.JdbcUtil;

public class CommentDaoImpl implements ICommentDao{

	JdbcUtil jdbc=new JdbcUtil();
	@Override
	public void addComment(Comment comment) {
	
	String sql="insert into tb_comment values(?,?,?,?)";
	List<Object> params=new ArrayList<Object>();
	params.add(comment.getName());
	params.add(comment.getEmail());
	params.add(comment.getText());
	params.add(comment.getVid());
	jdbc.updatePreparedStatement(sql, params);
	jdbc.close();
	}

	@Override
	public List queryPreparedStatement() {
		
		String comment = "select email,text from tb_comment";
		List<Comment> list = jdbc.queryPreparedStatement(comment, null, Comment.class);
		return list;
	}

}
