package com.ryactiv.j2d;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import com.ryactiv.j2d.util.ImageUtil;

public class ImageExampleFrame extends BaseFrame {
	
	public ImageExampleFrame(JFrame parent) {
		super(parent, "Image example", 500, 500);
	}
	
	@Override
	public void render(Graphics2D g2) {
		Image image = ImageUtil.getImage("res/java_icon.png");
		g2.drawImage(image, 0, 20, this);
		BufferedImage bfi = ImageUtil.getBufferedImage("res/java_icon.png");
		g2.drawImage(bfi, 0, 200, this);
	}

}
