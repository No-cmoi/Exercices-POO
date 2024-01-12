public class TestListeDeCourses {
    public static void main(String[] args) {

        ListeDeCourses listeDeCourses = new ListeDeCourses();

        // Ajout d'articles avec et sans TVA spécifiée :
        listeDeCourses.ajouterArticle(new Articles("Pommes", 1.50, 5, 5.5));
        listeDeCourses.ajouterArticle(new Articles("Chocolat", 1.00, 2));
        listeDeCourses.ajouterArticle(new Articles("Lait", 0.90, 3, 5.5));

        // Affichage de la liste :
        System.out.println("Liste de courses après ajout :");
        listeDeCourses.afficherListe();

        // Calcul du coût total avec TVA :
        double total = listeDeCourses.calculTotal();
        System.out.println("Coût total (TVA incluse) : " + total + "€");
        System.out.println();

        // Retirer un article :
        listeDeCourses.retirerArticle("Pain");

        // Affichage final de la liste :
        System.out.println("Liste de courses après suppression :");
        listeDeCourses.afficherListe();

    }
}
