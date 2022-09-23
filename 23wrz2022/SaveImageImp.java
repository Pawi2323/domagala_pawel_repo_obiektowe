import java.awt.image.BufferedImage;

public interface SaveImageImp {
    boolean save(BufferedImage image, String location, String name, String type);
}
