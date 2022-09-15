
public class CarManager {
	// asagida ki fonkisiyonun amaci degerleri ekrana bastirmak icindir
	public void showInfos(Car car) {
		System.out.println("Arabanin rengi : " + car.getColor());
		System.out.println("Arabanin markasi : " + car.getModel());
		System.out.println("Arabanin motor gucu : " + car.getPower());
		System.out.println("Arabanin kapi sayisi : " + car.getDoor());
		System.out.println("Arabanin fiyati : " + car.getPrice());
	}
}
