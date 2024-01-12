import java.awt.*;

public abstract class Sprite { // on met abstract pour que cette classe ne puisse pas être instanciée

    protected int x = 0;
    protected int y = 0;
    protected Color couleur;

    public Sprite(int x, int y, Color couleur) {
        this.x = x;
        this.y = y;
        this.couleur = couleur;
    }

    abstract void dessiner(Graphics2D dessin);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}
