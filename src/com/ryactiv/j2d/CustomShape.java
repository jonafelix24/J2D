package com.ryactiv.j2d;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class CustomShape implements Shape {
	
	private Rectangle2D exterior;
	private RoundRectangle2D interior;
	private Ellipse2D sumidero;
	
	@Override
	public Rectangle getBounds() {
		return exterior.getBounds();
	}
	
	@Override
	public Rectangle2D getBounds2D() {
		return exterior.getBounds2D();
	}
	
	@Override
	public boolean contains(double x, double y) {
		return exterior.contains(x, y);
	}
	
	@Override
	public boolean contains(double x, double y, double w, double h) {
		return exterior.contains(x, y, w, h);
	}
	
	@Override
	public boolean contains(Point2D p) {
		return exterior.contains(p);
	}
	
	@Override
	public boolean contains(Rectangle2D r) {
		return exterior.contains(r);
	}
	
	@Override
	public boolean intersects(double x, double y, double w, double h) {
		return exterior.intersects(x, y, w, h);
	}
	
	@Override
	public boolean intersects(Rectangle2D r) {
		return exterior.intersects(r);
	}
	
	@Override
	public PathIterator getPathIterator(AffineTransform at) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
		// TODO Auto-generated method stub
		return null;
	}

}
