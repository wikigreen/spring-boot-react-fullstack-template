package org.wikigreen.springbootreactfullstacktemplate.resources;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wikigreen.springbootreactfullstacktemplate.resources.dto.TaskDto;
import org.wikigreen.springbootreactfullstacktemplate.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("api/task")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TaskResource {

    private final TaskService taskService;

    @GetMapping
    public List<TaskDto> getTasks() {
        return taskService.getAllTasks().stream().map(TaskDto::new).toList();
    }

    @PostMapping
    public TaskDto createTask(@RequestBody TaskDto taskDto) {
        return new TaskDto(taskService.createTask(taskDto.toEntity()));
    }

    @PutMapping
    public TaskDto updateTask(@RequestBody TaskDto taskDto) {
        return new TaskDto(taskService.updateTask(taskDto.toEntity()));
    }

    @DeleteMapping
    @RequestMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
