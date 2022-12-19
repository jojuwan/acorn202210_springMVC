package com.gura.spring02.todo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring02.todo.dto.TodoDto;

@Repository
public class TodoDaoImpl implements TodoDao{

	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(TodoDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TodoDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TodoDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TodoDto getData(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TodoDto> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
