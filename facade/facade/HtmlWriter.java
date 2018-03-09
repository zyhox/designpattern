package facade;

import java.io.IOException;
import java.io.Writer;

/**
 * 外观模式中的复杂关联类的组成成员之一
 * @author jack
 *
 */
public class HtmlWriter {
	private Writer writer;
	public HtmlWriter(Writer writer){
		this.writer = writer;
	}
	public void title(String title) throws IOException{//输出标题
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<title>" + title + "</title>");
		writer.write("</head>");
		writer.write("<body>\n");
		writer.write("<h1>" + title +"</h1>\n");
	}
	public void paragraph(String msg) throws IOException{//输出段落
		writer.write("<p>" + msg + "</p>\n");
	}
	public void link(String href,String caption) throws IOException{//输出超链接
		paragraph("<a href=\"" + href + "\">" + caption + "</a>");
	}
	public void mailto(String mailladdr,String username) throws IOException{//输出邮件地址
		link(mailladdr, username);
	}
	public void close() throws IOException{//结束输出html
		writer.write("</body>");
		writer.write("</html>");
		writer.close();
	}
}
