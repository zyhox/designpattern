package flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 享元模式中的享元
 * @author jack
 *
 */
public class BigChar {
	private char charname;
	private String fontdata;
	public BigChar(char charname){
		this.charname = charname;
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("./flyweight/flyweight/big"+charname+".txt"));
			String line;
			StringBuffer buf = new StringBuffer();
			while((line=reader.readLine())!=null){
				buf.append(line);
				buf.append("\n");
			}
			reader.close();
			this.fontdata = buf.toString();
		} catch (Exception e) {
			this.fontdata = charname +"?";
		}
		
	}
	public void print(){
		System.out.print(fontdata);
	}
}
