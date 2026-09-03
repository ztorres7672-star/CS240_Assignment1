import javax.imageio.ImageIO;

/**
 * Program: Pixels to Image
 * Description: 4. Write a program that consumes pixel values and creates an image.
 * Section: CS 240
 * Date: September 2, 2026
 * @author Student Name: Ziahn Torres
 */
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
public class Pixels_to_Image {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Path.of("input.txt"));
        int width = lines.get(0).split("\\s+").length;
        int height = lines.size();

        BufferedImage outputImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++){
            System.out.println(lines.get(y));
            String[] pixels = lines.get(y).trim().split("\\s+");
            for (int x = 0; x < width; x++){
                Color pixel = convert(pixels[x]);
                outputImage.setRGB(x,y,pixel.getRGB());

            }
        }
        ImageIO.write(outputImage, "png", new File("output.png"));
    }
    public static Color convert(String color){

        if (color.equals("R")) {return new Color(255,0,0);}
        else if (color.equals("G")) {return new Color(0,255,0);}
        else if (color.equals("B")) {return new Color(0,0,255);}
        else if (color.equals("W")) {return new Color(255,255,255);}
        else if (color.equals("Y")) {return new Color(255,255,0);}
        else {return new Color(0,0,0);}
    }
}
