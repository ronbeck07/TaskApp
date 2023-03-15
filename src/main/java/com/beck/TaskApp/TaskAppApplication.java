package com.beck.TaskApp;

import com.beck.TaskApp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TaskAppApplication.class, args);
	}

	@Autowired
	private TaskRepository taskRepository;
	@Override
	public void run(String... args) throws Exception {
	/*	Task task = new Task();
		task.setTitle("Work on Coding project");
		task.setDate("3/10/2023");
		task.setTime("10pm");
		task.setCompleted("Not yet");
		taskRepository.save(task);

		Task task2 = new Task();
		task2.setTitle("Play with kids");
		task2.setDate("3/11/2023");
		task2.setTime("6pm");
		task2.setCompleted("Done");
		taskRepository.save(task2);

*/

	}
}
