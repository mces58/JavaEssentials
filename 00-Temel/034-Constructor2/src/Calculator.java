
public class Calculator {
	public double add(Entity entity) {
		return entity.getNumber1() + entity.getNumber2();
	}

	public double minus(Entity entity) {
		return entity.getNumber1() - entity.getNumber2();
	}

	public double times(Entity entity) {
		return entity.getNumber1() * entity.getNumber2();
	}

	public double divideBy(Entity entity) {
		return entity.getNumber1() / entity.getNumber2();
	}
}
