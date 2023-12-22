package pl.wartego.restapi_springboot_training.Service;

import pl.wartego.restapi_springboot_training.Dao.StudentDao;
import pl.wartego.restapi_springboot_training.Entity.Student;

import java.util.Collection;

public class StudentService {
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return this.studentDao.getAllStudents();
    }
}
