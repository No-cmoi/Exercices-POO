import java.util.ArrayList;
public class Articles {

    private String nom;
    private Double prixUnitaire;
    private int quantite;
    private Double TVA;

    public Articles(String nom, Double prixUnitaire, int quantite) {
        this(nom, prixUnitaire, quantite, 20.0);
    }

    public Articles(String nom, Double prixUnitaire, int quantite, Double TVA) {
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
        this.TVA = TVA;
    }

    public void calculTVA(Double prixUnitaire, Double TVA){
        Double prixTTC = this.prixUnitaire * this.TVA;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Double getTVA() {
        return TVA;
    }

    public void setTVA() {
        this.TVA = TVA;


    }
}
