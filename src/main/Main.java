
package main;

import java.awt.AWTException;

import javax.swing.SwingUtilities;

/**
 * @author Andrew Matthews
 */
class Main
{
	public static void main(String[] args) {
		Window window = new Window();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					window.build();
				} catch (AWTException e) {
					e.printStackTrace();
				}
			}
		});
	}
}