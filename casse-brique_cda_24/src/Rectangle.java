import java.awt.*;

public class Rectangle extends Sprite{

    public Rectangle(int x, int y, Color couleur, int largeur, int hauteur) {
        super(x, y, couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    protected int largeur;
    protected int hauteur;




    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public boolean collision(Balle balle){
        return balle.getX() > x
                && balle.getCentreX() < x + largeur
                && balle.getCentreY() > y - balle.getDiametre()
                && balle.getCentreY() < y + hauteur;
    }

    @Override
    void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur); // on donne déjà la couleur avant de l'applique à l'objet
        dessin.fillRect(x, y, largeur, hauteur);
    }
}
