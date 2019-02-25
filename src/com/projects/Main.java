package com.projects;
import java.awt.image.BufferedImage;
import java.io.*;
import java.awt.*;
import javax.imageio.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File imgFile = new File("C:\\Users\\mark\\IdeaProjects\\PixelImage\\Images\\lion.jpg");
        File imgFile1 = new File("C:\\Users\\mark\\IdeaProjects\\PixelImage\\Images\\Punishersymbol.jpg");
        File imgFile2 = new File("C:\\Users\\mark\\IdeaProjects\\PixelImage\\Images\\waterfall2.jpg");
//        GreyScale.gryScale(imgFile);


        HideImage val = new HideImage(imgFile, imgFile);
        val.EncryptImage();
        val.WriteEncryptImg("lion2");

/*              Prints out the dot matrix of the punisher symbol file.
        matrixValues mat = new matrixValues(imgFile1);
        mat.printDotMatrix();
*/
    }
}
