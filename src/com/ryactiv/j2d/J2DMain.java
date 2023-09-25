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
	private JButton btnComposite;
	private JButton btnGeomShapes;
	private JButton btnGeneralPath;

	public J2DMain() {
		super("Ejemplos Java2D");
		Container containerPanel = getContentPane();
		containerPanel.setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAlpha = new JButton("Alpha");
		btnTexture = new JButton("Texture");
		btnClip = new JButton("Clip");
		btnTransform = new JButton("Transform");
		btnComposite = new JButton("Composite");
		btnGeomShapes = new JButton("Geom shapes");
		btnGeneralPath = new JButton("GeneralPath");
		
		containerPanel.add(btnAlpha);
		containerPanel.add(btnTexture);
		containerPanel.add(btnClip);
		containerPanel.add(btnTransform);
		containerPanel.add(btnComposite);
		containerPanel.add(btnGeomShapes);
		containerPanel.add(btnGeneralPath);
		
		btnAlpha.addActionListener(this);
		btnTexture.addActionListener(this);
		btnClip.addActionListener(this);
		btnTransform.addActionListener(this);
		btnComposite.addActionListener(this);
		btnGeomShapes.addActionListener(this);
		btnGeneralPath.addActionListener(this);
		
		setSize(500, 300);
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
		if (e.getSource().equals(btnComposite)) {
			CompositeFrame compositeFrame = new CompositeFrame(this);
			compositeFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnGeomShapes)) {
			GeomShapesFrame geomShapesFrame = new GeomShapesFrame(this);
			geomShapesFrame.setVisible(true);
			return;
		}
		if (e.getSource().equals(btnGeneralPath)) {
			GeneralPathFrame generalPathFrame = new GeneralPathFrame(this);
			generalPathFrame.setVisible(true);
			return;
		}
	}

	public static void main(String[] args) {
		J2DMain frame = new J2DMain();
		frame.setVisible(true);
	}

}
