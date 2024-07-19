package com.myapp.tasklistIlyaLisov.web.mappers;

import com.myapp.tasklistIlyaLisov.domain.user.User;
import com.myapp.tasklistIlyaLisov.web.dto.user.UserDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-19T09:54:57+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setName( user.getName() );
        userDto.setUsername( user.getUsername() );
        userDto.setPassword( user.getPassword() );
        userDto.setPasswordConfirmation( user.getPasswordConfirmation() );

        return userDto;
    }

    @Override
    public User toEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setName( dto.getName() );
        user.setUsername( dto.getUsername() );
        user.setPassword( dto.getPassword() );
        user.setPasswordConfirmation( dto.getPasswordConfirmation() );

        return user;
    }
}
