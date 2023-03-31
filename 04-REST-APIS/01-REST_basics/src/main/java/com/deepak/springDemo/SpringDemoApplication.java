package com.deepak.springDemo;

import com.deepak.springDemo.dao.StudentDAO;
import com.deepak.springDemo.dao.StudentDAOImpl;
import com.deepak.springDemo.entity.Student;
import jakarta.persistence.TypedQuery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
//		return runner -> {
//			createUser(studentDAO);
//			getUser(studentDAO, 8);
//			printQuery(studentDAO, "From Student");
//		};
//	}
//
//	public void printQuery(StudentDAO studentDAO,String query){
//		List<Student> students = studentDAO.queryResults(query);
//		for (Student student : students) {
//			System.out.println(student);
//		}
//
//	}
//	public void getUser(StudentDAO studentDAO, Integer id){
//		Student student = studentDAO.findByID(id);
//		if (student == null){
//			System.out.println("User Not Found");
//			return;
//		}
//		System.out.println(student);
//	}
//
//	public void createUser(StudentDAO studentDAO){
//		//creating a new user
//		System.out.println("Creating a new user");
//
//		Student student = new Student("paul", "Joe", "paul@gmail.com");
//		Student student1 = new Student("Saul", "esther", "Saul@gmail.com");
//		Student student2 = new Student("Mally", "Joe", "Mally@gmail.com");
//
//		//save the student object
//		System.out.println("Saving the student object");
//		studentDAO.save(student);
//		studentDAO.save(student1);
//		studentDAO.save(student2);
//
//		//printing the student id
//		System.out.println("Saved student, Generated Id is: " + student.getId());
//	}
}
