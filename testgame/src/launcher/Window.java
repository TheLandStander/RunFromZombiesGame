package launcher;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame {
private JFrame frame;
private String title;	
private int width, height;	
private Canvas canvas; 


public Window(String title, int width, int height) {
	
this.title = title;
this.height = height;
this.width = width;
createWindow();
}
	


private void createWindow()	{
frame = new JFrame(title);	
frame.setSize(width,height);
frame.setBackground(Color.black);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setLocationRelativeTo(null);
canvas = new Canvas(); 
canvas.setPreferredSize(new Dimension (width,height) );
canvas.setMaximumSize(new Dimension (width,height) );
canvas.setMinimumSize(new Dimension (width,height) );
canvas.setFocusable(false);
frame.setResizable(false);
frame.add(canvas);
frame.pack();
}

public Canvas getCanvas() {
	return canvas;
	
}

public static BufferedImage loadimage(String path) {
	
	try {
		return ImageIO.read(Window.class.getResourceAsStream(path));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.exit(1);
	}
	return null;
}

public JFrame getFrame() {
	return frame;
}


}

