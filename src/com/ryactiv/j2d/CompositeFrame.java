package com.ryactiv.j2d;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class CompositeFrame extends BaseFrame {
	
	public CompositeFrame(JFrame parent) {
		super(parent, "AlphaComposite", 500, 500);
	}
	
	@Override
	public void render(Graphics2D g2) {
		Dimension d = getSize();
		int w = d.width;
		int h = d.height;
		// Crea una BufferedImage.
		BufferedImage buffImg = new BufferedImage(w, h,
		BufferedImage.TYPE_INT_ARGB);
		Graphics2D gbi = buffImg.createGraphics();
		// Dibujo de un cuadrado rojo
		gbi.setColor(Color.red);
		Rectangle2D r1 = new Rectangle2D.Float(150.0f, 50.0f, 100.0f, 100.0f);
		gbi.fill(r1);
		AlphaComposite ac;
		// Dibujo de un rectángulo verde encima
		ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER);
		gbi.setColor(Color.green);
		gbi.setComposite(ac);
		Rectangle2D r2 = new Rectangle2D.Float(150.0f, 100.0f, 150.0f, 100.0f);
		gbi.fill(r2);
		// Dibujo de un cuadrado magenta con preferencia de lo que hay debajo
		ac = AlphaComposite.getInstance(AlphaComposite.DST_OVER);
		gbi.setColor(Color.magenta);
		gbi.setComposite(ac);
		Rectangle2D r3 = new Rectangle2D.Float(100.0f, 100.0f, 100.0f, 100.0f);
		gbi.fill(r3);
		// Dibujo de un cuadrado amarillo que modifica sólo sobre lo que se superpone
		ac = AlphaComposite.getInstance(AlphaComposite.DST_IN, 0.15f);
		gbi.setColor(Color.yellow);
		gbi.setComposite(ac);
		Rectangle2D r4 = new Rectangle2D.Float(150.0f, 150.0f, 100.0f, 100.0f);
		gbi.fill(r4);
		g2.drawImage(buffImg, null, 0, 0);
	}

}
