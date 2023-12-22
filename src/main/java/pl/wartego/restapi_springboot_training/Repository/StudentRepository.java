package pl.wartego.restapi_springboot_training.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wartego.restapi_springboot_training.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByEmail(String email);
}
