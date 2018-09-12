import enseignant.Enseignant;
import enseignant.Externe;
import enseignant.Interne;
import enseignant.Matiere;
import etudiant.Etudiant;

public class test {
    public static void main(String args[]){
        Promotion promo = new Promotion("2012-2013");
        //
        Matiere m1 = new Matiere("Info");
        Matiere m2 = new Matiere("Math");
        //
        Etudiant e1 = new Etudiant("Julien Micheletti", 20);
        Etudiant e2 = new Etudiant("Noah Willaime", 21);
        Etudiant e3 = new Etudiant("Elliot This", 22);
        //
        Enseignant en1 = new Externe("Jean Levy", 200, m1);
        Enseignant en2 = new Interne("Martine Bedos", 200, m2);
        //
        promo.addMatiere(m1);
        promo.addMatiere(m2);
        promo.addEtudiant(e1);
        promo.addEtudiant(e2);
        promo.addEtudiant(e3);
        promo.addEnseignant(en1);
        promo.addEnseignant(en2);
        //
        System.out.println("\n-----------TEST------------\n");
        System.out.println(promo.toString());
        System.out.println("\n-----------TEST------------\n");
        System.out.println(promo.toStringMatieres());
        System.out.println("\n-----------TEST------------\n");
        System.out.println(promo.toStringMatiere("Info"));
        System.out.println("\n-----------TEST------------\n");
        System.out.println(promo.toStringMatiere("Math"));
    }
}
