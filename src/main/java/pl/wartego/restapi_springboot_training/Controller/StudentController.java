package pl.wartego.restapi_springboot_training.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.wartego.restapi_springboot_training.Entity.Student;
import pl.wartego.restapi_springboot_training.Repository.StudentRepository;
import pl.wartego.restapi_springboot_training.Service.StudentService;

import java.util.Collection;


@Controller
@RequestMapping(path = "/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewStudent(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email){
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setEmail(email);
        studentRepository.save(student);
        return String.format("User %s created with success",firstName);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Student> getAllUsers(){
        return studentRepository.findAll();
    }
//    private StudentService studentService;
//    public Collection<Student> getAllStudents(){
//        return studentService.getAllStudents();
//    }
}
