package com.projects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by mark on 2/22/2019.
 */
public class matrixValues {


    File baseFile;
    BufferedImage baseImg;


    public matrixValues(File Image){
        try {
            this.baseFile = Image;
            this.baseImg = ImageIO.read(Image);
        }catch (Exception e){
            System.out.print("heloo");
        }
    }

    public void printRedMatrix(){
        BufferedImage img = this.baseImg;
        for(int i = 0; i < img.getWidth(); i++) {
            System.out.print("\n");
            for(int j = 0; j < img.getHeight(); j++) {
                Color x = new Color(img.getRGB(i, j));
//                int red = x.getRed();
                    System.out.print(x.getRed());
            }
        }
    }    public void printAlphaMatrix(){
        BufferedImage img = this.baseImg;
        for(int i = 0; i < img.getWidth(); i++) {
            System.out.print("\n");
            for(int j = 0; j < img.getHeight(); j++) {
                Color x = new Color(img.getRGB(i, j));
                    System.out.print(x.getAlpha());
            }
        }
    }
}
