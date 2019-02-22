package com.projects;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.*;
import java.nio.Buffer;
import javax.imageio.*;


public class HideImage{

    File baseFile;
    File hideFile;
    BufferedImage baseImg;
    BufferedImage hideImg;

    public HideImage(File BaseImage){
        try {
            this.baseFile = BaseImage;
            this.baseImg = ImageIO.read(BaseImage);
        }catch (Exception e){
            System.out.print("heloo");
        }
    }
    //Constuctor
    public HideImage(File BaseFile, File hideFile){
        try {
            this.baseImg = ImageIO.read(BaseFile);
            this.hideImg = ImageIO.read(hideFile);
            this.baseFile = BaseFile;
            this.hideFile = hideFile;
        }catch (Exception e){
            System.out.print("heloo");
        }
    }

    public Color getColor(BufferedImage img, int x, int y){
        Color rgbColor = new Color(img.getRGB(x , y));
        return rgbColor;
    }

    public int getRedValue(int x, int y) {
        Color red = new Color(this.baseImg.getRGB(x, y));
        int r = red.getRed();
        return r;
    }
    public int getGreenValue(int x, int y) {
        Color green = new Color(this.baseImg.getRGB(x, y));
        int r = green.getGreen();
        return r;
    }
    public int getBlueValue(int x, int y) {
        Color blue = new Color(this.baseImg.getRGB(x, y));
        int r = blue.getBlue();
        return r;
    }


    public BufferedImage EncryptImage(){
        BufferedImage encryptedImage = null;
        for( int i = 0; i < this.baseImg.getWidth(); i++){
            for(int j = 0; j < this.baseImg.getHeight(); j++){
//             getColor(baseImg, i, j)
               Color base = getColor(baseImg, i, j);
                int baseRed = base.getRed();
                int baseGreen = base.getGreen();
                int baseBlue = base.getBlue();
                System.out.println(baseRed);

            }
        }
        return encryptedImage;
    }




}
