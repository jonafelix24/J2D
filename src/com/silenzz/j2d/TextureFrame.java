package com.ryactiv.j2d;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class TextureFrame extends BaseFrame {
	
	public TextureFrame(JFrame parent) {
		super(parent, "TexturePaint", 200, 200);
	}
	
	@Override
	public void render(Graphics2D g2) {
		BufferedImage bi = new BufferedImage(5, 5, BufferedImage.TYPE_INT_RGB);
		Graphics2D bigr = bi.createGraphics();
		bigr.setColor(Color.orange);
		Rectangle2D r2 = new Rectangle2D.Float(0.0f, 0.0f, 5.0f, 5.0f);
		bigr.fill(r2);
		bigr.setColor(Color.red);
		Ellipse2D e2 = new Ellipse2D.Float(0.0f, 0.0f, 5.0f, 5.0f);
		bigr.fill(e2);
		Rectangle2D r3 = new Rectangle2D.Double(0.0, 0.0, 5.0, 5.0);
		TexturePaint tp = new TexturePaint(bi, r3);
		g2.setPaint(tp);
		Rectangle2D rt = new Rectangle2D.Float(0.0f, 0.0f, 150.0f, 150.0f);
		g2.fill(rt);
	}

}
