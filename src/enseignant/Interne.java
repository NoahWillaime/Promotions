package enseignant;

public class Interne extends Enseignant {

    public Interne(String nom, int heure, Matiere matiere) {
        super(nom, heure, matiere);
        this.salaire = 30 * getHeure();
    }
}
