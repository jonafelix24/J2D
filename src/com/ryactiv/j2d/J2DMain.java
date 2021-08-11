package com.ryactiv.j2d;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class J2DMain extends JFrame implements ActionListener {
	
	private JButton btnAlpha;
	private JButton btnTexture;
	private JButton btnClip;
	private JButton btnTransform;

	public J2DMain() {
		super("Ejemplos Java2D");
		Container containerPanel = getContentPane();
		containerPanel.setLayout(new FlowLayout());
		//setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAlpha = new JButton("Alpha");
		btnTexture = new JButton("Texture");
		btnClip = new JButton("Clip");
		btnTransform = new JButton("Transform");
		
		containerPanel.add(btnAlpha);
		containerPanel.add(btnTexture);
		containerPanel.add(btnClip);
		containerPanel.add(btnTransform);
		
		btnAlpha.addActionListener(this);
		btnTexture.addActionListener(this);
		btnClip.addActionListener(this);
		btnTransform.addActionListener(this);
		
		pack();
		setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnAlpha)) {
			AlphaFrame alphaFrame = new AlphaFrame(this);
			alphaFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnTexture)) {
			TextureFrame textureFrame = new TextureFrame(this);
			textureFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnClip)) {
			ClipFrame clipFrame = new ClipFrame(this);
			clipFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnTransform)) {
			TransformFrame transformFrame = new TransformFrame(this);
			transformFrame.setVisible(true);
			return;
		}
	}

	public static void main(String[] args) {
		J2DMain frame = new J2DMain();
		frame.setVisible(true);
	}

}
