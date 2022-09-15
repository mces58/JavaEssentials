
public class AccountManager {
	private double bakiye;

	public void paraYatir(double yatirilacakMiktar) {
		bakiye += yatirilacakMiktar;
	}

	public void paraCek(double cekilicekMiktar) throws BakiyeYetersizException {

		if (bakiye >= cekilicekMiktar) {
			bakiye -= cekilicekMiktar;
		}

		else {
			// burada genel bir exception yazdik ya biz kendimiz bir hata sinifi yazmak
			// istesek ne yapacagiz ?
			// yazmak istedigimiz hatanin classini yazacagiz. Benim yazmak istedigim hatanin
			// adi BakiyeYetersizException olacak

			// throw new Exception("Bakiye yetersiz");
			throw new BakiyeYetersizException("Bakiye yetersiz!");
		}
	}

	public double getBakiye() {
		return bakiye;
	}
}
