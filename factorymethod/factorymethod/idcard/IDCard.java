package factorymethod.idcard;

import factorymethod.framework.Product;
/**
 * 身份证具体类继承抽象产品类，实现具体的使用方法
 * @author jack
 *
 */
public class IDCard extends Product{
	private String owner;
	private String cardno;
	IDCard(String owner){
		System.out.println("制作"+owner+"的ID卡。");
		this.owner = owner;
	}
	IDCard(String owner,String cardno){
		System.out.println("制作"+owner+"的ID卡，卡号为："+cardno);
		this.owner = owner;
		this.cardno = cardno;
	}
	@Override
	public void use() {//重写父类抽象方法use
		System.out.println("使用"+owner+"的ID卡。");
	}
	public String getOwner(){
		return owner;
	}
	public String getCardNo(){
		return cardno;
	}
}
