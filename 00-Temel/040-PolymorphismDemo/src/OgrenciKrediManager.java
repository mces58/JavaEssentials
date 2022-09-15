
public class OgrenciKrediManager extends BaseKrediManager {
	@Override
	public double hesapla(double tutar) {
		return tutar * 0.851;
		// burada ise ogrenciler icin bir faiz orani uyguladik ve ogrencilere ozel bir
		// faiz kredi orani belirledik
	}
}
