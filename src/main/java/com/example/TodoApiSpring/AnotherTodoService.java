package com.example.TodoApiSpring;

import org.springframework.stereotype.Service;

@Service("AnotherTodoService")

public class AnotherTodoService implements TodoService{
//    @Override
    public String doSomething(){
        return "Another Todo Service ";
    }
}
