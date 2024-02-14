package com.ryactiv.j2d.util;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageUtil {
    
    public static Image getImage(String filename) {
        return Toolkit.getDefaultToolkit().getImage(filename);
    }
    
    public static BufferedImage getBufferedImage(String filename) {
        try {
            return ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
