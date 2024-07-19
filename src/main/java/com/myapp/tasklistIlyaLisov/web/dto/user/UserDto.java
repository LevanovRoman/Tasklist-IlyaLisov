package com.myapp.tasklistIlyaLisov.web.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.myapp.tasklistIlyaLisov.domain.task.Task;
import com.myapp.tasklistIlyaLisov.domain.user.Role;
import com.myapp.tasklistIlyaLisov.web.dto.validation.OnCreate;
import com.myapp.tasklistIlyaLisov.web.dto.validation.OnUpdate;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserDto {

    @NotNull(message = "Id must be not null.", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Name must be not null.", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Name length must be smaller than 255 symbols.", groups = {OnCreate.class, OnUpdate.class})
    private String name;

    @NotNull(message = "Username must be not null.", groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255, message = "Username length must be smaller than 255 symbols.", groups = {OnCreate.class, OnUpdate.class})
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password must be not null.", groups = {OnCreate.class, OnUpdate.class})
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password confirmation must be not null.", groups = OnCreate.class)
    private String passwordConfirmation;
}
