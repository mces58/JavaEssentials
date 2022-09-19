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

	public static void insert() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			Telefon cep = new Telefon("05340755058", "Cep");
			Telefon ev = new Telefon("0216 35 65", "Ev");
			Kullanici kullanici = new Kullanici("Can", "Eser", new Date());
			kullanici.addTelefon(cep);
			kullanici.addTelefon(ev);
			session.save(kullanici);

			System.out.println("Kullanici kaydedildi");

			// Kullanici kullanici2 = new Kullanici("Emos", "Eser", new Date());
			// kullanici2.addTelefon(cep);
			// kullanici2.addTelefon(ev);
			// session.save(kullanici2);
			// boyle bir insert olmamalidir.
			// cunku bir numaranin bir sahibi olabilir
			// insert yaparken is kurallarini belirtmen gerekir.
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	// kullanici uzerinden telefonlara ulasma
	// bunu OneToMany sagliyor
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
	// bunu ManyToOne sagliyor
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
	// Bunu Kullanici sinifindaki CascadeType.all sagliyor
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
	// Bunu saglayan Telefon sinifindaki CascadeType ozelliginde remove olmamasidir.
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
