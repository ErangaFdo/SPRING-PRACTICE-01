package lk.ijse.gdse.backend.service.impl;

import lk.ijse.gdse.backend.dto.UserDto;
import lk.ijse.gdse.backend.entity.User;
import lk.ijse.gdse.backend.repository.UserRepository;
import lk.ijse.gdse.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    @Override
    public void saveUser(UserDto userDto) {
        userRepository.save(modelMapper.map(userDto, User.class));
    }
}
