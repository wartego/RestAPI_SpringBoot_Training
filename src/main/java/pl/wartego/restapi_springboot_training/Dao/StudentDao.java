package pl.wartego.restapi_springboot_training.Dao;

import pl.wartego.restapi_springboot_training.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1,new Student(1,"Said","Computer science","coo@wp.pl"));
                put(2,new Student(2,"Tom","Network","coo2@wp.pl"));
                put(3,new Student(3,"Mark","Science","coo3@wp.pl"));
                put(4,new Student(4,"Asasa","Byy bye","coo4@wp.pl"));
                put(5,new Student(5,"Arnold","Why you","coo5@wp.pl"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return students.values();
    }
}
