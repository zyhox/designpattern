package commond;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.jar.JarFile;

import javax.swing.*;

import commond.commond.Commond;
import commond.commond.MacroCommond;
import commond.drawer.ColorCommond;
import commond.drawer.DrawCommond;
import commond.drawer.Drawcanvas;
/**
 * 模拟请求调用
 * @author jack
 *
 */
public class Main extends JFrame implements ActionListener,MouseMotionListener{
	private MacroCommond history = new MacroCommond();
	private Drawcanvas canvas = new Drawcanvas(400, 400, history);
	private JButton clearButton = new JButton("clear");
	private JButton changeButton = new JButton("changeColor");
	private JButton undoButton = new JButton("undo");
	public Main(String title){
		super(title);
		
//		this.addWindowListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(this);
		changeButton.addActionListener(this);
		undoButton.addActionListener(this);
		
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		buttonBox.add(changeButton);
		buttonBox.add(undoButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);
		
		pack();
		show();
	}
//	@Override
//	public void windowOpened(WindowEvent e) {}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.exit(0);
//	}
//
//	@Override
//	public void windowClosed(WindowEvent e) {}
//
//	@Override
//	public void windowIconified(WindowEvent e) {}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {}
//
//	@Override
//	public void windowActivated(WindowEvent e) {}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {
		Commond cmd = new DrawCommond(canvas, e.getPoint());
		history.append(cmd);
		cmd.execute();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clearButton){
			history.clear();
			canvas.repaint();
		}else if(e.getSource() == changeButton){
			Commond cmd = new ColorCommond(canvas);
			history.append(cmd);
			cmd.execute();
		}else if(e.getSource() == undoButton){
//			Commond cmd = new ColorCommond(canvas);
			history.undo();
			canvas.repaint();
		}
	}
		public static void main(String[] args) {
			new Main("Commond Pattern Sample");
		}
}
