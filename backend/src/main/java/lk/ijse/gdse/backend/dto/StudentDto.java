package lk.ijse.gdse.backend.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Integer studentId;
    private String studentName;
    private String studentAddress;
    private String studentEmail;
    private String studentPhone;
}
