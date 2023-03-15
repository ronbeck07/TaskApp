package com.beck.TaskApp.controller;


import com.beck.TaskApp.exception.ResourceNotFoundException;
import com.beck.TaskApp.model.Task;
import com.beck.TaskApp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getAllTasks(){
        return taskRepository.findAll();

    }

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskRepository.save(task);
    }

    @GetMapping({"title"})
    public ResponseEntity<Task> getTaskByTitle(@PathVariable String id){
        Task task = taskRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Task not found with title: " + id));
                return ResponseEntity.ok(task);
    }

    @PutMapping({"title"})
    public ResponseEntity<Task> updateTask(@PathVariable String id, @RequestBody Task taskDetails){
        Task updateTask = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found with id: "+ id));
        updateTask.setTitle(taskDetails.getTitle());
        updateTask.setDate(taskDetails.getDate());
        updateTask.setTime(taskDetails.getTime());
        updateTask.setCompleted(taskDetails.getCompleted());

        taskRepository.save(updateTask);
        return ResponseEntity.ok(updateTask);
    }

    @DeleteMapping({"title"})
    public ResponseEntity<HttpStatus> deleteTask(@PathVariable String id){
        Task task = taskRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Task not found with the id "+ id));
        taskRepository.delete(task);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
