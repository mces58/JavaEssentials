
/*
  bu sekilde yaptigimiz da operasyonlara parametre olarak Object gidiyor ve bu kotu koddur.
  Ayrica IEntityRepository'de biz generic yapiyi kullanmadik
  
public class ProductDal implements IEntityRepository {

	@Override
	public void add(Object t) {
		// TODO Auto-generated method stub
		
	} 

	@Override
	public void delete(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Object t) {
		// TODO Auto-generated method stub
		
	}
}
*/

public class ProductDal implements IEntityRepository<Product> { // product class'i turunde demek

	// goruldugu gibi artik metotlarda Object yerine Product yaziyor

	@Override
	public void add(Product t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Product t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Product t) {
		// TODO Auto-generated method stub

	}
}
