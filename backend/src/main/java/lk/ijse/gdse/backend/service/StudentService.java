package lk.ijse.gdse.backend.service;

import lk.ijse.gdse.backend.dto.StudentDto;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    void saveStudent(StudentDto studentDto);
    void updateStudent(StudentDto studentDto);
}
