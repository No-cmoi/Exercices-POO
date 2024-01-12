import java.util.ArrayList;

public class GestionnaireContacts {

    private ArrayList<Contact> listeContacts;

    public GestionnaireContacts() {
        this.listeContacts = new ArrayList<>();
    }

    public GestionnaireContacts(ArrayList<Contact> listeContacts) {
        this.listeContacts = listeContacts;
    }

    // ajouter un contact :
    public void ajouterContact(Contact contact) {
        this.listeContacts.add(contact);
    }

    // Afficher un contact :
    public void afficherContacts() {
        for (Contact contact : this.listeContacts) {
            System.out.println(contact.getNom());
            System.out.println(contact.getPrenom());
            System.out.println(contact.getNumeroTelephone());
            System.out.println(contact.getAdresseEmail());
            System.out.println();
    }
}
        // mise à jour d'un contact :
        public void mettreAJourContact(String nom, String prenom, String adresseEmail){
            for (Contact contact : this.listeContacts){
                if(contact.getNom().equals(nom) && (contact.getPrenom().equals(prenom))){
                    contact.setAdresseEmail(adresseEmail);
                }
            }
        }

        // Recherche d'un contact :
        public Contact chercherContact(String nom, String prenom){
            for (Contact contact : this.listeContacts){
                if(contact.getNom().equals(nom) && (contact.getPrenom().equals(prenom))){
                    return contact;
                }
            }
            return null;
        }

        // Suppression d'un contact :
        public void supprimerContact(String nom, String prenom) {
            listeContacts.removeIf(contact -> contact.getNom().equals(nom) && contact.getPrenom().equals(prenom));


        }
}

