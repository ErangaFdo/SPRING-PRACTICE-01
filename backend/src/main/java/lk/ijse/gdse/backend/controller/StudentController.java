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
@CrossOrigin
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

    @DeleteMapping("delete")
    public void deleteStudent(@RequestParam Integer studentId) {
         studentService.deleteStudent(studentId);
    }

    @GetMapping("paginated")
    public List<StudentDto> getPaginatedStudents(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size) {
        return studentService.getStudentsByPage(page, size);
    }

    @GetMapping("total-pages")
    public int getTotalPages(@RequestParam(defaultValue = "5") int size) {
        return studentService.getTotalPages(size);
    }
}
