package com.gura.spring02.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gura.spring02.todo.service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	
	
}
