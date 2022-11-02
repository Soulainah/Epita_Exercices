package exoJava;

public class ExerciceDeux {
    public static void main(String[] args) { //toujours mettre cette fonction pour afficher l'execution (ne pas oublier le tavleau des arguments)

        int ageGarcon = 40;
        float divisionParTrois = ageGarcon / 3f;
        int resTrois = (int) ageGarcon/3; //transformer un foat en int (c'est a dire un nombre a virgule en entier)
        float divisionParSept = ageGarcon / 7f;
        int ageFille = 25;

        if (ageGarcon < ageFille) {
            System.out.println("le plus petit est " + ageGarcon);
        } else {
            System.out.println("le plus petit est " + ageFille);
        }

        if (divisionParTrois == (resTrois)) {
            System.out.println(divisionParTrois);
        } else if (divisionParSept == ((int) divisionParSept)) { //else if doit etre mit pour eviter les cascades des if(en gros on ne sort pas du if)
            System.out.println(divisionParSept);
        } else if ((ageGarcon % 5) == 0) {
            System.out.println("divisible par 5");
        }

    }
}
