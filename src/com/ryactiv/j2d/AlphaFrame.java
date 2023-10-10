package com.ryactiv.j2d;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;

public class AlphaFrame extends BaseFrame {
	
	public AlphaFrame(JFrame parent) {
		super(parent, "AlphaComposite", 500, 500);
	}
	
	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.red);
		Rectangle2D r1 = new Rectangle2D.Float(250.0f, 50.0f, 100.0f, 100.0f);
		g2.fill(r1);
		AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
		g2.setColor(Color.green);
		g2.setComposite(ac);
		Rectangle2D r2 = new Rectangle2D.Float(200.0f, 100.0f, 100.0f, 100.0f);
		g2.fill(r2);
		ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
		g2.setColor(Color.magenta);
		g2.setComposite(ac);
		Rectangle2D r3 = new Rectangle2D.Float(150.0f, 150.0f, 100.0f, 100.0f);
		g2.fill(r3);
		ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f);
		g2.setColor(Color.yellow);
		g2.setComposite(ac);
		Rectangle2D r4 = new Rectangle2D.Float(100.0f, 200.0f, 100.0f, 100.0f);
		g2.fill(r4);
	}

}
