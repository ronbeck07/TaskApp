package com.beck.TaskApp.repository;

import com.beck.TaskApp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, String> {


}
