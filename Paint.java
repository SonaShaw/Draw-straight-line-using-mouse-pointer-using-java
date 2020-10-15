package assignment_2;

import java.util.Scanner;

import javax.swing.JFrame;

public class Paint {
	
	PaintPanel paintPanel;
	PaintMouse paintMouse;

	Paint() {
	
		JFrame jfrm = new JFrame("Simple frame :");
		jfrm.setSize(500,500);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		paintPanel = new PaintPanel(10,10,100,400);
		
		
		//jfrm.add(paintPanel);
		
		
		paintMouse = new PaintMouse();
		jfrm.add(paintMouse);
		jfrm.setVisible(true);
		
	}
}
