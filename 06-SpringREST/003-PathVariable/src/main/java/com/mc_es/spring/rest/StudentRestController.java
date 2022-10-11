package com.mc_es.spring.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mc_es.spring.entitiy.Student;

@RestController
@RequestMapping(value = "/api")
public class StudentRestController {
	private List<Student> students;

	// bir nesne olusturulduktan hemen sonra herhangi uygulanan bir metoda giris
	// saglamasi ve o metodu isletmesidir.
	// @PostConstruct metodu yalnizca metod baslarinda uygulanabilen bir notasyon
	// turudur.
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

	// @PathVariable ve @RequestParam anotasyonlari gonderilen istegin icindeki
	// parametrelerdir.
	// Ortak yonu her ikisininde parametre olmasidir.
	// Eger elimizde bir url template varsa bu durumda @PathVariable kullanimi daha
	// uygundur.
	// Diger durumlar icinse @RequestParam daha kullanislidir.
	// ornekler:

	// http://localhost:8080/movies -- (/movies)
	// bu istek tum filmlerin listesini doner

	// http://localhost:8080/movies/1 -- (/movies/{moviesId})
	// bu istek id degeri 1 olan filmi doner

	// http://localhost:8080/movies/1/stars --(/movies/{movieId}/stars)
	// bu istek id degeri 1 oan filmin oyuncularinin listesini doner

	// http://localhost:8080/movies/1/stars/2 --(/movies/1/stars/2)
	// bu istek id degeri 1 olan filmin oyuncularindan id degeri 2 olani doner

	// dikkat ettiyseniz, baglanti adresi bir template halindedir. Toplamda 4 metot
	// mevcuttur.

	// @RequestParam ornegi inceliyelim:
	// http://localhost:8080/movies/search
	// filtresi tum kaynagi getirir

	// http://localhost:8080/movies/search/?name=saw
	// istedigimiz parametreleri zorunlu veya istege bagli yapabilecegimiz gibi
	// onlara default deger de verebiliriz

	// http://localhost:8080/movies/search?name=saw&country=abd
	// filmin adi saw olan ve ABD yapimi olan filmleri getir
	@GetMapping(value = "/students/{studentId}")
	public Student getStudentById(@PathVariable(name = "studentId") int studentId) {
		return this.students.get(studentId);
	}
}
