
public class WorkManager {
	// isci classimiz burasi tum operasyonlari burada toplayacam

	public void calis(IWorkable workable) {
		workable.work();
	}

	public void ye(IEatable eatable) {
		eatable.eat();
	}

	public void ode(IPayable payable) {
		payable.pay();
	}

	public void hissePayi(IShares shares) {
		shares.shares();
	}
}
