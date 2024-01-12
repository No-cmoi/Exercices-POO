import java.awt.*;

public class Barre extends Rectangle {

    protected int vitesse = 25;

    public Barre() {

        super(
                0,
                CasseBrique.HAUTEUR - 100,
                Color.BLUE,
                100,
                20
         );

        this.x = CasseBrique.LARGEUR / 2 - 100 / 2;
    }
    public void deplacerGauche() {
        if (x >0) {
            x -= vitesse;
        }
    }
    public void deplacerDroite() {
        if (x < CasseBrique.LARGEUR - this.largeur) {
            x += vitesse;
        }
    }
}
