package com.example.TodoApiSpring;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    private static List<Todo>todoList;

    public TodoController(){

        todoList = new ArrayList<>();
        todoList.add(new Todo(1,true,"Todo-1",1));
        todoList.add(new Todo(2,false,"Todo-2",2));
    }

    @GetMapping("/todos")
     public ResponseEntity<List<Todo>>getTodos(){
        return ResponseEntity.ok(todoList);
    }
    @PostMapping("/todos")
    public ResponseEntity<Todo>createTodo(@RequestBody Todo newtodo){
        todoList.add(newtodo);
        return ResponseEntity.status(HttpStatus.CREATED).body(newtodo);
    }
    @GetMapping("/todos/{todoId}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long todoId){
        for(Todo todo:todoList){
            if(todo.getId() == todoId){
                return ResponseEntity.ok(todo);
            }
        }
        return ResponseEntity.notFound().build();
    }





}
