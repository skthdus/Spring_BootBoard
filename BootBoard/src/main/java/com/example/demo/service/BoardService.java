package com.example.demo.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.mapper.BoardMapper;
import com.example.demo.model.Board;

@Service
public class BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	public List<Board> selectAllBoard(){
		return boardMapper.selectAllBoard();
	}

	public Board selectOneBoard(int boardnum) {
		return boardMapper.selectOneBoard(boardnum);
	}
	
	public void setLikeNum(String state, int num) {
		// state : plus / minus
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("state", state);
		map.put("num", num);
		
		boardMapper.setLikeNum(map);
	}
	
	public int getLikeNum(@PathVariable("boardnum") int num) {

		return boardMapper.getLikeNum(num);	
	}
}
