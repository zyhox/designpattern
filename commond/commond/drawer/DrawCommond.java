package commond.drawer;

import commond.commond.Commond;
import java.awt.*;
/**
 * ʵ��������ӿڵĻ�ͼ������
 * @author jack
 *
 */
public class DrawCommond implements Commond{
	protected Drawable drawable;
	private Point position;
	public DrawCommond(Drawable drawable,Point position){
		this.drawable = drawable;
		this.position = position;
	}
	@Override
	public void execute() {
		drawable.draw(position.x, position.y);
	}

}
