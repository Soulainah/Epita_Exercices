public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        double resultat = app.division(3,2);
        System.out.println("le resultat est :" + resultat);
    }

    public double division(int numerateur, int denominateur){
        double resultat = 0;
        if( denominateur == 0){
            System.out.println("division impossible, denominateur = 0");
        } else {
            resultat = numerateur / denominateur;
        }
        return resultat;
    }

}