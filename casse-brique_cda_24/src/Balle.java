import java.awt.*;

public class Balle extends Sprite{

    private int diametre;
    private int vitesseHorizontale;
    private int vitesseVerticale;


    public Balle(int diametre) {
        super((int)(Math.random() * CasseBrique.LARGEUR),
                (int)(Math.random() * CasseBrique.HAUTEUR),
                new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));
        this.diametre = diametre;
        this.vitesseHorizontale = (int)(Math.random() * 5) + 2;
        this.vitesseVerticale = (int)(Math.random() * 5) + 2;


    }

    public Balle(int x, int y, int diametre) {
        super(x, y, Color.MAGENTA);
//        this.x = x;
//        this.y = y;
        this.diametre = diametre;
        this.vitesseHorizontale = 5;
        this.vitesseVerticale = 4;
//        this.couleur = Color.MAGENTA;
    }

    public int getCentreX(){
        return x +diametre / 2;
    }

    public int getCentreY(){
        return y + diametre / 2;
    }

    public void deplacement() {
        x += vitesseHorizontale;
        y += vitesseVerticale;

        if (x >= CasseBrique.LARGEUR -diametre || x <= 0){
            vitesseHorizontale = -vitesseHorizontale;
        }

        if (y >= CasseBrique.HAUTEUR -40 || y <= 0){
            vitesseVerticale = -vitesseVerticale;
        }
    }
    public void dessiner(Graphics2D dessin){
        dessin.setColor(couleur); // on donne déjà la couleur avant de l'applique à l'objet
        dessin.fillOval(x, y, diametre, diametre);
    }


    public int getDiametre() {
        return diametre;
    }

    public void setDiametre(int diametre) {
        this.diametre = diametre;
    }

    public int getVitesseHorizontale() {
        return vitesseHorizontale;
    }

    public void setVitesseHorizontale(int vitesseHorizontale) {
        this.vitesseHorizontale = vitesseHorizontale;
    }

    public int getVitesseVerticale() {
        return vitesseVerticale;
    }

    public void setVitesseVerticale(int vitesseVerticale) {
        this.vitesseVerticale = vitesseVerticale;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}
