package com.myapp.tasklistIlyaLisov.web.mappers;

import com.myapp.tasklistIlyaLisov.domain.task.Task;
import com.myapp.tasklistIlyaLisov.web.dto.task.TaskDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-19T09:54:57+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public TaskDto toDto(Task task) {
        if ( task == null ) {
            return null;
        }

        TaskDto taskDto = new TaskDto();

        taskDto.setId( task.getId() );
        taskDto.setTitle( task.getTitle() );
        taskDto.setDescription( task.getDescription() );
        taskDto.setStatus( task.getStatus() );
        taskDto.setExpirationDate( task.getExpirationDate() );

        return taskDto;
    }

    @Override
    public List<TaskDto> toDto(List<Task> tasks) {
        if ( tasks == null ) {
            return null;
        }

        List<TaskDto> list = new ArrayList<TaskDto>( tasks.size() );
        for ( Task task : tasks ) {
            list.add( toDto( task ) );
        }

        return list;
    }

    @Override
    public Task toEntity(TaskDto dto) {
        if ( dto == null ) {
            return null;
        }

        Task task = new Task();

        task.setId( dto.getId() );
        task.setTitle( dto.getTitle() );
        task.setDescription( dto.getDescription() );
        task.setStatus( dto.getStatus() );
        task.setExpirationDate( dto.getExpirationDate() );

        return task;
    }
}
