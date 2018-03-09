package facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * ���ģʽ�и��ӹ���������ɳ�Ա֮һ����
 * @author jack
 *
 */
public class Database {
	private Database(){//��ֹ�ⲿnew��database��ʵ������������Ϊprivate
		
	}
	public static Properties getProperties(String dbname){//�������ݿ�����ȡproperties
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
