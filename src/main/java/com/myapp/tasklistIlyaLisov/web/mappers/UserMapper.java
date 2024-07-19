package com.myapp.tasklistIlyaLisov.web.mappers;

import com.myapp.tasklistIlyaLisov.domain.user.User;
import com.myapp.tasklistIlyaLisov.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);
}
