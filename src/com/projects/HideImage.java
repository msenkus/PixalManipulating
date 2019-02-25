package com.projects;
import java.awt.image.*;
import java.io.*;
import java.awt.*;
import java.nio.Buffer;
import javax.imageio.*;

import static java.awt.image.BufferedImage.TYPE_BYTE_BINARY;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import static java.awt.image.BufferedImage.TYPE_INT_RGB;


public class HideImage{

    File baseFile;
    File hideFile;
    BufferedImage baseImg;
    BufferedImage hideImg;
   // BufferedImage EncryptedImage = new BufferedImage(baseImg.getWidth(), baseImg.getHeight(), TYPE_INT_ARGB);

    //Constuctor
    public HideImage(File BaseFile, File hideFile){
        try {
            this.baseImg = ImageIO.read(BaseFile);
            this.hideImg = ImageIO.read(hideFile);
            if(hideImg.getWidth() > baseImg.getWidth() || hideImg.getHeight() > baseImg.getHeight()){
                this.hideImg = hideImg.getSubimage(0,0, baseImg.getWidth(),baseImg.getHeight());
            }
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
/*
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
*/

    public void EncryptImage(){
//        BufferedImage encryptedImage = null;
        try {
            for (int i = 0; i < this.baseImg.getWidth(); i++) {
                for (int j = 0; j < this.baseImg.getHeight(); j++) {
//             getColor(baseImg, i, j)
                    Color base = getColor(baseImg, i, j);
                    int baseRed =  base.getRed();
                    int baseGreen =  base.getGreen();
                    int baseBlue =  base.getBlue();

                    //hide-- is storing the RGB values of the image you want to hide.
                    Color hide = getColor(hideImg, i, j);
                    int hideRed = hide.getRed();
                    int hideGreen = hide.getGreen();
                    int hideBlue = hide.getBlue();

                    // en-- is the encrypted variable
                    int enRed = combSigNumbers(baseRed, hideRed);
                    int enGreen = combSigNumbers(baseGreen, baseBlue);
                    int enBlue = combSigNumbers(baseBlue, hideBlue);

                    Color enRGB = new Color(enRed, enGreen, enBlue);
                    hideImg.setRGB(i, j, enRGB.getRGB());
                }
            }
        }catch(Exception e){}
//        return encryptedImage;
    }

    public int combSigNumbers(int num1, int num2){
        num1 = (int) (Math.floor(num1/16));
        num2 = (int) ((Math.floor(num2/16)) * 16);
        return num1 + num2;
    }
    public void WriteEncryptImg(String fileName) throws IOException{
            ImageIO.write(hideImg, "jpg", new File("C:\\Users\\mark\\IdeaProjects\\PixelImage\\Images\\" + fileName + ".jpg"));
    }

}
