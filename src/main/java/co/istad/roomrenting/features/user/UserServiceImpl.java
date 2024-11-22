package co.istad.roomrenting.features.user;

import co.istad.roomrenting.features.user.dto.CreateUserRequest;
import co.istad.roomrenting.features.user.dto.UserResponse;
import co.istad.roomrenting.features.user.dto.VerifyRequest;
import jakarta.mail.MessagingException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public void createUser(CreateUserRequest createUserRequest) throws MessagingException {

    }

    @Override
    public List<UserResponse> findAll() {
        return null;
    }

    @Override
    public UserResponse findByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public UserResponse findByUuid(String uuid) {
        return null;
    }

    @Override
    public void verify(VerifyRequest verifyRequest) {

    }
}
