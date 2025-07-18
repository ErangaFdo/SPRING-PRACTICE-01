package lk.ijse.gdse.backend.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userEmail;
}
