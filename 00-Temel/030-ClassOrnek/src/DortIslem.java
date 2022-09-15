
public class DortIslem {
	public double plus(double... numbers) {// burada variable arguments kullanimi yapmis olduk
		int total = 0;

		for (double number : numbers) {
			total += number;
		}
		return total;
	}

	public double minus(double number1, double number2) {
		return number1 - number2;
	}

	public double times(double... numbers) {
		double total = 1;

		for (double number : numbers) {
			total *= number;
		}
		return total;
	}

	public double divideBy(double number1, double number2) {
		return number1 / number2;
	}
}
