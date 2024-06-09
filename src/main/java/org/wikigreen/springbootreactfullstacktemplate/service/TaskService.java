package org.wikigreen.springbootreactfullstacktemplate.service;

import org.springframework.stereotype.Service;
import org.wikigreen.springbootreactfullstacktemplate.model.Task;

import java.util.List;

@Service
public interface TaskService {

    List<Task> getAllTasks();

    Task createTask(Task task);

    Task updateTask(Task task);

    void deleteTask(Long id);
}
