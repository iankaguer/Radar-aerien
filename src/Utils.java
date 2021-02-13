import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static final int W_WIDTH = 1800;
    public static final int W_HEIGHT = 720;
    public static final ArrayList<Aeroport> BASES = new ArrayList<Aeroport>() {{
        add(new Aeroport("CARACAS", 120, 290));
        add(new Aeroport("CASABLANCA", 255, 145));
        add(new Aeroport("PARIS", 505, 95));
        add(new Aeroport("SYDNEY", 481, 700));
        add(new Aeroport("JOBOURG", 255, 499));
        add(new Aeroport("TOKYO", 225, 749));
        add(new Aeroport("MUNICH", 695, 419));
    }};


    public static final void ligneVol(ArrayList<Aeroport> BASES){
        ArrayList liaison= new ArrayList<>();
        for (int i=0; i<BASES.size(); i++){



        }
    }
    public static Image avionImg() {
        try {
            return ImageIO.read(new File("img/aeroplane.png"));
        } catch (IOException e) {
            System.err.println("aucune image");
            return null;
        }
    }





}
