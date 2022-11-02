package exoJava;
//LES TABLEAUX ET METHODE
public class ExerciceTrois {
    public static void main(String[] args) { //toujours mettre cette fonction pour afficher l'execution (ne pas oublier le tavleau des arguments)
        String[] Fruit = {"Pomme", "Kiwi", "Banane"};
        String[][] FruitCouleur = {{"Pomme", "Rouge"},{"Kiwi", "Marron"},{"Banane", "Jaune"}};
        if (exerciceMethode(FruitCouleur)){
            System.out.println("C'est bon !");
        }else {
            System.out.println("Non pas bon !");
        }
        /*System.out.println(Fruit[0] + ","); //println = retour à la ligne
        System.out.print(Fruit[1] + ","); //print = sur la meme ligne
        System.out.println(Fruit[2]);
        System.out.println(" ");*/
    }

    public static void affichage(float[] TableauUn){
        for ( int i = 0; i < TableauUn.length; i ++ ){
            System.out.println(TableauUn[i]);
            System.out.println(" ");
        }
    }

    public static boolean exerciceMethode(String[][] Tableau){
        System.out.println("Helloooooo !!");
        for ( int i = 0; i < Tableau.length; i ++ ){

            for ( int j = 0; j < Tableau[i].length; j ++ ){

                System.out.print(Tableau[i][j] + " ");
            }
            System.out.println();
        }
        return(true);
    }
}