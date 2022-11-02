package exoJava3;

public class DessinRectangle {
    public void dessiner(int longueur, int largeur){
        int i;
        for (i=1; i <= largeur; i++){
            for (int j=1; j <= longueur; j++){
                System.out.print("0");
            }
            System.out.println(); //pour aller à la ligne
        }
    }

    public static void main (String[] arg){

        DessinRectangle dessin = new DessinRectangle(); //j'instancie l'objet a partir de la classe
        dessin.dessiner(5,3);
    }
}
