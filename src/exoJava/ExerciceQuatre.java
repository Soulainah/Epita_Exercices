package exoJava;
//LES TABLEAUX ET METHODE EXTERNE
public class ExerciceQuatre {
    public static void main(String[] args){
        int numeroUn = 10, numeroDeux = 20;
        float resultat[] = calcule(numeroUn,numeroDeux);
        ExerciceTrois.affichage(resultat); //Methode appelé dans une autre classe externe
    }
    public static float[] calcule(int a, int b){
        float addition = a + b, soustraction = a - b, multiplication = a * b, division = a / b;
        return new float[] {addition, soustraction, multiplication, division};
    }
}
