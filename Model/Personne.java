package Model;

import java.util.Date;

/**
 * Created by D.Hamel on 25.03.17.
 */
public class Personne {

    private int noAVS;
    private String prenom;
    private String nom;
    private String adresse;
    private String email;
    private String telephone;
    private Date dateNaissance;
    private int responsable;
    private String statut;
    private double salaire;
    private Date dateDebut;
    private String typeContrat;

    /**
     * Constructeur par défaut
     */
    public Personne() {
    }

    /**
     * Constructeur avec tous les paramètre
     *
     */
    public Personne(int noAVS, String prenom, String nom, String adresse, String email,
                    String telephone, Date dateNaissance, int responsable, String statut,
                    double salaire, Date dateDebut, String typeContrat) {
        this.noAVS = noAVS;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
        this.responsable = responsable;
        this.statut = statut;
        this.salaire = salaire;
        this.dateDebut = dateDebut;
        this.typeContrat = typeContrat;
    }

    /**
     * Constructeur avec unqiuement les noms prenoms
     * @param prenom
     * @param nom
     */
    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String toString() {
        return this.prenom + " " + this.nom + "\n" + this.adresse + "\n" + this.dateNaissance;
    }
    public int getNoAVS() {
        return noAVS;
    }

    public void setNoAVS(int noAVS) {
        this.noAVS = noAVS;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }
}
