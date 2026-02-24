package com.ryactiv.j2d;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

public class ClipFrame extends BaseFrame {
	
	public ClipFrame(JFrame parent) {
		super(parent, "Clip", 250, 250);
	}
	
	@Override
	public void render(Graphics2D g2) {
		int ancho = getSize().width;
		int largo = getSize().height;
		
		Ellipse2D e = new Ellipse2D.Float (ancho / 4.0f, largo / 4.0f, ancho / 2.0f, largo / 2.0f);
		g2.setClip(e);
		g2.setColor(Color.cyan);
		g2.fill(new Rectangle2D.Float(0.0f, 0.0f, ancho, largo));
		
		Rectangle2D r2 = new Rectangle2D.Float(
				ancho / 4.0f + 10.0f, largo / 4.0f + 10.0f, 
				ancho / 2.0f - 20.0f, largo / 2.0f - 20.0f);
		g2.clip(r2);
		g2.setColor(Color.white);
		g2.fill(new Rectangle2D.Float(0.0f, 0.0f, ancho, largo));
	}

}
