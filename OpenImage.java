import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class OpenImage
{
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\gagan\\Desktop\\Blender_Projects\\HackReality\\final_sword_image.png");
        Desktop d = Desktop.getDesktop();
        d.open(f);

    }
}
