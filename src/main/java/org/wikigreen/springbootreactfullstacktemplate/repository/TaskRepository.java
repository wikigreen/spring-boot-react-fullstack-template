package org.wikigreen.springbootreactfullstacktemplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wikigreen.springbootreactfullstacktemplate.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
