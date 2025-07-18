package lk.ijse.gdse.backend.repository;

import lk.ijse.gdse.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserNameAndUserPassword(String userName, String userPassword);
}
