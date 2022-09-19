package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// insert();
		// getOgrenci();
		// deleteKurs();
		// deleteOgrenci();
	}

	public static SessionFactory factory() {
		return new Configuration()
				.configure("hibernateForSqlServer.cfg.xml")
				.addAnnotatedClass(Kurs.class)
				.addAnnotatedClass(Ogrenci.class)
				.buildSessionFactory();
	}

	public static void insert() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			Kurs kurs = new Kurs("matematik");
			Kurs kurs2 = new Kurs("kodlama");
			Kurs kurs3 = new Kurs("turkce");

			session.save(kurs);
			session.save(kurs2);
			session.save(kurs3);
			System.out.println("Kurslar kaydedildi");

			Ogrenci ogrenci = new Ogrenci("Can", "Eser", "can@info.com");
			Ogrenci ogrenci2 = new Ogrenci("Emos", "Eser", "emos@info.com");
			Ogrenci ogrenci3 = new Ogrenci("Furkan", "Eser", "furkan@info.com");

			kurs.addOgrenci(ogrenci);
			kurs.addOgrenci(ogrenci2);

			kurs2.addOgrenci(ogrenci);
			kurs2.addOgrenci(ogrenci3);

			kurs3.addOgrenci(ogrenci2);
			kurs3.addOgrenci(ogrenci3);

			session.save(ogrenci);
			session.save(ogrenci2);
			session.save(ogrenci3);

			System.out.println("Ogrenciler kaydedildi");

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
				System.out.println("Ogrenci: " + ogrenci);
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

	public static void deleteKurs() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int kursId = 1;
			Kurs kurs = session.get(Kurs.class, kursId);

			if (kurs != null) {
				session.delete(kurs);
				System.out.println("Kurs silindi.");
			} else {
				System.out.println("Bu id'ye sahip kurs yok");
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
				System.out.println("Ogrenci silindi.");
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
