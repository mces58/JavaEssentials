
public class Manager {
	/*
	public void add() {
		System.out.println("Eklendi.");
		
		DataBaseLogger dataBaseLogger = new DataBaseLogger();
		dataBaseLogger.log("Log mesaji");
	}
	iste bu kullanim bagimli bir kullanim oluyor cunku yarin deselerki DataBaseLoggera degilde 
	FileLoggera ekleme yapilacaksa bu kodun tekrar silinmesi gerekiyor.Dolayisiyla boyle 
	yapilmamali. Asagida dogrusunu yapalim
	*/
	private BaseLogger logger; // BaseLogger turunde bir degisken olusturduk

	public Manager(BaseLogger logger) { // Constructor'i yazdik
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("Eklendi.");
		logger.log("Log mesaji");
	}
}
