import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;

public class DownloadImage{
    public BufferedImage downloadUsingStream(String urlStr){
        BufferedImage image = null;
        URL url = null;
        try {
            url = new URL(urlStr);
            image = ImageIO.read(url);
            return image;
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}