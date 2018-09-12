package enseignant;

public class Externe extends Enseignant{
    public Externe(String nom, int heure, Matiere matiere) {
        super(nom, heure, matiere);
        this.salaire = 60 * getHeure();
    }
}
