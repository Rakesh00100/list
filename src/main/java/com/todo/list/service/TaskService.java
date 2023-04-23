package com.todo.list.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.list.entity.Task;
import com.todo.list.repository.TaskRepo;

@Service
public class TaskService {
    @Autowired
    private TaskRepo taskRepo;
    //Create
    public void addTask(Task task){
       taskRepo.save(task);
    }
    //Select or Read
    public List<Task> getAllTasks(){
       return (List<Task>) taskRepo.findAll();
    }
    //Read by id
    public Optional<Task> getTaskById(Integer id){
        return taskRepo.findById(id);
    }
    //update 
    public Task updateTask(Integer id, Task task){
        task.setId(id);
        return taskRepo.save(task);
    }
    //Delete
    public void deleteTaskById(Integer id ){
        taskRepo.deleteById(id);
    }
}
