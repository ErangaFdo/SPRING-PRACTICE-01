package lk.ijse.gdse.backend.service.impl;

import lk.ijse.gdse.backend.dto.StudentDto;
import lk.ijse.gdse.backend.entity.Student;
import lk.ijse.gdse.backend.repository.StudentRepository;
import lk.ijse.gdse.backend.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public void saveStudent(StudentDto studentDto) {
        studentRepository.save(modelMapper.map(studentDto, Student.class));
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        studentRepository.save(modelMapper.map(studentDto, Student.class));
    }

    @Override
    public List<StudentDto> getAllSrudent() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtos = new ArrayList<>();
        for (Student student : students) {
            studentDtos.add(modelMapper.map(student, StudentDto.class));
        }
        return studentDtos;
    }

    @Override
    public void deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public List<StudentDto> getStudentsByPage(int page, int size) {
        int offset = page * size;
        List<Student> students= studentRepository.findStudentPaginated(size,offset);
        return modelMapper.map(students, new TypeToken<List<StudentDto>>() {}.getType());
    }

    @Override
    public int getTotalPages(int size) {
        int totalStudents = studentRepository.getTotalStudentCount();
        return (int) Math.ceil((double) totalStudents / size);
    }


}
