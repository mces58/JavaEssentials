package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
	public static void main(String[] args) {
		printCities();
		// printTurkeyCities();
		// searchCity();
		// orderBy();
		// groupBy();
		// insert();
		// update();
		// delete();
	}

	// Session-factory
	// Hazırda bekletme yapılandırma dosyasını okur
	// Oturum nesneleri oluşturur
	// Ağır nesne
	// Uygulamanızda yalnızca bir kez oluşturun
	// burada fabrikamizi kurduk klasik bir yapidir.lakin yinede ezbere kod
	// yazilmamalidir. cunku goruldugu gibi Configuration()'dan nokta koyarak
	// ilerledik yani configure() aslinda Configuration'un metodudur.
	public static SessionFactory sessionFactory() {
		SessionFactory factory = new Configuration()
				.configure("hibernateForSqlServer.cfg.xml") // xml dosyamizin adini verdik																
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		return factory;
	}

	// Session
	// JDBC bağlantısını sarar
	// Nesneleri kaydetmek/almak için kullanılan ana nesne
	// Kısa ömürlü nesne
	// SessionFactory'den alındı
	// oturum aldik fabrikadan ve sorgu yollamak icin session olusturulur
	public static void printCities() {
		SessionFactory factory = sessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();// sorgular bu iki transaction arasinda yapilir
			// session.beginTransaction(); ikiside ayni anlama geliyor
			Query<City> query = session.createQuery("FROM City", City.class);
			/*
			 * ONEMLI NOT
			 * 
			 * Burada SQL dilini kullanmiyoruz yani select * from Cities
			 * diye bir sorgu yazmiyoruz. Burada kullandigimiz dil 
			 * HQL yani Hibernate Query Language.
			 * 
			 * Veri tabanin da tablomuzun adi Cities lakin biz burada 
			 * sorguyu gonderirken City seklinde gonderiyoruz. Nedeni 
			 * class'in adini gonderiyoruz. yani FROM City diye gonderdigimiz
			 * sorgu da ki City class adidir. Cities diye gondermiyecegiz.
			 * Cities tablo adi City class adidir.
			 */

			List<City> cities = query.getResultList();
			// sorguyu gonderdik select * from City ile ayni sorgudur
			// bunu da bir listeye attik

			for (City city : cities) {
				System.out.println(city.toString());// listeyi yazdirdik
			}
			System.out.println("Boyutu: " + cities.size());
			session.getTransaction().commit();
			// sorgular bu iki transaction arasinda yapilir

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			session.close(); // oturumu (session) kapattik
			factory.close();// fabrikayi kapadik
		}
	}

	public static void printTurkeyCities() {
		SessionFactory factory = sessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();
			// session.beginTransaction(); ikiside ayni anlama geliyor

			List<City> cities = session.createQuery("FROM City WHERE countryCode = 'TUR'", City.class).getResultList();
			// printCities fonksiyonu ile ayni kod lakin sorguyu degistirdik
			// kosullar ekledik
			/*
			 * Onemli not
			 * Buradaki sorgudaki City class adidir.
			 * countryCode ise field ismidir. Yani veritabaninda Country_code
			 * seklinde iken burada field'lari adlarini kullanarak sorguyu gonderiyoruz
			 * 
			 */
			
			for (City city : cities) {
				System.out.println(city.toString());
			}
			System.out.println("Boyutu: " + cities.size());
			session.getTransaction().commit();
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void searchCity() {
		SessionFactory factory = sessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();
			// session.beginTransaction(); ikiside ayni anlama geliyor

			List<City> cities = session.createQuery("FROM City AS C WHERE C.cityName LIKE '%kar%'", City.class)
					.getResultList();

			for (City city : cities) {
				System.out.println(city.toString());
			}
			System.out.println("Boyutu: " + cities.size());
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void orderBy() {
		SessionFactory factory = sessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			List<City> cities = session.createQuery("FROM City AS C ORDER BY C.cityName DESC", City.class).getResultList();

			for (City city : cities) {
				System.out.println(city.toString());
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void groupBy() {
		SessionFactory factory = sessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			List<String> countryCodes = session
					.createQuery("SELECT C.countryCode FROM City AS C GROUP BY C.countryCode", String.class).getResultList();
			// gruplama isleminde GROUP BY kullanilir . hepsinden bir tane gelir
			// burada bir kolonu cektigimiz icin Listeyi String turunde yaptik

			for (String countryCode : countryCodes) {
				System.out.println(countryCode);
			}
			System.out.println("Boyutu: " + countryCodes.size());
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void insert() {
		SessionFactory factory = sessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			City city = new City();
			city.setCityName("Aydin");// bu degerleri constructordan da verebilirdik farketmez yani
			city.setCountryCode("TUR");
			city.setDistrict("ege");
			city.setPopulation(400000);

			session.save(city);// veri tabanina eklemeye yarar
			session.getTransaction().commit();
			// transaction'nin faydalarindan biri de mesela iki sehir ekliyoruz
			// lakin ikinci sehiri eklerken bir hata cikti ve eklenemedi
			// dolayisiyla ilk eklenen sehiride eklendigi yerden geri alir
			// boylece veri tabanini koruma saglar bunun icin transaction yaziyoruz
			System.out.println("Kayit eklendi.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void update() {
		SessionFactory factory = sessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			// guncelleme islemi daha onceden varolan bir data uzerinde yapilir
			City city = session.get(City.class, 4084);
			// City class'indan 4084 id'ye sahip veriyi cektik
			// update etmek istedigimiz sehiri getirdik

			city.setPopulation(500000); // istedigimiz herhangi bir ozelligi tekrardan set edebiliriz
			// session.save(city); // update yaptiktan sonra tekrardan kaydettik
			// buna gerek bile yok commit yaptiktan sonra kendi 
			// guncellemeyi direk yapar
			
			// veri tabaninda olmayan bir kayidi guncellemek istersen hata alirsin dikkat et

			
			// session.createQuery("UPDATE City SET countryCode = 'TUR'").executeUpdate();
			// butun ulkelerin kodlarini tur yapar toplu guncelleme ornegi
			session.getTransaction().commit();
			System.out.println("Kayit guncellendi.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void delete() {
		SessionFactory factory = sessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			// silmek icin daha onceden o veri elimizde olmalidir
			City city = session.get(City.class, 4084);
			// silecegimiz sehiri id uzerinden yakaladik
			session.delete(city); // yakaladigimiz sehri sildik
			// veri tabaninda olmayan bir kayidi silersen hata alirsin dikkat et

			// session.createQuery("TRUNCATE TABLE City").executeUpdate();
			// tabloyu tamamen siler
			// executeUpdate() sadece guncellemeye yaramaz o genel bir isimlendirme
			// sonucta tabloda yaptigimiz her degisiklik bir guncellemedir.
			session.getTransaction().commit();
			System.out.println("Kayit silindi.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}
}
