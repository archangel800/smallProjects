package mappings;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User userCommandToUser (UserCommand userCommand);
    UserCommand userToUserCommand(User user);
}
