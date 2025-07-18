package lk.ijse.gdse.backend.controller;

import lk.ijse.gdse.backend.dto.UserDto;
import lk.ijse.gdse.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    private final UserService userService;

    @PostMapping("save")
     public void saveUser(@RequestBody UserDto userDto) {
            userService.saveUser(userDto);
     }

     @PostMapping("login")
     public UserDto loginUser(@RequestBody UserDto userDto) {
       return userService.loginUser(userDto.getUserName(),userDto.getUserPassword());

     }
}
