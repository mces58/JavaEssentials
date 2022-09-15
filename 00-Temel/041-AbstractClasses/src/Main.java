
public class Main {
	public static void main(String [] args) {
		// simdi abstract bir classin main de kullanimina bakalim
		// iki turlu kullanimi vardir
		
		/* 
		 bu birincisi new'e kadar yazdiginda gerisini IDE getiriyor lakin bu kullanim tercih
		 edilmez Cunku her new yaptigimizda icini doldurmak zorundayiz
		 
		 GameCalculator calculator = new GameCalculator() {
			
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
			}
		 };
		*/
		
		// ikinci kullanim
		
		GameCalculator calculator = new ManCalculator();
		calculator.hesapla();
		calculator.gameOver();
		System.out.println();
		
		GameCalculator calculator2 = new WomanCalculator();
		calculator2.hesapla();
		calculator2.gameOver();
		System.out.println();
		
		GameCalculator calculator3 = new ChildCalculator();
		calculator3.hesapla();
		calculator3.gameOver();
		System.out.println();
		
		// puanlarin hepsini bastim bir dizi seklinde
		GameCalculator [] calculators = new GameCalculator[] {
				new ManCalculator(),
				new WomanCalculator(),
				new ChildCalculator()
		};
		/*
		GameCalculator [] gameCalculators =
			{new ManCalculator(), new WomanCalculator(), new ChildCalculator()};
		bu tanimla yukarida ki tanimlama ile ayni
		*/
		
		for(GameCalculator gameCalculator: calculators) {
			gameCalculator.hesapla();
			gameCalculator.gameOver();
			System.out.println();
		}
		
		/*
		 goruldugu gibi soyle bir kullanim yapmadik
		 
		 GameCalculator gameCalculator = new GameCalculator();
		 
		 abstract siniflar direkt olarak new'lenmez ya birinci ile yada ikinci kullanim ile 
		 main'de onlara ulasabiliriz birinci kullanim zahmetli oldugu icin ikinci kullanim en sagliklisi
		 ikinci kullanimda farkedildigi uzere polymorphism seklinde kullandik
		 */
	}
}
