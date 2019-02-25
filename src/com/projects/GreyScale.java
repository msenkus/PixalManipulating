package com.projects;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.*;
import javax.imageio.*;


/**
 * Created by mark on 2/20/2019.
 */
public class GreyScale{

    public static void gryScale(File imgFile) throws IOException{
        BufferedImage img = null;
        img = ImageIO.read(imgFile);

        //Color x = new Color(158, 12, 125, 100);

        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                Color Tp = new Color(img.getRGB(i, j));
                int r = Tp.getRed();
                int g = Tp.getGreen();
                int b = Tp.getBlue();
                int gry = ((r + g + b) / 3);
                Color x = new Color(gry, gry, gry, 100);
                img.setRGB(i, j, x.getRGB());
            }
        }
        ImageIO.write(img, "jpg", new File("C:\\Users\\mark\\IdeaProjects\\PixelImage\\Images\\waterfall2.jpg"));
    }
}
