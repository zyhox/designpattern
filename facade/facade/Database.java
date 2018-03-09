package facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 外观模式中复杂关联类中组成成员之一的类
 * @author jack
 *
 */
public class Database {
	private Database(){//防止外部new出database的实例，所以声明为private
		
	}
	public static Properties getProperties(String dbname){//根据数据库名获取properties
		String filename = dbname + ".txt";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("./facade/facade/"+filename));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Warning :"+filename +" is not found.");
		}
		return prop;
	}
}
