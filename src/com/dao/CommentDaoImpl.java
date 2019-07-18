package com.dao;

import java.util.ArrayList;
import java.util.List;
import com.model.Comments;
import com.service.JdbcUtil;

public class CommentDaoImpl implements ICommentDao{

	JdbcUtil jdbc=new JdbcUtil();
	@Override
	public void addComment(Comments comment) {
	
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
		List<Comments> list = jdbc.queryPreparedStatement(comment, null, Comments.class);
		return list;
	}

	@Override
	public void setCommentImgByUserName(String userName, String img) {
		String sql = "update comments set img=? where name=?";
		List<Object> params=new ArrayList<Object>();
		params.add(img);
		params.add(userName);
		jdbc.updatePreparedStatement(sql, params);
		jdbc.close();
	}

}
