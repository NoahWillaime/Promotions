package enseignant;

import enseignant.Enseignant;

import java.util.ArrayList;
import java.util.Iterator;

public class Matiere implements Iterable<Enseignant>{
    private String nom;
    private ArrayList<Enseignant> enseignants;

    public Matiere(String nom){
        this.nom = nom;
        this.enseignants = new ArrayList<Enseignant>();
    }

    public void addEnseignant(Enseignant enseignant){
        this.enseignants.add(enseignant);
    }

    public void addEnseignants(ArrayList<Enseignant> enseignants){
        this.enseignants.addAll(enseignants);
    }

    public String getNom(){
        return nom;
    }

    @Override
    public Iterator<Enseignant> iterator() {
        return enseignants.iterator();
    }
}
