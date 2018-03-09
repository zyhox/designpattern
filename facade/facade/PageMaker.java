package facade;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * ��������ģʽ��������ߣ������ṩͳһ�Ľӿ�
 * @author jack
 *
 */
public class PageMaker {
	private PageMaker(){
		
	}
	public static void makeWelcomePages(String mailaddr,String filename){
		try{
			Properties mailprop = Database.getProperties("maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcom to "+username + "'s page");
			writer.paragraph(username + "��ӭ����" + username + "����ҳ");
			writer.paragraph("��������ʼ�Ŷ");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println(filename + "is created for "+ mailaddr + " (" + username +")");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void makeLinkPage(String filename){
		try{
			Properties mailprop = Database.getProperties("maildata");
			Set set = mailprop.keySet();
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Link");
			Iterator it = set.iterator();
			while(it.hasNext()){
				String mailaddr = (String) it.next();
				String username = (String) mailprop.get(mailaddr);
				writer.mailto(mailaddr, username);
			}
			writer.close();
			System.out.println("link page is created ");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
