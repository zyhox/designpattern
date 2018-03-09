package factorymethod.framework;
/**
 * 抽象的工厂类，申明了用于生成产品和注册产品的方法
 * @author jack
 *
 */
public abstract class Factory {
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	public final Product create(String owner,String cardno){
		Product p = createProduct(owner, cardno);
		registerProductWithMap(p);
		return p;
	}
	public abstract Product createProduct(String owner);
	public abstract Product createProduct(String owner,String cardno);
	public abstract void registerProduct(Product product);
	public abstract void registerProductWithMap(Product product);
}
