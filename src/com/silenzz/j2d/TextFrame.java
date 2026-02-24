package com.ryactiv.j2d;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextAttribute;
import java.awt.font.TextLayout;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TextFrame extends JFrame {
    
    private static final Hashtable<TextAttribute, Float> map = new Hashtable<>();
    private static AttributedString textAttr;
    
    static {
        map.put(TextAttribute.SIZE, 18.0f);
        textAttr = new AttributedString(
                "Tres tristes tigres comen trigo "
                + "en un trigal. Un tigre, dos tigres, tres tigres. "
                + "Pablito clavó un clavito, ¿qué clavito clavó Pablito?",
                map);
    }
	
	public TextFrame(JFrame parent) {
		super("Texto Parrafo");
		super.setBackground(Color.WHITE);
		PanelTextLines panel = new PanelTextLines();
		add(panel, BorderLayout.CENTER);
		setSize(400, 250);
        setDefaultCloseOperation(parent == null ? 
                JFrame.EXIT_ON_CLOSE : JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(parent);
	}
	
	private class PanelTextLines extends JPanel {
	    
	    private static final int MARGIN = 12;
	    
	    private LineBreakMeasurer lineMeasurer;
	    private int startSection;
	    private int endSection;
	    
	    public PanelTextLines() {
	        AttributedCharacterIterator section = textAttr.getIterator();
	        startSection = section.getBeginIndex();
	        endSection = section.getEndIndex();
	        lineMeasurer = new LineBreakMeasurer(section, new FontRenderContext(null, false, false));
	    }
	    
	    @Override
	    public void paint(Graphics g) {
	        super.paint(g);
	        Graphics2D g2 = (Graphics2D) g;
	        
	        Dimension size = getSize();
	        float lineWidth = (float) size.width - (MARGIN * 2);
	        float yPos = 0;
	        float xPos = 0;
	        
	        lineMeasurer.setPosition(startSection);
	        
	        while (lineMeasurer.getPosition() < endSection) {
	            TextLayout layout = lineMeasurer.nextLayout(lineWidth);
	            yPos += layout.getAscent();
	            if (layout.isLeftToRight()) {
	                xPos = MARGIN;
	            } else {
	                xPos = lineWidth - layout.getAdvance();
	            }
	            layout.draw(g2, xPos, yPos);
	            yPos += layout.getDescent() + layout.getLeading();
	        }
	    }
	    
	}

}
