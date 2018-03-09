package factorymethod.idcard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;
/**
 * 具体工厂类用来生成产品
 * @author jack
 *
 */
public class IDCardFactory extends Factory{
	private List owners = new ArrayList();
	private Map<String, String> map = new HashMap<String,String>();
	@Override
	public Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	public void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	public List getOwners(){
		return owners;
	}
	public Map<String, String> getMap(){
		return map;
	}

	@Override
	public Product createProduct(String owner, String cardno) {
		return new IDCard(owner, cardno);
	}

	@Override
	public void registerProductWithMap(Product product) {
		owners.add(((IDCard)product).getOwner());
		map.put(((IDCard)product).getCardNo(), ((IDCard)product).getOwner());		
	}
}
