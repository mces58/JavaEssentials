package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// insert();
		// deleteMusteri();
		// deleteBilet();
	}

	public static SessionFactory factory() {
		return new Configuration()
				.configure("hibernateForSqlServer.cfg.xml")
				.addAnnotatedClass(Bilet.class)
				.addAnnotatedClass(Musteri.class)
				.buildSessionFactory();
	}

	public static void insert() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			Bilet bilet = new Bilet(new Date(), 10, 25.5); // bilet olustu
			Musteri musteri = new Musteri("Can", "Eser"); // musteri olustu
			musteri.setBilet(bilet); // musteriye bileti verdik

			// artik bileti kaydetmeye gerek yok cascade.all ile musteri
			// kaydedilince bilette kayit olacak
			// session.save(bilet); // bileti kaydet
			// System.out.println("Bilet kaydedildi");

			session.save(musteri); // musteriyi kaydet
			System.out.println("Musteri kaydedildi");

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void deleteMusteri() {
		// musteriyi silince bilette siliniyor
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int musteriId = 1;

			Musteri musteri = session.get(Musteri.class, musteriId);

			if (musteri != null) {
				session.delete(musteri);
				System.out.println("Musteri silindi");
			} else {
				System.out.println("Bu id'ye sahip musteri yok");
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

	public static void deleteBilet() {
		// bileti silince musteride siliniyor
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int biletId = 1;

			Bilet bilet = session.get(Bilet.class, biletId);

			if (bilet != null) {
				session.delete(bilet);
				System.out.println("Bilet silindi");
			} else {
				System.out.println("Bu id'ye sahip bilet yok");
				return;
			}
			session.getTransaction().commit();
			/*
			 * bu silme islemi ile hem musteriyi hem de bileti siliniyor Lakin biz musteriyi
			 * tutup bileti silmek istersek bilet'in cascade type degerini degistirmek
			 * gerekir.cascade type'da remove olmamalidir. ornek kod: 
			 * cascade = cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			 * CascadeType.REFRESH }
			 * seklinde olabilir. Bunu simdi boyle ayarlasak bile
			 * calismayabilir.Cunku foreign key var Nedeni su sen bileti 
			 * sildiginde musteri tablosunda onunla iliski varsa silemezsin
			 * 
			 * id	satis_tarihi	koltuk_no	bilet_fiyati
			 *	1	  ...				10			25,50
			 * 
			 * bunu sildiginde buna bagli musterinin alaninida null yapman gerekir
			 * 
			 * id	musteri_adi	musteri_soyadi	bilet_id
			 *	1		Can			Eser			1
			 * 
			 * bilet sildiginde musteri tablosunda hala 1 yaziyor olacak dolayisiyla
			 * burayida duzeltmen gerekir.
			 * 
			 * id	musteri_adi	musteri_soyadi	bilet_id
			 *	1		Can			Eser			null
			 * 
			 * bunun kodu ise: bilet.getMusteri().setBilet(null);
			 * 
			 * ama tum bunlarin hepsinin olabilmesi icin yani null deger 
			 * atayabilmen icin not null olmamalidir. Suan bizim veri tabaninda
			 * not null oldugu icin null degerini atayamazsin
			 * 
			 */

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

}
