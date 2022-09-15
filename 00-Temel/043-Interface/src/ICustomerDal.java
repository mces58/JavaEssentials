
public interface ICustomerDal {
	/*
	 * ICustomerDal'da ki I harfi interface oldugunu belirtmek icin koydum
	 * interface'ler class da degildir abstract class'da degildir interface'ler
	 * referans tutuculardir abstract'larda oldugu gibi direkt new'lenemezler
	 * class'da operasyonlarimiz tamamlanmis oluyordu yani iclerinde bir seyler
	 * yaziliydi abstract'larda onu inherent eden yani miras alanlar ici dolu
	 * operasyonlarda olabilir olmayabilirde lakin interface'lerde operasyonlarimiz
	 * tamamlanmiyor yani kod falan yazmiyoruz sadece imza atiyoruz ( buna
	 * operasyonun adi vs olabilir ) bir class birden fazla interface'si implements
	 * edebilir ama bir class birden fazla class'i extends edemez yani birden fazla
	 * class'i miras alamaz her class'in bir interface'i olmalidir surdurebilirligi
	 * saglamak icin
	 */
	public void add();
}
