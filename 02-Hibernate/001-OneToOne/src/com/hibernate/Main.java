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
			// eger musteriye biletini vermeden kaydetmeye calisirsan hata alirsin
			// cunku veritabaninda musteri tablosunada bilet_id kolonu not null
			// ozelligi oldugu icin. Default olarak null olsaydi musteriye bileti
			// vermeyebilirdin

			session.save(bilet); // bileti kaydet
			// bilet daha once kaydedilir cunku bilet musteriden daha oncelikli
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
				System.out.println("Biletin satis tarihi: " + bilet.getSatisTarihi());
				System.out.println("Koltuk no: " + bilet.getKoltukNo());
				System.out.println("Fiyati: " + bilet.getBiletFiyati());
				// burada kisa bir not:
				// getMusteri fonksiyonunda musteriden bilete gecis yapabilirken
				// bunu burada yapamiyoruz.
				// biz eger ki biletten musteriye gecis yapmak
				// isteseydik bunu mappedBy ile yapacaktik
				// ileriki projelerde bu konuyu isledik.
				// Suan ki yapiya uni-direction(tek-yonlu) iliski denir
				// musteriden bilete gecis var iken (Musteri.class ---> Bilet.class : var)
				// biletten musteriye gecis yok (Bilet.class ---> Musteri.class : yok)

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

	public static void deleteMusteri() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			// silinecek musteriyi yakala
			int musteriId = 1;

			Musteri musteri = session.get(Musteri.class, musteriId);

			if (musteri != null) {
				session.delete(musteri);
				System.out.println("Musteri silindi.");
				// bir musteriyi sildigimizde biletide silmemiz gerekir
				// ayni sekilde bir bileti de sildigimizde onu alan musteriye de
				// silmemiz gerekir cunku bilet yoksa musteri yoktur, musteri yoksa
				// bilet yoktur. Varolmalari birbirne baglidirlar.
				// bu projede oyle yapmadik ama bunu cascade type konusunda
				// yapacagiz simdilik musteri silindiginde bilet otomatik
				// olarak silinmeyecek
			} else {
				System.out.println("Bu id'ye sahip musteri yok");
			}
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}

	// veritabaninda bir bilet silerken once o bilete ait musteri var mi
	// diye kontrol edilmelidir. Cunku bunlar birbirine foreign key ile baglilar
	// once o bilete ait musteri silinip sonra o bilet silinmelidir.
	// ilk bilet silinmeye calisilirsa hata alinir
	public static void deleteBilet() {
		SessionFactory factory = factory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			int biletId = 1;

			Bilet bilet = session.get(Bilet.class, biletId);

			if (bilet != null) {
				session.delete(bilet);
				System.out.println("Bilet silindi.");
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
