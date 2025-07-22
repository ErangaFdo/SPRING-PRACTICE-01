package lk.ijse.gdse.backend.service;

import lk.ijse.gdse.backend.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    void saveStudent(StudentDto studentDto);
    void updateStudent(StudentDto studentDto);
    List<StudentDto> getAllSrudent();
    void deleteStudent(Integer studentId);
    List<StudentDto> getStudentsByPage(int page, int size);
    int getTotalPages(int size);
}
