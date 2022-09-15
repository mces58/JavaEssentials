import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// mantik olarak C ile ayni

		int[] arr1 = { 10, 20, 30, 40, 50 };
		// koseli parantez addan oncede gelebilir sonra da gelebilir

		System.out.println("Array 1' in ilk degeri : " + arr1[0]);

		// tabi boyle tek tekte tanimlayabilirdik
		arr1[0] = 60;
		arr1[1] = 70;

		System.out.println("Array 1' in tum elemanlari...");

		for (int i = 0; i < arr1.length; i++) { // arr1.length arr1 in uzunlugunu direkt kendi hesaplar
			System.out.println((i + 1) + ". elemani : " + arr1[i]);
		}

		// eger ki biz array'in icini sonra doldurmak istiyorsak asagida ki gibi
		// yapmaliyiz
		int[] arr2 = new int[5]; // bu ifade 5 boyutlu array demek

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// simdi kullanicidan alalim
		System.out.println("\n5 tane tam sayi giriniz...");

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scan.nextInt();// int deger aliyoruz
		}

		// simdi aldigimiz degerleri ekrana basalim
		System.out.println("Su degerleri girdiniz...");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println((i + 1) + ". eleman : " + arr2[i]);
		}
	}
}
