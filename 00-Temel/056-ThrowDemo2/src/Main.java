
public class Main {
	public static void main(String[] args) {

		AccountManager manager = new AccountManager();

		System.out.println("Bakiyeniz: " + manager.getBakiye());

		manager.paraYatir(100); // hesaba 100 tl yatirdik
		System.out.println("Bakiyeniz: " + manager.getBakiye());

		try {
			manager.paraCek(90);// hesaptan 90 tl cektik

			System.out.println("Bakiyeniz: " + manager.getBakiye());
		} catch (BakiyeYetersizException e) {
			System.out.println(e.getMessage());

		}

		try {
			manager.paraCek(20);
			System.out.println("Bakiyeniz: " + manager.getBakiye());
		} catch (BakiyeYetersizException e) {

			System.out.println(e.getMessage());
		}
	}
}
