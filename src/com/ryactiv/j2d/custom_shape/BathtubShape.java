package com.ryactiv.j2d.custom_shape;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class BathtubShape implements Shape {
    
    public enum Part {
        OUTSIDE,
        INSIDE,
        SINK
    };
	
	private Rectangle2D outside;
	private RoundRectangle2D inside;
	private Ellipse2D sink;
	
	public BathtubShape(double x, double y, double w, double h) {
	    outside = new Rectangle2D.Double(x, y, w, h);
	    inside = new RoundRectangle2D.Double(x + 10, y + 10, w - 20, h - 20, 25, 25);
	    sink = new Ellipse2D.Double(x + w / 2 - 5, y + 15, 10, 10);
	}
	
	@Override
	public Rectangle getBounds() {
		return outside.getBounds();
	}
	
	@Override
	public Rectangle2D getBounds2D() {
		return outside.getBounds2D();
	}
	
	@Override
	public boolean contains(double x, double y) {
		return outside.contains(x, y);
	}
	
	@Override
	public boolean contains(double x, double y, double w, double h) {
		return outside.contains(x, y, w, h);
	}
	
	@Override
	public boolean contains(Point2D p) {
		return outside.contains(p);
	}
	
	@Override
	public boolean contains(Rectangle2D r) {
		return outside.contains(r);
	}
	
	@Override
	public boolean intersects(double x, double y, double w, double h) {
		return outside.intersects(x, y, w, h);
	}
	
	@Override
	public boolean intersects(Rectangle2D r) {
		return outside.intersects(r);
	}
	
	@Override
	public PathIterator getPathIterator(AffineTransform at) {
		return new BathtubPathIterator(at);
	}
	
	@Override
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
	    return new BathtubPathIterator(at, flatness);
	}
	
	private class BathtubPathIterator implements PathIterator {
	    
	    private PathIterator currentIterator;
	    private Part currentPart;
	    private boolean hasFlatness;
	    private AffineTransform affineTransform;
	    private double flatness;
	    
	    private BathtubPathIterator() {
	        currentPart = Part.OUTSIDE;
	    }
	    
	    public BathtubPathIterator(AffineTransform affineTransform) {
	        this();
	        this.affineTransform = affineTransform;
	        currentIterator = outside.getPathIterator(affineTransform);
	    }
	    
	    public BathtubPathIterator(AffineTransform affineTransform, double flatness) {
            this(affineTransform);
            hasFlatness = true;
            this.flatness = flatness;
        }

	    @Override
	    public int getWindingRule() {
	        return currentIterator.getWindingRule();
	    }

	    @Override
	    public boolean isDone() {
	        if (currentIterator.isDone()) {
                if (currentPart == Part.OUTSIDE) {
                    currentPart = Part.INSIDE;
                    currentIterator = hasFlatness ? 
                            inside.getPathIterator(affineTransform, flatness) 
                            : inside.getPathIterator(affineTransform);
                } else if (currentPart == Part.INSIDE) {
                    currentPart = Part.SINK;
                    currentIterator = hasFlatness ? 
                            sink.getPathIterator(affineTransform, flatness) 
                            : sink.getPathIterator(affineTransform);
                }
            }
            return currentIterator.isDone();
	    }

	    @Override
	    public void next() {
	        currentIterator.next();
	    }

	    @Override
	    public int currentSegment(float[] coords) {
	        return currentIterator.currentSegment(coords);
	    }

	    @Override
	    public int currentSegment(double[] coords) {
	        return currentIterator.currentSegment(coords);
	    }

	}

}
