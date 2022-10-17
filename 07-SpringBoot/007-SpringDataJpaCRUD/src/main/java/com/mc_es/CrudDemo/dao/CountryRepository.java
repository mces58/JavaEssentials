package com.mc_es.CrudDemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc_es.CrudDemo.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

	/*
	 * Simdi sorun su: Boyle Country icin bir DAO olusturmayi gorduk. Country DAO
	 * icin bir interface tanimladik. ve sonra bir Country DAO uygulamasini
	 * implement ettik ve biz butun bu kodu yazdik.
	 * 
	 * Ama simdi soru su ki, ne yapmamiz gerekiyorda musteri, ogrenci gibi baska bir
	 * isletme icin bir daha DAO interface'leri olusturarak onlari tekrar mi
	 * implement etmemiz gerekiyor. Oysa ki temel de yaptigimiz seyler ayni; getir,
	 * sil, ekle, guncelle.. Degisenler isletmelerin tipleri ve primary key'leri.
	 * 
	 * Spring data ile bu tekrarlardan kurtuluyoruz. JpaRepository extends ederek
	 * crud ve extra islemler direkt JpaRepository icinde vardir bizimde sadece bu
	 * islemleri miras almamiz yeterlidir.
	 */

	/*
	 * Spring Data, JPA’deki bu soyutlugu bir tik oteye tasimis ve MongoDB, Redis,
	 * Cassandra, Solr, Neo4j gibi NoSQL teknolojilerin de aralarinda bulundugu
	 * onlarca veri kaynagina erisimi ayni APi ile saglamistir. Repository arayuz ve
	 * bunu genisleten bircok arayuz sayesinde, kullanima hazir metodlar ile sik
	 * kullanilan sorgulamalardan, adindan filtreleme yapilabilen ozel metodlara
	 * kadar bircok kolaylik saglamistir.
	 * 
	 * ornegin; kullandiginiz veri kaynagi ister MySQL olsun, ister MongoDB,
	 * musterileri adina gore filtrelemek istediginizde yalnizca asagidaki metodu
	 * bildirmeniz yeterli oluyor. List<Customer> findByName(String name);
	 */

	// Spring Data, @Entity notu ile isaretlediginiz siniflar icin, veritabaninda
	// tablolari ve sutunlarini otomatik olusturur.

	// kendimize ozel metotlarda yazabiliriz
	// kitaya gore ulke getirecek
	public List<Country> findByContinent(String continent);

	public List<Country> findByOrderByCountryCodeDesc();

	/*
	 * biz bu metotlar hakkinda diger class'larda hicbir sey yapmadik ama nasil
	 * oluyorda countryCode gore siraliyor veya kita getirebiliyor.
	 * 
	 * Metod Adindan Sorgu Uretimi
	 * 
	 * Spring Data, repository arayuzlerinde yazdigimiz metodlarin adindan sorgular
	 * uretebilir. Asagidaki koda bakacak olursak;
	 * 
	 * List<Country> findByContinent(String continent);
	 * 
	 * girilen kitaya gore bir listeyi dondugunu gorursunuz. Metodun adini
	 * findByContinent olarak belirledigimiz icin; Spring Data, bizim bu kayitlari
	 * kitaya gore filtrelemek istedigimizi anliyor ve buna gore
	 * 
	 * ... where continent = ? seklindeki sorguyu otomatik uretiyor. Metoda gecilen
	 * continent parametresini, sorgu kosulundaki ilgili alana yerlestiriyor. Yani
	 * biz customerRepository.findByContinent("asia") dedigimizde, kitasi asya olan
	 * ulkelerin listesini elde ediyoruz.
	 * 
	 * Bu dile JPQL denir.
	 * 
	 * Bazi metot isimleri ile sorgulama yapma:
	 * 
	 * Keyword				sample								jpql snippet
	 * 
	 * And			findByLastnameAndFirstname		... where x.lastname = ?1 and x.firstname = ?2
	 * 
	 * Or			findByLastnameOrFirstname		... where x.lastname = ?1 or x.firstname = ?2
	 * 
	 * Is, Equals	findByFirstname, findByFirstnameIs, findByFirstnameEquals	... where х.firstname = ?1
	 * 
	 * Between		findByStartDateBetween			... where x.startDate between ?1 and ?2
	 * 
	 * LessThan		findByAgeLessThan				... where x.age < ?1
	 * 
	 * LessThanEqual findByAgeLessThanEqual			... where x.age <= ?1
	 * 
	 * GreaterThan	findByAgeGreaterThan			... where x.age > ?1
	 * 
	 * GreaterThanEqual findByAgeGreaterThanEqual	... where x.age >= ?1
	 * 
	 * After		findByStartDateAfter			... where x. startDate > ?1
	 * 
	 * Before		findByStartDateBefore			... where x.startDate < ?1
	 * 
	 * NotLike		findByFirstnameNotLike			... where x.firstname not like ?1
	 * 
	 * StartingWith	findByFirstnameStartingWith		... where x.firstname like ?1(parameter bound with appended %)
	 * 
	 * EndingWith	findByFirstnameEndingWith		... where x.firstname like ?1(parameter bound with prepended %)
	 * 
	 * Containing	findByFirstnameContaining		... where x.firstname like ?1(parameter bound wrapped in %)
	 * 
	 * OrderBy		findByAgeOrderByLastnameDesc	... where x.age = ?1 order by x.lastname desc
	 * 
	 * Not			findByLastnameNot				... where x.lastname <> ?1
	 * 
	 * In			findByAgeIn(Collection<Age> ages)	... where x.age in ?1
	 * 
	 * NotIn		findByAgeNotIn(Collection<Age> ages)	... where x.age not in ?1
	 * 
	 * True			findByActiveTrue()				... where x.active = true
	 * 
	 * False		findByActiveFalse()				... where x.active = false
	 * 
	 * IgnoreCase	findByFirstnameIgnoreCase		... where UPPER (x.firstame) = UPPER(?1)
	 * 
	 */
	
	// illa jpql bilmemize de gerek yok fonksiyonun basina sql cumlesini yazarak
	// o fonksiyonun ne yapacaginida belirleyebiliriz
	
//	public interface UserRepository extends JpaRepository<User, Long> {
//
//		  @Query("select u from User u where u.emailAddress = ?1")
//		  User findByEmailAddress(String emailAddress);
//		}
	
//	public interface UserRepository extends JpaRepository<User, Long> {
//
//		  @Query("select u from User u where u.firstname like %?1")
//		  List<User> findByFirstnameEndsWith(String firstname);
//		}
	
//	public interface UserRepository extends JpaRepository<User, Long> {
//
//		  @Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1", nativeQuery = true)
//		  User findByEmailAddress(String emailAddress);
//		}

	/*
	 * parametreleri ayri da verebiliriz
	 */
	
//	public interface UserRepository extends JpaRepository<User, Long> {
//
//		  @Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
//		  User findByLastnameOrFirstname(@Param("lastname") String lastname,
//		                                 @Param("firstname") String firstname);
//		}

}
