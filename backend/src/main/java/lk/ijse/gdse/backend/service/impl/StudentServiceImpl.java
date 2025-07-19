package lk.ijse.gdse.backend.service.impl;

import lk.ijse.gdse.backend.dto.StudentDto;
import lk.ijse.gdse.backend.entity.Student;
import lk.ijse.gdse.backend.repository.StudentRepository;
import lk.ijse.gdse.backend.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
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
}
