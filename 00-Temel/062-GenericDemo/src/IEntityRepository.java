
public interface IEntityRepository<T extends IEntity> {
	// generic yapilar sadece class'lar icin kullanilmaz
	// T yerine gelecek class IEntity'i miras almasi icin yaptik .IEntity'de miras
	// alabilecek iki class var . Customer ve Product
	// bu yapiya kisitlama deniliyor yani product ve customer disinda class gelemez
	// demek

	void add(T t);

	void delete(T t);

	void update(T t);

	// bu operasyonlari hem customerDal hem de productDal classlari icin de
	// kullanacagiz yani bizim sadece tipimiz degisiyor
	// iste boyle yapilarda generic'ler kullanilir

	// simdi ben boyle bir operasyon yazsaydim void add(CustomerDal customerDal)
	// bu operasyon sadece CustomerDal icin calisirdi ama ben ProductDal icinde
	// calismasini istiyorum .Dolayisiyla bu boyle yapilamaz . Bu operasyonlarin
	// icine generic yapiyi parametre olarak gondermeliyiz
}
