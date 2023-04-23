package com.todo.list.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.todo.list.entity.Task;
import com.todo.list.service.TaskService;

@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/addTask")
    public void addTask(@RequestBody Task task){
       taskService.addTask(task);
    }
    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
     return taskService.getAllTasks();
    }
    @GetMapping("/tasks/{id}")
    public Optional<Task> getByID(@PathVariable("id") Integer id){
        return taskService.getTaskById(id);
    }
    
    @PutMapping("/tasks/{id}")
    public Task updateList(@PathVariable("id") Integer id,@RequestBody Task task){
     return taskService.updateTask(id, task);
    }

    @DeleteMapping("/deletedTask/{id}")
    public void deletedTask(@PathVariable("id") Integer id){
        taskService.deleteTaskById(id);
    }
}
