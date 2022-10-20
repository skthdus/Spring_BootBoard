package com.example.demo.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Comment;

@Mapper
public interface CommentMapper {
	
	public List<Comment> selectAllCom(int boardnum);

	public int countCom(int boardnum);
	
	public void comAdd(HashMap<String,Object> map);
}
