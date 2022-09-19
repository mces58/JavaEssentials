package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		// insert();
		// getKullanici();
		// getTelefon();
		// deleteKullanici();
		// deleteTelefon();
	}

	public static SessionFactory factory() {
		return new Configuration()
				.configure("hibernateForSqlServer.cfg.xml")
				.addAnnotatedClass(Kullanici.class)
				.addAnnotatedClass(Telefon.class)
				.buildSessionFactory();
	}

	// onceki projeden tek farki insert islemlerinde degisiklik yaptik
	// geri kalan fonksiyonlar ayni
	public static void insert() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			Kullanici kullanici = new Kullanici("Can", "Eser", new Date());
			Telefon cep = new Telefon("05340755058", "Cep");
			Telefon ev = new Telefon("0216 35 65", "Ev");

			cep.setKullanici(kullanici);
			ev.setKullanici(kullanici);

			kullanici.addTelefon(ev);
			kullanici.addTelefon(cep);
			session.save(kullanici);

			System.out.println("Veriler kaydedildi");

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	// kullanici uzerinden telefonlara ulasma
	public static void getKullanici() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int kullaniciId = 1;

			Kullanici kullanici = session.get(Kullanici.class, kullaniciId);

			if (kullanici != null) {
				System.out.println("Kullanici bilgileri:\n" + kullanici.toString());
			} else {
				System.out.println("Bu id'ye sahip kullanici yok");
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

	// telefon uzerinden kullaniciya ulasma
	public static void getTelefon() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int telefonId = 1;

			Telefon telefon = session.get(Telefon.class, telefonId);

			if (telefon != null) {
				System.out.println("Kullanici bilgileri:\n" + telefon.getKullanici().toString());
			} else {
				System.out.println("Bu id'ye sahip telefon yok");
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

	// kullanici silinirse ona ait telefonlarinda silinmesi gerekir
	public static void deleteKullanici() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int kullaniciId = 1;

			Kullanici kullanici = session.get(Kullanici.class, kullaniciId);

			if (kullanici != null) {
				session.delete(kullanici);
				System.out.println("Kullanici silindi.");
			} else {
				System.out.println("Bu id'ye sahip kullanici yok");
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

	// telefon silinirse ona ait kullanici silinmemelidir.
	public static void deleteTelefon() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int telefonId = 1;

			Telefon telefon = session.get(Telefon.class, telefonId);

			if (telefon != null) {
				session.delete(telefon);
				System.out.println("Telefon silindi.");
			} else {
				System.out.println("Bu id'ye sahip telefon yok");
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
