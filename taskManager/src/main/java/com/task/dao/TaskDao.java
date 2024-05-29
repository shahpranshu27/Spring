package com.task.dao;

import java.util.List;

import com.task.Task;

public interface TaskDao {

	void addTask(Task task);
	void updateTask(Task task, int taskId);
	void deleteTask(int taskId);
	Task getTaskById(int taskId);
	List<Task> getAllTasks();
	
}
