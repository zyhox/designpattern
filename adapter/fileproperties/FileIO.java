package fileproperties;

import java.io.IOException;

/**'
 * 目标接口
 * @author jack
 *
 */
public interface FileIO {
	public void readFromFile(String filename)throws IOException;
	public void writeToFile(String filename) throws IOException;
	public void setValue(String key,String value);
	public String getValue(String key);
}
