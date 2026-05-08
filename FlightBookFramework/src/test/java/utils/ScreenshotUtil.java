package utils;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.File;

public class ScreenshotUtil {

    public static void captureScreenshot(
            String fileName) {

        try {

            Robot robot = new Robot();

            Rectangle screenRect =
                    new Rectangle(
                            Toolkit.getDefaultToolkit()
                                    .getScreenSize());

            BufferedImage image =
                    robot.createScreenCapture(
                            screenRect);

            ImageIO.write(
                    image,
                    "png",
                    new File(
                            "screenshots/"
                                    + fileName
                                    + ".png"));

            System.out.println(
                    "Screenshot Captured");

        }

        catch (Exception e) {

            e.printStackTrace();
        }
    }
}