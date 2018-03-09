package factorymethod.idcard;

import factorymethod.framework.Product;
/**
 * ���֤������̳г����Ʒ�࣬ʵ�־����ʹ�÷���
 * @author jack
 *
 */
public class IDCard extends Product{
	private String owner;
	private String cardno;
	IDCard(String owner){
		System.out.println("����"+owner+"��ID����");
		this.owner = owner;
	}
	IDCard(String owner,String cardno){
		System.out.println("����"+owner+"��ID��������Ϊ��"+cardno);
		this.owner = owner;
		this.cardno = cardno;
	}
	@Override
	public void use() {//��д������󷽷�use
		System.out.println("ʹ��"+owner+"��ID����");
	}
	public String getOwner(){
		return owner;
	}
	public String getCardNo(){
		return cardno;
	}
}
