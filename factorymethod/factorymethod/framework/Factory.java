package factorymethod.framework;
/**
 * ����Ĺ����࣬�������������ɲ�Ʒ��ע���Ʒ�ķ���
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
