package com.ryactiv.j2d.custom_shape;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JFrame;

import com.ryactiv.j2d.BaseFrame;

public class CustomShapeFrame extends BaseFrame {
	
	public CustomShapeFrame(JFrame parent) {
		super(parent, "GeneralPath", 500, 500);
	}
	
	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.BLUE);
		g2.setStroke(new BasicStroke(3.0f));
		BathtubShape b1 = new BathtubShape(50, 50, 120, 180);
		g2.fill(b1);
		BathtubShape b2 = new BathtubShape(200, 50, 120, 180);
		g2.draw(b2);
		g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(1.5f));
		BathtubShape b3 = new BathtubShape(350, 50, 50, 120);
		g2.draw(b3);
	}

}
