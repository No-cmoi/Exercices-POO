import java.util.ArrayList;

public class ListeDeCourses {

    private ArrayList<Articles> listeArticles;

    public ListeDeCourses() {
        this.listeArticles = new ArrayList<>();
    }

    public ArrayList<Articles> getListeArticles() {
        return listeArticles;
    }

    public void ajouterArticle(Articles articles) {
        this.listeArticles.add(articles);
    }

    public void afficherListe() {
        for (Articles articles : this.listeArticles) {
            System.out.println("article : " + articles.getNom());
            System.out.println("prix unitaire : " + articles.getPrixUnitaire());
            System.out.println("quantité : " + articles.getQuantite());
            System.out.println("taux de TVA : " + articles.getTVA());
            System.out.println();
        }
    }

    public double calculTotal() {
        double total = 0;
        for (Articles articles : this.listeArticles) {
            total += (articles.getPrixUnitaire() * (articles.getTVA() / 100) + articles.getPrixUnitaire()) * articles.getQuantite();

        }
        return (total);
    }

    public void retirerArticle(String nom) {
        listeArticles.removeIf(articles -> articles.getNom().equals(nom));
    }



    public void setListeArticles(ArrayList<Articles> listeArticles) {
        this.listeArticles = listeArticles;
    }

    public ListeDeCourses(ArrayList<Articles> listeArticles) {
        this.listeArticles = listeArticles;
    }

}
