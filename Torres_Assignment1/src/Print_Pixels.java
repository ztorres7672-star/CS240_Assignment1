/**
 * Program: Print Pixels
 * Description: 3. Write a program that reads an image and prints its pixel values.
 * Section: CS 240
 * Date: August 31, 2026
 * @author Student Name: Ziahn Torres
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.imageio.ImageIO;
public class Print_Pixels {
    public static void main(String[] args) throws IOException {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("image file do you want to print?: ");
        String s1 = scan1.nextLine();
        PrintWriter outputFile = new PrintWriter("output.txt");
        BufferedImage imageFile = ImageIO.read(new File(s1));
        int width = imageFile.getWidth();
        int height = imageFile.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color color = new Color(imageFile.getRGB(x, y));
                String convertedColor = convert(color);

                outputFile.print(convertedColor);
                outputFile.print(" ");
            }
            outputFile.println();
        }
        outputFile.close();

    }
    //Color to String
    public static String convert(Color color){
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();

        if (red == 255 && green == 0 && blue == 0) {return "R";}
        else if (red == 0 && green == 0 && blue == 0) {return "K";}
        else if (red == 255 && green == 255 && blue == 0) {return "Y";}
        else if (red == 255 && green == 255 && blue == 255) {return "W";}
        else if (red == 0 && green == 0 && blue == 255) {return "B";}
        else {return "(" + red + ", " + green + ", " + blue + ")";}
    }
}
