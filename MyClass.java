package assignment_2;

import javax.swing.SwingUtilities;

import gui.SwingDemo;

public class MyClass {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Paint paint = new Paint();
			}
		});

	}

}
