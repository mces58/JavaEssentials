
@SuppressWarnings("serial")
public class BakiyeYetersizException extends Exception {
	// classimiz ana Exception'dan extends edilmesi gerek ki hata sinifi oldugu
	// anlasilsin

	String message;

	public BakiyeYetersizException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
