package com.bjf;

import junit.framework.TestCase;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {

    /**
     * Rigourous Test :-)
     */
    public void testReShape() throws IOException {
        File file = Paths.get("src/main/resources/test.png").toFile();
        BufferedImage image = ImageIO.read(file);
        int size = Math.max(image.getWidth(), image.getHeight());
        BufferedImage resultImage =  ImageUtils.reShape(image, size/2, size/2);
        assertTrue( true );
    }

    /**
     * Rigourous Test :-)
     */
    public void testFill() throws IOException {
        File file = Paths.get("src/main/resources/test.png").toFile();
        BufferedImage image = ImageIO.read(file);
        int size = Math.max(image.getWidth(), image.getHeight());
        BufferedImage resultImage =  ImageUtils.fillImageByColor(image, size*2, size, new Color(0,0,0));
        assertTrue( true );
    }
}
