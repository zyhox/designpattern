package facade;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * 具体的外观模式外观体现者，对外提供统一的接口
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
			writer.paragraph(username + "欢迎来到" + username + "的主页");
			writer.paragraph("等着你的邮件哦");
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
