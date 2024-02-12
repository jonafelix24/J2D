package com.ryactiv.j2d.areas;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

import com.ryactiv.j2d.BaseFrame;

public class AreaExclusiveORFrame extends BaseFrame {
	
	public AreaExclusiveORFrame(JFrame parent) {
		super(parent, "Area ExclusiveOR", 500, 500);
	}
	
	@Override
	public void render(Graphics2D g2) {
		GradientPaint gp = new GradientPaint(
		        50.0f, 50.0f, Color.BLUE, 
		        200.0f, 50.0f, Color.RED);
		g2.setPaint(gp);
		Ellipse2D e1 = new Ellipse2D.Double(50, 50, 80, 80);
		Ellipse2D e2 = new Ellipse2D.Double(100, 50, 80, 80);
		Area a1 = new Area(e1);
		Area a2 = new Area(e2);
		a1.exclusiveOr(a2);
		g2.fill(a1);
	}

}
