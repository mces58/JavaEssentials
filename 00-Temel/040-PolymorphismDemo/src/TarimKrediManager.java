
public class TarimKrediManager extends BaseKrediManager {
	@Override
	public double hesapla(double tutar) {
		return super.hesapla(tutar);
		// super kelimesi ana classta ki metotlari kullanmamiza yarar
		// ciftci icin faiz kredi oraninda degisiklik yapmadik BaseKrediManager
		// class'indaki faiz orani gecerli olsun istedik
	}
}
