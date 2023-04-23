package com.todo.list.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todo.list.entity.Task;
@Repository
public interface TaskRepo extends CrudRepository<Task, Integer > {
    
}
