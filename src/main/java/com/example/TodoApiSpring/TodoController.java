package com.example.TodoApiSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    private static List<Todo>todos;

    public TodoController(){

        todos = new ArrayList<>();
        todos.add(new Todo(1,true,"Todo-1",1));
        todos.add(new Todo(2,false,"Todo-2",2));
    }
}
