
public class Main {
	public static void main(String [] args) {
		
		// bunu kullaman icin constructori yoruma al
		/*
		DataBaseManager dataBaseManager = new DataBaseManager();
		dataBaseManager.ekle(new MongoDBDataBase());
		dataBaseManager.sil(new MongoDBDataBase());
		dataBaseManager.guncelle(new MongoDBDataBase());
		dataBaseManager.getir(new MongoDBDataBase());
		
		System.out.println();
		
		dataBaseManager.ekle(new MySqlDataBase());
		dataBaseManager.sil(new MySqlDataBase());
		dataBaseManager.guncelle(new MySqlDataBase());
		dataBaseManager.getir(new MySqlDataBase());
		
		System.out.println();
		*/
		
		DataBaseManager dataBaseManager = new DataBaseManager(new MongoDBDataBase());
		dataBaseManager.ekle();
		dataBaseManager.sil();
		dataBaseManager.guncelle();
		dataBaseManager.getir();
		
		// MySqlDataBase'de gondermek istiyorsan MongoDBDataBase sil onu yaz
		// yeni bir veri tabani eklesek bile eski yazdigimiz kodlarda degisiklik olmayacak 
		// boylece surekliligimizi saglamis olduk 
	}

}
