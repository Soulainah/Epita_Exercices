package exoJava;

public class ExerciceObjet {
    public static void main(String[] args){
        Enfant John = new Enfant("John", 2);
        Enfant Marie = new Enfant("Marie", 10);
        Enfant Claire = new Enfant("Claire", 15);
        Enfant Marc = new Enfant("Marc", 5);
        Enfant Alex = new Enfant("Alex", 19);

        Professeur Berganotte = new Professeur("Alice");
        Professeur Berganotte1 = new Professeur("Kevin");
        Professeur Berganotte2 = new Professeur("Nicolas");
        Professeur Berganotte3 = new Professeur("Jerome");

        Alex.prof(Berganotte); Alex.prof(Berganotte1); Alex.prof(Berganotte2); Alex.prof(Berganotte3);
        Berganotte.setPrenomProf("Marc"); //pour changer on utilise le .set
        for (int i = 0; i < Alex.getProfesseur().size(); i++ ){
            System.out.println(Alex.getProfesseur2(i).getPrenomProf());
        }
    }

}
