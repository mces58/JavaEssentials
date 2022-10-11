package com.mc_es.spring.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mc_es.spring.entitiy.Student;
import com.mc_es.spring.error.StudentErrorResponse;
import com.mc_es.spring.error.StudentNotFoundException;

@RestController
@RequestMapping(value = "/api")
public class StudentRestController {
	private List<Student> students;

	@PostConstruct
	public void load() {
		students = new ArrayList<Student>();
		students.add(new Student(0, "Can", "Eser", 21));
		students.add(new Student(1, "Emirhan", "Eser", 13));
		students.add(new Student(2, "Furkan", "Eser", 19));
	}

	@GetMapping(value = "/students")
	public List<Student> getStudents() {
		return students;
	}

	@GetMapping(value = "/students/{studentid}")
	public Student getStudentByid(@PathVariable(name = "studentid") int studentid) {

		if (studentid > this.students.size() || studentid < 0) {
			throw new StudentNotFoundException("Bu id degerine sahip ogrenci yok: " + studentid);
		}

		return this.students.get(studentid);
	}

	// @ExceptionHandler, isaret ettigi bir yada birden fazla exception tipinin
	// eklendigi fonksiyon tarafindan islenmesini saglar. Bu sayede exceptionlari
	// tiplerine gore ayirip, istemciye iletilen yanitin her bir exception tipi icin
	// ozellestirilmesine olanak tanir.

	// metinsel bir istekte bulunursak yine json tipine donusturemez bu metot
	// dolayisiyla metinsel istekte bulundumuzda ona gore davranacak metot
	// yazmaliyiz. bu metot sadece arrayin sinirlari disinda bir istek
	// olursa calisir
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception) {

		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value()); // 404, 500..
		error.setMessage(exception.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

	// burada parametreyi exception seklinde gonderdik boylece her turlu hatayi
	// yakalamak mumkun olacak
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception exception) {

		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value()); // 404, 500..
		error.setMessage(exception.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
