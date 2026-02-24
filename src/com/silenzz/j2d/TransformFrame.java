package com.ryactiv.j2d;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;

public class TransformFrame extends BaseFrame {
	
	public TransformFrame(JFrame parent) {
		super(parent, "AffineTransform", 250, 250);
	}
	
	@Override
	public void render(Graphics2D g2) {
		int ancho = getSize().width;
		int largo = getSize().height;
		
		AffineTransform aT = g2.getTransform();
		aT.translate(ancho / 4, (largo / 4) + 25);
		g2.transform(aT);
		aT.setToRotation(Math.PI / 4.0);
		for (int i = 0; i < 8; i++) {
			g2.drawString("Java2D", 0.0f, 0.0f);
			g2.transform(aT);
		}
	}

}
