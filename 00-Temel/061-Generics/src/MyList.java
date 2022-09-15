
public class MyList<T> {// ArrayList oldugunu belirtmek icin generic kullaniyoruz
	// generic'in icindeki T harfi type'dan gelmektedir. Yani oraya bir tip gelecek
	// isimlendirme teknigidir

	// ArrayListler ne yapar ? Ornegin diziye eleman ekler , diziden eleman siler
	// vs.. isler yapar . Butun bu operasyonlari buraya yazabiliriz

	public void add(T value) { // T tipinde demek value ise parametredir burada
		// diziye eleman ekler
	}

	public void remove(T t) {
		// diziden eleman siler
	}
}
