package co.istad.roomrenting.mapper;

import co.istad.roomrenting.domain.User;
import co.istad.roomrenting.features.auth.dto.RegisterRequest;
import co.istad.roomrenting.features.user.dto.CreateUserRequest;
import co.istad.roomrenting.features.user.dto.UserResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User fromCreateUserMapper(CreateUserRequest createUserRequest);

    List<UserResponse> toUserResponseMapper(List<User> users);

    UserResponse toUserResponse(User user);
    User fromRegisterRequest(RegisterRequest registerRequest);
}
