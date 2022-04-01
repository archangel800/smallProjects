package guru.springframework.controllers;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;
import mappings.UserMapper;

public class UserController {

    User saveUser(UserCommand command){
        return UserMapper.INSTANCE.userCommandToUser(command);
    }
}
