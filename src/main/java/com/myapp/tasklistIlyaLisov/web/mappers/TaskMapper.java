package com.myapp.tasklistIlyaLisov.web.mappers;

import com.myapp.tasklistIlyaLisov.domain.task.Task;
import com.myapp.tasklistIlyaLisov.domain.user.User;
import com.myapp.tasklistIlyaLisov.web.dto.task.TaskDto;
import com.myapp.tasklistIlyaLisov.web.dto.user.UserDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto dto);
}
