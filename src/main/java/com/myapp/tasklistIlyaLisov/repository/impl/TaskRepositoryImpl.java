package com.myapp.tasklistIlyaLisov.repository.impl;

import com.myapp.tasklistIlyaLisov.domain.task.Task;
import com.myapp.tasklistIlyaLisov.repository.TaskRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TaskRepositoryImpl implements TaskRepository {
    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Task> findAllByUserId(Long userId) {
        return Optional.empty();
    }

    @Override
    public void assignToUserById(Long taskId, Long userId) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void delete(Long id) {

    }
}
