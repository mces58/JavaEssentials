
public class Main {
	public static void main(String[] args) {
		
		AccountManager manager = new AccountManager();
		
		System.out.println("Bakiyeniz: " + manager.getBakiye()); 
		// ilk basta hesapta para yok
		
		manager.paraYatir(100); // hesaba 100 tl yatirdik
		System.out.println("Bakiyeniz: " + manager.getBakiye());
		
		try {
			manager.paraCek(90);// hesaptan 90 tl cektik
			System.out.println("Bakiyeniz: " + manager.getBakiye());
		} 
		catch (Exception e) { 
		} 
		
		// manager.paraCek(20); 
		// hesapta 10 tl vardi bir 20 tl daha cektik bakiye - ye dustu lakin bakiye - ye dusemez 
		// System.out.println("Bakiyeniz: " +manager.getBakiye());
		// dolayisiyla bir hata vermesi lazim bunu if-else ile yapabiliriz
		// ya da throw ile de yapabiliriz
		
		try {
			manager.paraCek(20);
			System.out.println("Bakiyeniz: " + manager.getBakiye());
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
