package com.gura.spring02.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring02.todo.dao.TodoDao;
import com.gura.spring02.todo.dto.TodoDto;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	private TodoDao dao;

	@Override
	public void addTodo(TodoDto dto) {
		dao.insert(dto);
		
	}

	@Override
	public void updateTodo(TodoDto dto) {
		dao.update(dto);
		
	}

	@Override
	public void deleteTodo(int num) {
		
		
	}

	@Override
	public void getTodo(int num, ModelAndView mView) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getListTodo(ModelAndView mView) {
		// TODO Auto-generated method stub
		
	}

}
