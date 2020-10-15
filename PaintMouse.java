package assignment_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class PaintMouse extends JPanel implements MouseListener{


	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	PaintMouse(){
		
		addMouseListener(this);
        
        repaint();
               
	}
	
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(x1, y1, x2, y2);
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		 e.consume();  
	     x1 = e.getX();  
	     y1 = e.getY(); 
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		 e.consume();  
	     x2 = e.getX();  
	     y2 = e.getY();   
	     repaint(); 
		
	}
	
	
	
}
