package lk.ijse.gdse.backend.controller;

import lk.ijse.gdse.backend.dto.StudentDto;
import lk.ijse.gdse.backend.entity.Student;
import lk.ijse.gdse.backend.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("save")
    public void saveStudent(@RequestBody StudentDto studentDto) {
         studentService.saveStudent(studentDto);
    }

    @PutMapping("update")
    public void updateStudent(@RequestBody StudentDto studentDto) {
        studentService.updateStudent(studentDto);
    }

    @GetMapping("get")
    public List<StudentDto> getAllStudents() {
        return studentService.getAllSrudent();
    }
}
