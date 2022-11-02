package exoJava;

import java.util.ArrayList;

public class Enfant {
    private String prenom;
    public int classement;
    private ArrayList<Professeur> professeur = new ArrayList<>(); //appler la classe Professeur.java ArrayList faire une liste


    //----------------CONSTRUCTEUR
    public Enfant(String prenom, int classement) {
        this.prenom = prenom;
        this.classement = classement;
    }
    //-----------------METHODES
    public void prof(Professeur Prof){
        System.out.println(this.prenom + " est l'éléve de " + Prof.getPrenomProf());
        this.professeur.add(Prof); //ajouter dans la liste existante
    }
    //---------------GETTER ET SETTER
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getClassement() {
        return classement;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }

    public ArrayList<Professeur> getProfesseur() {
        return professeur;
    }
    public Professeur getProfesseur2(int i) {
        return this.professeur.get(i);
    }

    public void setProfesseur(ArrayList<Professeur> professeur) {
        this.professeur = professeur;
    }
}
