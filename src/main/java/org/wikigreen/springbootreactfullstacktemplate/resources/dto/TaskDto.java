package org.wikigreen.springbootreactfullstacktemplate.resources.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.wikigreen.springbootreactfullstacktemplate.model.Task;

@Data
@NoArgsConstructor
public class TaskDto {

    private long id;
    private String description;

    public TaskDto(Task task) {
        this.description = task.getDescription();
        this.id = task.getId();
    }

    public Task toEntity() {
        return new Task(this.id, this.description);
    }
}
