package com.ryactiv.j2d;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JFrame;

public class GeomShapesFrame extends BaseFrame {
	
	public GeomShapesFrame(JFrame parent) {
		super(parent, "GeomShape", 500, 500);
	}
	
	@Override
	public void render(Graphics2D g2) {
		// Dibujar linea
		g2.setColor(Color.pink);
		g2.setStroke(new BasicStroke(3.0f));
		Line2D linePink = new Line2D.Float(50.0f, 50.0f, 200.0f, 200.0f);
		g2.draw(linePink);
		
		// Dibujar linea con Point2D
		g2.setColor(Color.cyan);
		Point2D p1 = new Point2D.Float(23.5f, 48.9f);
		Point2D p2 = new Point2D.Float(158.0f, 173.0f);
		Line2D linePoint = new Line2D.Float(p1, p2);
		g2.draw(linePoint);
		
		// Dibujar rectangulo
		g2.setColor(Color.red);
		Rectangle2D rectRed = new Rectangle2D.Float(100.0f, 75.0f, 50.0f, 100.0f);
		g2.draw(rectRed);
		
		// Dibujar rectangulo redondeado
		g2.setColor(Color.blue);
		RoundRectangle2D q = new RoundRectangle2D.Float(
		175.0f, 50.0f, 100.0f, 150.0f, 25.0f, 25.0f);
		g2.draw(q);
		
		// Dibujar elipse
		g2.setColor(Color.orange);
		Ellipse2D e = new Ellipse2D.Float(100.0f,75.0f,50.0f,100.0f);
		g2.draw(e);
		
		// Dibujar arcos
		g2.setColor(Color.green);
		Arc2D a1 = new Arc2D.Float(350.0f, 50.0f, 50.0f, 100.0f, 0.0f, 135.0f, Arc2D.PIE);
		g2.draw(a1);
		g2.setColor(Color.blue);
		Arc2D a2 = new Arc2D.Float(350.0f, 125.0f, 50.0f, 100.0f, 0.0f, 135.0f, Arc2D.CHORD);
		g2.draw(a2);
		g2.setColor(Color.blue);
		Arc2D a3 = new Arc2D.Float(350.0f, 200.0f, 50.0f, 100.0f, 0.0f, 135.0f, Arc2D.OPEN);
		g2.draw(a3);
		
		// Curvas cuadraticas Bezier
		g2.setColor(Color.blue);
		QuadCurve2D q1 = new QuadCurve2D.Float(
				40.0f, 120.0f, 40.0f, 220.0f, 190.0f, 270.0f);
		g2.draw(q1);
		// Nodos de la curva
		g2.setColor(Color.red);
		g2.draw(new Rectangle2D.Float(40.0f, 120.0f, 1.0f, 1.0f));
		g2.draw(new Rectangle2D.Float(40.0f, 220.0f, 1.0f, 1.0f));
		g2.draw(new Rectangle2D.Float(190.0f, 270.0f, 1.0f, 1.0f));
		
		// Curvas cubicas
		g2.setColor(Color.pink);
		CubicCurve2D c1 =new CubicCurve2D.Float(
		40.0f, 260.0f, 60.0f, 320.0f, 140.0f, 330.0f, 150.0f, 410.0f);
		g2.draw(c1);
		// Nodos de la curva
		g2.setColor(Color.blue);
		g2.draw(new Rectangle2D.Float(40.0f, 260.0f, 1.0f, 1.0f));
		g2.draw(new Rectangle2D.Float(60.0f, 320.0f, 1.0f, 1.0f));
		g2.draw(new Rectangle2D.Float(140.0f, 330.0f, 1.0f, 1.0f));
		g2.draw(new Rectangle2D.Float(150.0f, 410.0f, 1.0f, 1.0f));
	}

}
