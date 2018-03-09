package bridge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ϰ��2����ȡ�ļ�����ʾ��,���������ʵ�ֲ����
 * @author jack
 *
 */
public class FileDisplayImpl extends DisplayImpl{
	private String filename;
	private BufferedReader reader;
	private final int MAX_READAHEAD_LIMIT = 4096;//ѭ����ʾ�ļ��ޣ������С���ƣ�
	public FileDisplayImpl(String filename){
		this.filename = filename;
	}
	
	@Override
	public void rawOpen() {
		try {
			reader = new BufferedReader(new FileReader(filename));
			reader.mark(MAX_READAHEAD_LIMIT);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=========================="+filename+"==========");
	}

	@Override
	public void rawPrint() {
		try {
			String line;
			reader.reset();//�ص�mark��λ��
			while((line = reader.readLine())!=null){
				System.out.println(">"+line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void rawClose() {
		System.out.println("=============");
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
