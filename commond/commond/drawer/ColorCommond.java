package commond.drawer;

import java.awt.Color;
import java.awt.Point;

import commond.commond.Commond;

/**
 * 设置颜色的命令类
 * @author jack
 *
 */
public class ColorCommond implements Commond{
	protected Drawable drawable;
//	private Point position;
	public ColorCommond(Drawable drawable){
		this.drawable = drawable;
//		this.position = position;
	}
	@Override
	public void execute() {
		if(drawable !=null){
			((Drawcanvas)drawable).setColor(Color.black);
		}
//		drawable.draw(position.x, position.y);
	}

}
