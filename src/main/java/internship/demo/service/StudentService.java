package internship.demo.service;

import internship.demo.model.Student;
import internship.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    // Create or Update Student
    public Student addOrUpdateStudent(Student student) {
        Optional<Student> existingStudent = repo.findByUsername(student.getUsername());
        if (existingStudent.isPresent()) {
            // Update the existing student
            Student updateStudent = existingStudent.get();
            updateStudent.setFirstName(student.getFirstName());
            updateStudent.setMiddleName(student.getMiddleName());
            updateStudent.setLastName(student.getLastName());
            updateStudent.setPassword(student.getPassword());
            updateStudent.setPasswordResetRequired(student.isPasswordResetRequired());
            updateStudent.setEmail(student.getEmail());
            updateStudent.setContact(student.getContact());
            updateStudent.setExpirationDate(student.getExpirationDate());
            updateStudent.setDescription(student.getDescription());
            updateStudent.setTimeout(student.getTimeout());
            updateStudent.setDateTimeFormat(student.getDateTimeFormat());
            updateStudent.setRoleNameList(student.getRoleNameList());
            updateStudent.setScopeNameList(student.getScopeNameList());
            updateStudent.setPrimaryGroupName(student.getPrimaryGroupName());
            updateStudent.setSecondaryGroupNameList(student.getSecondaryGroupNameList());
            updateStudent.setLanguage(student.getLanguage());
            updateStudent.setOrganization(student.getOrganization());
            updateStudent.setTimeZone(student.getTimeZone());
            updateStudent.setMemo(student.getMemo());
            return repo.save(updateStudent);
        } else {
            // Add new student
            return repo.save(student);
        }
    }

    // Get a List of All Students
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
