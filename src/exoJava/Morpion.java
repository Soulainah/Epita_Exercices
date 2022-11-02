package exoJava;
import java.util.Scanner;

public class Morpion {
    public static void main(String[] args){
        int[][] Grille = {{0, 0, 0},{0, 0, 0},{0, 0, 0}};

        int i = 0;

        while(i < 3){ //boucle avec une fin, le 3 veut dire jouer 3 fois
            Jouer(Grille, 1); // le 1 c'est ce qu'on veut afficher dans le tableau
            Jouer(Grille, 2);

            i++;
        }
    }
    public static void affichageGrille(int[][] Tableau){ //methode affichageGrille
        for ( int i = 0; i < Tableau.length; i ++ ){

            for ( int j = 0; j < Tableau[i].length; j ++ ){

                System.out.print(Tableau[i][j] + " ");
            }
            System.out.println();
        }
    } //Fin methode affichageGrille

    public static void Jouer(int[][] Tableau, int valeur) { //Methode Jouer
        Scanner saisieUtilisateur = new Scanner(System.in); //appel l'objet scanner
        int i = 0;
        int j = 0;
        String RetourX = "";
        String RetourY = "";
        while (i < 3){
            System.out.println("Veuillez saisir X :");
            RetourX = saisieUtilisateur.next(); //attends la saisie dans le terminal
            System.out.println("Veuillez saisir Y :");
            RetourY = saisieUtilisateur.next(); //attends la saisie dans le terminal
        }
        i = Integer.valueOf(RetourX) - 1; // -1 car on commence l'indice a 1 au lieu de 0
        j = Integer.valueOf(RetourY) - 1;
        noEcrase(Tableau, i, j);
        Tableau [i][j] = valeur; //push la valeur dans le tableau

        affichageGrille(Tableau);
    } //Fin methode Jouer

    public static boolean noEcrase(int[][] Tableau, int i, int j){
        if (Tableau [i][j] == 0){
            return true;
        }
        return false;
    }
}

