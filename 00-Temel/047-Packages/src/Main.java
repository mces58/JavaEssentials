import packages.Student;

public class Main {
	public static void main(String[] args) {

		// student class'i package'in icinde oldugu icin onu kullanabilmek icin once
		// package buraya import etmeliyiz

		Student student = new Student("Can");

		student.study();

		/*
		 * build'in tabiri kullanilan paketin o dilin icinde var oldugu anlamina
		 * geliyor. ornegin Scanner paketi javada build'indir. yani java'da var
		 * demektir. paketleri dahil etmek icin import keyword'unu kullaniriz
		 * 
		 * paketleri gruplamak icin kullaniriz. Kodlarimizi duzene sokmak icin yani.
		 */
	}
}
