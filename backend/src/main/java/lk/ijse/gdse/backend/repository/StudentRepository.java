package lk.ijse.gdse.backend.repository;

import lk.ijse.gdse.backend.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = "SELECT * FROM student LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<Student> findStudentPaginated(@Param("limit") int limit, @Param("offset") int offset);


    @Query(value = "SELECT COUNT(*) FROM student", nativeQuery = true)
    int getTotalStudentCount();
}
