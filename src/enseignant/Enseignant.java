package enseignant;

public abstract class Enseignant {
    protected String nom;
    protected int heure;
    protected float salaire;
    protected Matiere matiere;

    public Enseignant(String nom, int heure, Matiere matiere){
        this.nom = nom;
        this.heure = heure;
        this.salaire = 0;
        matiere.addEnseignant(this);
        this.matiere = matiere;

    }

    public String getNom(){
        return nom;
    }

    public float getSalaire(){
        return salaire;
    }

    public int getHeure(){
        return heure;
    }

    public String getMatiere(){
        return matiere.getNom();
    }

    public String toString(){
        return getNom()+" en "+getMatiere()+" , salaire = "+getSalaire();
    }
}
