package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * �����builder��ʹ��html�ķ�ʽ
 * @author jack
 *
 */
public class HTMLBuilder extends Builder{
	private String filename;//�ļ���
	private PrintWriter writer;//���ڱ�д�ļ���printwriter
	@Override
	public void makeTitles(String title) {
		filename = title +".html";//��������Ϊ�ļ���
		try{
			writer = new PrintWriter(new FileWriter(filename));//����printwrite
		}catch(IOException e){
			e.printStackTrace();
		}
		writer.println("<html><head><title>"+title+"</title></head><body>");//�������
		writer.println("<h1>"+title+"</h1>");
	}

	@Override
	public void makeString(String str) {
		writer.println("<p>"+str+"</p>");//��p��ǩ���
	}

	@Override
	public void makeItems(String[] items) {
		writer.println("<ul>");//��ul��li���
		for(int i=0;i<items.length;i++){
			writer.println("<li>"+items[i]+"</li>");
		}
		writer.println("</ul>");
	}

	@Override
	public void close() {
		writer.println("</body></html>");//�رձ�ǩ
		writer.close();//�ر��ļ�
	}

	public String getResult(){
		return filename;//�����ļ���
	}
}
