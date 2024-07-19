package com.myapp.tasklistIlyaLisov.service;

import com.myapp.tasklistIlyaLisov.domain.task.Task;

public interface TaskService {

    Task getById(Long id);

    Task getAllByUserId(Long id);

    Task update(Task task);

    Task create(Task task, Long id);

    void delete(Long id);
}
