
public class OurWorker implements IEatable, IPayable, IWorkable {
	@Override
	public void work() {
		System.out.println("Sabah saat 9 ile aksam saat 6 arasi calisilir.");
	}

	@Override
	public void pay() {
		System.out.println("Maas gunu her ayin 15'dir.");
	}

	@Override
	public void eat() {
		System.out.println("Oglen yemegi saat 12'dedir.");
	}
}
