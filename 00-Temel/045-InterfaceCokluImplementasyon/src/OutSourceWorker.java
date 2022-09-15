
public class OutSourceWorker implements IWorkable, IShares {
	@Override
	public void shares() {
		System.out.println("Isi zamanindan once bitirirseniz %10 pay hakki alirsiniz.");
	}

	@Override
	public void work() {
		System.out.println("Sabah saat 10 ile aksam saat 5 arasi calisilir.");
	}
}
