package exoJava;

public class ExerciceUn {
    public static void main(String[] args) { //toujours mettre cette fonction pour afficher l'execution (ne pas oublier le tavleau des arguments)

            String a;
            String b;
            int c;
            int d;
            a = "Hello";
            b = "ca va ?";
            c = 10;
            d = 50;
            //System.out.println(a + " " + b);
            String nombre = Integer.toString(c); //convertir un Int en String
            String nombreDeux = Integer.toString(d);
            System.out.println(nombre + "," + nombreDeux); //Ne pas oublier de concatener pour afficher 2 variables
    }

}
