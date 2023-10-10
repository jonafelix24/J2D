package com.ryactiv.j2d;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;

public class GeneralPathFrame extends BaseFrame {
	
	public GeneralPathFrame(JFrame parent) {
		super(parent, "GeneralPath", 500, 500);
	}
	
	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.green);
		GeneralPath gp = new GeneralPath();
		gp.moveTo(50.0f,50.0f);
		gp.lineTo(100.0f,50.0f);
		gp.curveTo(120.0f,30.0f,120.0f,100.0f,180.0f,125.0f);
		gp.lineTo(50.0f,150.0f);
		gp.closePath();
		// Relleno y contorno
		g2.fill(gp);
		g2.setColor(Color.blue);
		g2.draw(gp);
	}

}
