package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 具体的builder，使用html的方式
 * @author jack
 *
 */
public class HTMLBuilder extends Builder{
	private String filename;//文件名
	private PrintWriter writer;//用于编写文件的printwriter
	@Override
	public void makeTitles(String title) {
		filename = title +".html";//将标题作为文件名
		try{
			writer = new PrintWriter(new FileWriter(filename));//生成printwrite
		}catch(IOException e){
			e.printStackTrace();
		}
		writer.println("<html><head><title>"+title+"</title></head><body>");//输出标题
		writer.println("<h1>"+title+"</h1>");
	}

	@Override
	public void makeString(String str) {
		writer.println("<p>"+str+"</p>");//用p标签输出
	}

	@Override
	public void makeItems(String[] items) {
		writer.println("<ul>");//用ul和li输出
		for(int i=0;i<items.length;i++){
			writer.println("<li>"+items[i]+"</li>");
		}
		writer.println("</ul>");
	}

	@Override
	public void close() {
		writer.println("</body></html>");//关闭标签
		writer.close();//关闭文件
	}

	public String getResult(){
		return filename;//返回文件名
	}
}
