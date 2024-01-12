import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class CasseBrique extends Canvas implements KeyListener {

    public static final int LARGEUR = 500; // on définit des paramètres qui ne bougeront plus
    public static final int HAUTEUR = 600;

    protected Barre barre = new Barre();
    protected ArrayList<Balle>listeBalle = new ArrayList<>();
    protected ArrayList<Briques>listeBrique = new ArrayList<>();

    public CasseBrique(){

        JFrame fenetre = new JFrame();

        this.setSize(LARGEUR, HAUTEUR); // on donne une taille à la fenêtre
        this.setBounds(0,0, LARGEUR, HAUTEUR); //limites du canvas
        this.setIgnoreRepaint(true);
        this.setFocusable(false);

        fenetre.pack();
        fenetre.setSize(LARGEUR, HAUTEUR + 40); //taille de la fenêtre
        fenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //se ferme quand on ferme la fenêtre
        fenetre.setResizable(false); // on lui dit que la taille de la fenêtre n'est pas réajustable
        fenetre.requestFocus(); // on lui indique que le focus se fera sur cette fenêtre
        fenetre.addKeyListener(this);

        Container panneau = fenetre.getContentPane(); // on lui applique un panneau
        panneau.add(this); // et on lui applique le panneau canvas

        this.createBufferStrategy(2);
        fenetre.setVisible(true);
        demarrer();

//        ActionListener evenement = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("coucou");
//            }
//        };

//        monBouton.addActionListener((e) -> System.out.println("coucou"));
    }
    public void demarrer(){


            for(int i =0; i < 1; i++){
                listeBalle.add(new Balle(20));
            }

            // Créer 5 x 10 briques
            // Alimenter l'Arraylist listeBrique

            for (int i = 0; i < 500; i += 50){
                for (int j = 0; j < 100; j += 20){
                    listeBrique.add(new Briques(i, j));
                }
        }

        

        while(true) {

            try {

                Graphics2D dessin = (Graphics2D) this.getBufferStrategy().getDrawGraphics();

                dessin.setColor(Color.white);
                dessin.fillRect(0,0, LARGEUR, HAUTEUR);

                barre.dessiner(dessin);

                for(Balle balle : listeBalle) {
                    balle.dessiner(dessin);
                    balle.deplacement();

                for (Briques briques : listeBrique){
                    briques.dessiner(dessin);
                }

                    //pour chaque brique, tester la collision
                    // stocker dans une liste les briques impactées
                    // après la boucle for each des briques, supprimer les briques impactées
                    // parce qu'on ne peut pas supprimer un élément d'une liste alors qu'on la parcoure

                 ArrayList<Briques>listeBriquesImpact = new ArrayList<>();

                    for (Briques briques : listeBrique){
                        briques.collision(balle);
                        if(briques.collision(balle)){
                            listeBriquesImpact.add(briques);
                            balle.setVitesseVerticale(-balle.getVitesseVerticale());
                        }
                    }

                    for (Briques briques : listeBriquesImpact){
                        listeBrique.remove(briques);
                    }

                    // si la balle touche la barre
                    if (barre.collision(balle)) {
                        balle.setVitesseVerticale(-balle.getVitesseVerticale());
                    }
                }
                dessin.dispose(); // pour dire que le dessin est fini
                this.getBufferStrategy().show(); // permet d'afficher l'image

                Thread.sleep(1000 / 60); // rafraichissement de la page une fois toutes les 60 secondes
            } catch (InterruptedException e) { //try catch sert à gérer les exceptions
                System.out.println("Processus arrêté");
            }
        }
    }

    public static void main(String[] args) { // on fusionne avec la classe principale

        new CasseBrique();

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 37) { // quand la touche gauche est enfoncée

            barre.deplacerGauche();

        } else if (e.getKeyCode() == 39) {

            barre.deplacerDroite();
        }
        }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}



