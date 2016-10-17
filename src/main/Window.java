package main;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame
{
	public Window() {
		super("FRKeys bootleg edition");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 6, 20, 5));
		setResizable(false);
		setFocusableWindowState(false);
		setAlwaysOnTop(true);
		
		Image icon = Toolkit.getDefaultToolkit().getImage("imgs/cute_doggo.jpg");
	    setIconImage(icon);
	}

	public void build() throws AWTException {
		JButton aAcute = new JButton("�");
		JButton aAcuteUpper = new JButton("�");
		JButton aGrave = new JButton("�");
		JButton aGraveUpper = new JButton("�");
		JButton eAcute = new JButton("�");
		JButton eAcuteUpper = new JButton("�");
		JButton eGrave = new JButton("�");
		JButton eGraveUpper = new JButton("�");
		JButton cCedilla = new JButton("�");
		JButton cCedillaUpper = new JButton("�");
		JButton oCircumflex = new JButton("�");
		JButton oCircumflexUpper = new JButton("�");
		
		Robot robot = new Robot();
		
		aAcute.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD5);
				robot.keyRelease(KeyEvent.VK_NUMPAD5);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		aAcuteUpper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD1);
				robot.keyRelease(KeyEvent.VK_NUMPAD1);
				robot.keyPress(KeyEvent.VK_NUMPAD9);
				robot.keyRelease(KeyEvent.VK_NUMPAD9);
				robot.keyPress(KeyEvent.VK_NUMPAD3);
				robot.keyRelease(KeyEvent.VK_NUMPAD3);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		aGrave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD4);
				robot.keyRelease(KeyEvent.VK_NUMPAD4);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		aGraveUpper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD1);
				robot.keyRelease(KeyEvent.VK_NUMPAD1);
				robot.keyPress(KeyEvent.VK_NUMPAD9);
				robot.keyRelease(KeyEvent.VK_NUMPAD9);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		eAcute.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD3);
				robot.keyRelease(KeyEvent.VK_NUMPAD3);
				robot.keyPress(KeyEvent.VK_NUMPAD3);
				robot.keyRelease(KeyEvent.VK_NUMPAD3);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		eAcuteUpper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD1);
				robot.keyRelease(KeyEvent.VK_NUMPAD1);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		eGrave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD3);
				robot.keyRelease(KeyEvent.VK_NUMPAD3);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		eGraveUpper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		cCedilla.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD3);
				robot.keyRelease(KeyEvent.VK_NUMPAD3);
				robot.keyPress(KeyEvent.VK_NUMPAD1);
				robot.keyRelease(KeyEvent.VK_NUMPAD1);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		cCedillaUpper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD1);
				robot.keyRelease(KeyEvent.VK_NUMPAD1);
				robot.keyPress(KeyEvent.VK_NUMPAD9);
				robot.keyRelease(KeyEvent.VK_NUMPAD9);
				robot.keyPress(KeyEvent.VK_NUMPAD9);
				robot.keyRelease(KeyEvent.VK_NUMPAD9);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		oCircumflex.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD4);
				robot.keyRelease(KeyEvent.VK_NUMPAD4);
				robot.keyPress(KeyEvent.VK_NUMPAD4);
				robot.keyRelease(KeyEvent.VK_NUMPAD4);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		oCircumflexUpper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_NUMPAD0);
				robot.keyRelease(KeyEvent.VK_NUMPAD0);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyPress(KeyEvent.VK_NUMPAD1);
				robot.keyRelease(KeyEvent.VK_NUMPAD1);
				robot.keyPress(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_NUMPAD2);
				robot.keyRelease(KeyEvent.VK_ALT);
			}
		});
		
		add(aAcute);
		add(aGrave);
		add(eAcute);
		add(eGrave);
		add(cCedilla);
		add(oCircumflex);
		add(aAcuteUpper);
		add(aGraveUpper);
		add(eAcuteUpper);
		add(eGraveUpper);
		add(cCedillaUpper);
		add(oCircumflexUpper);
		
		setSize(new Dimension(500, 100));
		
		setVisible(true);
	}
}
