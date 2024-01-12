import java.awt.*;

public class Briques extends Rectangle {

    public Briques(int x, int y) {
        super(x, y, new Color((float)Math.random(),(float)Math.random(),(float)Math.random()), 49, 18);
    }

    public void dessiner(Graphics2D dessin){
        dessin.setColor(couleur);
        dessin.fillRect(x, y, this.largeur, this.hauteur);
    }


    }

