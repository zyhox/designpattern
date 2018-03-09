package commond.drawer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import commond.commond.MacroCommond;

/**]
 * 具体的画图类
 * @author jack
 *
 */
public class Drawcanvas extends Canvas implements Drawable{
	private Color color = Color.red;
	void setColor(Color color){
		this.color = color;
	}
	private int radius = 6;
	private MacroCommond history;
	public Drawcanvas(int width,int height,MacroCommond history){
		setSize(width, height);
		setBackground(Color.white);
		this.history = history;
	}
	public void paint(Graphics g){
		history.execute();
	}
	@Override
	public void draw(int x, int y) {
		Graphics g = getGraphics();
		g.setColor(color);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
	}

}
