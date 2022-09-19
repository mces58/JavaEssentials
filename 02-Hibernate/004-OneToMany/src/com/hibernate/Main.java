package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		// insert();
		// getBolum();
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
			// ONEMLI NOT
			// Foreign key'in null ozelligi olmasi gerekir cunku biz degerleri
			// girdikten sonra set fonksiyonu ile update yapiyoruz.
			// Insert isleminden sonra konsola bakarsan en son update yapiyor.
			// Bunu buradan da anlayabilirsin. Yine de ciktiyi buraya koyacagim
			/*
			Hibernate: 
			    insert 
			    into
			        Bolum
			        (bolum_adi) 
			    values
			        (?)
			Hibernate: 
			    insert 
			    into
			        Ogrenci
			        (ogrenci_adi, ogrenci_soyadi) 
			    values
			        (?, ?)
			Hibernate: 
			    insert 
			    into
			        Ogrenci
			        (ogrenci_adi, ogrenci_soyadi) 
			    values
			        (?, ?)
			Ogrenci eklendi
			Hibernate: 
			    update
			        Ogrenci 
			    set
			        bolum_id=? 
			    where
			        id=?
			Hibernate: // ISTE UPDATE ISLEMININ YAPILDIGI YER
			    update
			        Ogrenci 
			    set
			        bolum_id=? 
			    where
			        id=?			 
        */
			session.save(bolum);
			System.out.println("Ogrenci eklendi");
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
				// goruldugu gibi bolum uzerinden ogrencilere ulasiyorum.
				// ogrenciler uzerinden de bolume ulasamiyorum bunun sebebi
				// ManyToOne kullanmamis olmam. Yani suan uni-direction(tek-yon)
				// iliski olmasidir.
				// get fonksiyonu burada list'e ait bir fonksiyondur.
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
				// silinmesini istiyorsak cift yonlu baglamaliyiz yani ManyToOne
				// kullanmaliyiz ve cascade tipinide all yapmaliyiz
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
