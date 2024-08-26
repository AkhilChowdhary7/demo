package internship.demo.repo;

import internship.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    // Custom query to find a student by username
    Optional<Student> findByUsername(String username);

    // Custom query to delete a student by username
    void deleteByUsername(String username);
}
