
public class Main {
	public static void main(String[] args) {

		System.out.println("Our worker:");
		WorkManager workManager = new WorkManager();
		workManager.calis(new OurWorker());
		workManager.ye(new OurWorker());
		workManager.ode(new OurWorker());

		System.out.println("\nOut source worker:");

		workManager.calis(new OutSourceWorker());
		workManager.hissePayi(new OutSourceWorker());
	}
}
