package interpreter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * ģ���������
 * @author jack
 *
 */
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("./interpreter/interpreter/program.txt"));
			String text;
			while((text=reader.readLine())!=null){
				System.out.println("text= \""+text +"\"");
				Node node = new ProgramNode();
				node.parse(new Context(text));
				System.out.println("node= "+node);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
