
public class Main {
	public static void main(String[] args) {

		Object sayi1 = Integer.valueOf(15);
		// java da her seyin kokeni obje oldugu icin obje uzerinden degisken
		// tanimliyoruz.

		Object sayi2 = Double.valueOf(5.5);
		Object isim = String.valueOf("can");

		// instanceof
		/*
		 * Java instanceof operatörü herhangi bir nesnenin belirtilen türe ait olup,
		 * olmadığını öğrenmek için kullanılır. Bu operatör aynı zamanda tip
		 * karşılaştırmak için de kullanılır ve Boolean tipinde true yada false değerini
		 * döner. Bu operatör null bir değişkene uygulandığında false değerini dönmekle
		 * yükümlüdür.
		 */
		System.out.println(sayi1 instanceof Integer);
		// sayi1 integer bir sayi oldugu icin true deger donderir.

		if (sayi1 instanceof Integer)
			System.out.println("sayi1 integer bir sayidir");

		if (sayi2 instanceof Double)
			System.out.println("sayi2 double bir sayidir");

		if (isim instanceof String)
			System.out.println("isim string bir ifadedir");

		// -----------------------------------------------------------------

		// getClass ile de degiskenlerin hangi classlara ait oldugunu ogrenebiliriz
		// bunlar sadece Integer, Double gibi classlar ile sinirli degil kendi
		// yazdigimiz classlardan urettigimiz degiskenlerde de kullanabiliriz.

		Object var1 = Integer.valueOf(20);
		Object var2 = Double.valueOf(1.5);
		Object str = String.valueOf("eser");

		System.out.println(var1.getClass());// hangi classa ait oldugunu yazar.

		if (var1.getClass() == Integer.class)
			System.out.println("var1 integer bir sayidir");

		if (var2.getClass() == Double.class)
			System.out.println("var2 double bir sayidir");

		if (str.getClass() == String.class)
			System.out.println("str string bir ifadedir");
	}
}
