
public class Main {
	public static void main(String[] args) {
		// mantik C ile ayni
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3x3 matrix

		// ekrana bastiralim
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			} // matrix goruntusunu vermmek icin print seklinde yazdik
				// sonda ki ln kaldirdik o yeni satira indiriyor
			System.out.println();
		}

		String[][] sehirler = new String[7][2]; // 7 bolge ve her bolgeden 2 sehirlik bir matrix

		sehirler[0][0] = "Edirne";
		sehirler[0][1] = "Balikesir";
		sehirler[1][0] = "Izmir";
		sehirler[1][1] = "Denizli";
		sehirler[2][0] = "Mersin";
		sehirler[2][1] = "Adana";
		sehirler[3][0] = "Sivas";
		sehirler[3][1] = "Tokat";
		sehirler[4][0] = "Samsun";
		sehirler[4][1] = "Sinop";
		sehirler[5][0] = "Erzurum";
		sehirler[5][1] = "Erzincan";
		sehirler[6][0] = "Mardin";
		sehirler[6][1] = "Sirnak";

		for (int i = 0; i < sehirler.length; i++) {
			System.out.println("------------------");
			for (int j = 0; j < 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}
}
