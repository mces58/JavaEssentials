
public class AccountManager {
	private double bakiye;
	
	public void paraYatir(double yatirilacakMiktar) {
		bakiye += yatirilacakMiktar;
	}
	
	public void paraCek(double cekilicekMiktar) throws Exception { // throws kullanirken bu bilgilendirmeyi kullanmaliyiz
		if(bakiye >= cekilicekMiktar) {
			bakiye -= cekilicekMiktar;
		}		
		else {
			//System.out.println("Bakiyeniz yetersiz"); 
			// boyle bir mesaj verilebilir lakin throw kullanalim
			 throw new Exception("Bakiye yetersiz");
 		}
	}

	public double getBakiye() { // hesaptaki parayi okumak icin
		return bakiye;
	}
}
 