package fileproperties;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
/**
 * 模拟请求方调用properties
 * @author jack
 *
 */
public class Main {

	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("./adapter/fileproperties/file.txt");
			
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("./adapter/fileproperties/newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
