import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class SaveImage implements SaveImageImp {
    @Override
    public boolean save(BufferedImage image, String location, String name, String type){
        try {
            String path = location+name+"."+type;
            ImageIO.write(image, type, new File(path));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
