package com.projects;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.*;
import javax.imageio.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File imgFile1 = new File("C:\\Users\\mark\\IdeaProjects\\PixelImage\\WaterFall\\waterfall.jpg");
        File imgFile2 = new File("C:\\Users\\mark\\IdeaProjects\\PixelImage\\WaterFall\\waterfall2.jpg");
        //GreyScale.gryScale(imgFile1);

        matrixValues mat = new matrixValues(imgFile1);
        mat.printAlphaMatrix();


//        HideImage val = new HideImage(imgFile1, imgFile2);
//        val.EncryptImage();

//        BufferedImage img2 = ImageIO.read(imgFile);
//        System.out.println(img2.getHeight());
//        System.out.println(img2.getWidth());
    }
}
