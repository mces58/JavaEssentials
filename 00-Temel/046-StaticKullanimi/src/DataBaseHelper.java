
public class DataBaseHelper {
	public static class Crud {// crud = create , read , update , delete

		// class icinde class'a inner class denir.

		public static void update() { // static bir metot varsa classta static olmalidir
			System.out.println("Veri g�ncellendi.");
		}

		public static void delete() {
			System.out.println("Veri silindi.");
		}
	}

	// bir tane daha inner class yazalim

	public static class Connection {
		public static void updateConnetion() {
			System.out.println("Veri baglandi.");
		}
	}
}
