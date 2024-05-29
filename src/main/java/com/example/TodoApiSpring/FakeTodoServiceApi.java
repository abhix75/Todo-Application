package com.example.TodoApiSpring;

import org.springframework.stereotype.Service;

@Service("FakeTodoService")
public class FakeTodoServiceApi implements TodoService{
    public String doSomething() {
        return "Something From FakeTodoService";
    }
}
