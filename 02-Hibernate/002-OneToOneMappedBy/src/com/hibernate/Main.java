package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// insert();
		// getMusteri();
		// getBilet();
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

			session.save(bilet); // bileti kaydet
			System.out.println("Bilet kaydedildi");

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

	public static void getMusteri() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			// getirilecek musteriyi yakala
			int musteriId = 1;

			// bu id'ye sahip bir musteri yok ise nesne null degerini alir
			Musteri musteri = session.get(Musteri.class, musteriId);

			if (musteri != null) {
				System.out.println("Adi: " + musteri.getMusteriAdi());
				System.out.println("Soyadi: " + musteri.getMusteriSoyadi());
				System.out.println("Bilet satin alim tarihi: " + musteri.getBilet().getSatisTarihi());
				System.out.println("Koltuk sirasi: " + musteri.getBilet().getKoltukNo());
				System.out.println("Bilet fiyati: " + musteri.getBilet().getBiletFiyati());

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

	public static void getBilet() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int biletId = 1;

			// bu id'ye sahip bir bilet yok ise nesne null degerini alir
			Bilet bilet = session.get(Bilet.class, biletId);

			if (bilet != null) {
				System.out.println("Adi: " + bilet.getMusteri().getMusteriAdi());
				System.out.println("Soyadi: " + bilet.getMusteri().getMusteriSoyadi());
				System.out.println("Bileti satin alma tarihi: " + bilet.getSatisTarihi());
				System.out.println("Koltuk sirasi: " + bilet.getKoltukNo());
				System.out.println("Biletin fiyati: " + bilet.getBiletFiyati());
				// onceki projede biletten musteriye gecemiyorduk simdi mappedBy
				// ile gecebiliyoruz. Cift yonlu iliski oldu.
				// (Bilet.class ---> Musteri.class : var)
				// (Musteri.class ---> Bilet.class : var)
				// Bu yapiya bi-direction (cift-yon) denir.

			} else {
				System.out.println("Bu id'ye sahip bilet yok");
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
