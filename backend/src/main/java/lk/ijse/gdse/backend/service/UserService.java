package lk.ijse.gdse.backend.service;

import lk.ijse.gdse.backend.dto.UserDto;

public interface UserService {
    void saveUser(UserDto userDto);
    UserDto loginUser(String userName, String userPassword);
}
