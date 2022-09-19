package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		// insert();
		// deleteKurs();
		// deleteEgitmen();
	}

	public static SessionFactory factory() {
		return new Configuration()
				.configure("hibernateForSqlServer.cfg.xml")
				.addAnnotatedClass(Egitmen.class)
				.addAnnotatedClass(Kurs.class)
				.buildSessionFactory();
	}

	public static void insert() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			Egitmen egitmen = new Egitmen("can", "eser", "caneser@gmail.com");
			Egitmen egitmen2 = new Egitmen("emos", "eser", "emoseser@gmail.com");
			Kurs kurs = new Kurs("Matematik");
			Kurs kurs2 = new Kurs("Kodlama");

			egitmen.addKurs(kurs);
			egitmen2.addKurs(kurs2);

			session.save(egitmen);
			session.save(egitmen2);
			session.save(kurs);
			session.save(kurs2);

			session.getTransaction().commit();
			System.out.println("Kayit eklendi");

		} catch (Exception e) {
			System.out.println(e.getMessage());
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

			int id = 1;
			Kurs kurs = session.get(Kurs.class, id);

			if (kurs != null) {
				session.delete(kurs);
				System.out.println("Kurs silindi");
			} else {
				System.out.println("Bu id'ye ait kurs bulunmamaktadir");
				return;
			}
			session.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	public static void deleteEgitmen() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int id = 1;
			Egitmen egitmen = session.get(Egitmen.class, id);

			if (egitmen != null) {
				session.delete(egitmen);
				System.out.println("Egitmen silindi");
			} else {
				System.out.println("Bu id'ye ait egitmen bulunmamaktadir");
				return;
			}
			session.getTransaction().commit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}
}
