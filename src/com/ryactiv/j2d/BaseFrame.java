package com.ryactiv.j2d;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;

public class BaseFrame extends JFrame {
	
	protected JFrame parent;
	
	public BaseFrame(String title, int width, int height) {
		this(null, title, width, height);
	}
	
	public BaseFrame(JFrame parent, String title, int width, int height) {
		super(title);
		this.parent = parent;
		Container containerPanel = getContentPane();
		containerPanel.setLayout(new FlowLayout());
		setSize(width, height);
		setDefaultCloseOperation(parent == null ? 
				JFrame.EXIT_ON_CLOSE : JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(parent);
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		RenderingHints renderingHints = new RenderingHints(
				RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		renderingHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
		g2.setRenderingHints(renderingHints);
		paint(g2);
	}
	
	public void paint(Graphics2D g2) {
		// Empty
	}

}
