package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		// insert();
		// getBolum();
		// getOgrenci();
		// deleteBolum();
		// deleteOgrenci();
	}

	public static SessionFactory factory() {
		return new Configuration()
				.configure("hibernateForSqlServer.cfg.xml")
				.addAnnotatedClass(Ogrenci.class)
				.addAnnotatedClass(Bolum.class)
				.buildSessionFactory();
	}

	public static void insert() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			Bolum bolum = new Bolum("Bilgisayar Muhendisligi");

			Ogrenci ogrenci = new Ogrenci("Can", "Eser");
			Ogrenci ogrenci2 = new Ogrenci("Emos", "Eser");
			bolum.addOgrenci(ogrenci);
			bolum.addOgrenci(ogrenci2);

			session.save(bolum);
			System.out.println("Ogrenci eklendi");
			
			// addOgrenci diye bir fonksiyon olusturmak istemiyorsan 
			// baska bir sekilde de ekleme yapabiliriz. onu gosterelim:
			// List<Ogrenci> list = Arrays.asList(ogrenci, ogrenci2);
			// bolum.setOgrenci(list);
			// session.save(bolum);
			// boylede ekleme yapabiliriz
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void getBolum() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int bolumId = 1;

			Bolum bolum = session.get(Bolum.class, bolumId);

			if (bolum != null) {
				System.out.println("Ogrencinin adi: " + bolum.getOgrenci().get(bolumId).getOgrenciAdi());
				System.out.println("Ogrencinin soyadi: " + bolum.getOgrenci().get(bolumId).getOgrenciSoyadi());
				System.out.println("Ogrencinin bolumu: " + bolum.getBolumAdi());
				// get fonksiyonu burada list'e ait bir fonksiyondur.
				// goruldugu gibi bolum uzerinden ogrencilere ulasiyorum.
			} else {
				System.out.println("Bu id'ye sahip bolum yok");
				return;
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void getOgrenci() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int ogrenciId = 1;

			Ogrenci ogrenci = session.get(Ogrenci.class, ogrenciId);

			if (ogrenci != null) {
				System.out.println("Ogrencinin adi: " + ogrenci.getOgrenciAdi());
				System.out.println("Ogrencinin soyadi: " + ogrenci.getOgrenciSoyadi());
				System.out.println("Ogrencinin bolumu: " + ogrenci.getBolum().getBolumAdi());
				// goruldugu gibi ogrenci uzerinden bolume ulasabiliyorum
				// ManyToOne sayesinde

			} else {
				System.out.println("Bu id'ye sahip ogrenci yok");
				return;
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void deleteBolum() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int bolumId = 1;

			Bolum bolum = session.get(Bolum.class, bolumId);

			if (bolum != null) {
				session.delete(bolum);
				System.out.println("Bolum silindi");
				// bolum silinirse ona bagli ogrenciler de silinir.
				// cunku bolum yok ise ogrencide olmamalidir.
			} else {
				System.out.println("Bu id'ye sahip bolum yok");
				return;
			}

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void deleteOgrenci() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int ogrenciId = 1;

			Ogrenci ogrenci = session.get(Ogrenci.class, ogrenciId);

			if (ogrenci != null) {
				session.delete(ogrenci);
				System.out.println("Ogrenci silindi");
				// ogrenci silindiginde bolum silinmez dogrusuda budur.
				// bunu saglayanda Ogrenci class'inda bolum field'nin
				// cascadeType ozelliginde remove olmadigi icin
			} else {
				System.out.println("Bu id'ye sahip ogrenci yok");
				return;
			}

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}
}
