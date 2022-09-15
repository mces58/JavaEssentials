
public class Main {
	public static void main(String[] args) {
		int a = 10;

		a = a + 10;

		System.out.println("a ' nin degeri : " + a);

		a = a - 23;

		System.out.println("a ' nin degeri : " + a);

		a = a * (-3);

		System.out.println("a ' nin degeri : " + a);

		a += 5;

		System.out.println("a ' nin degeri : " + a);

		a *= 2;

		System.out.println("a ' nin degeri : " + a);

		a = 10;

		System.out.println("a ' nin degeri : " + a++);
		System.out.println("a ' nin degeri : " + a);
		// artirmayi bir sonra ki komutta yapti C 'de ki gibi hepsi

		a = 5;

		System.out.println("a ' nin degeri : " + ++a); // burada ise direkt artirdi

		a = 1;

		System.out.println("a ' nin degeri : " + a--);// bir sonra ki adim da azaltti
		System.out.println("a ' nin degeri : " + a);

		a = -1;

		System.out.println("a ' nin degeri : " + --a);// direkt azaltti

		// ++x islemi direkt artirma islemi yaparken
		// x++ bir sonraki islemde artirma yapar
	}
}
