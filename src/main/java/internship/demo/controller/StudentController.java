package internship.demo.controller;

import internship.demo.model.Student;
import internship.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Create or Update Student
    @PostMapping("/addOrUpdate")
    public ResponseEntity<Student> addOrUpdateStudent(@RequestBody Student student) {
        Student savedStudent = studentService.addOrUpdateStudent(student);
        return ResponseEntity.ok(savedStudent);
    }

    // Get a List of All Students
    @GetMapping("/list")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

}
