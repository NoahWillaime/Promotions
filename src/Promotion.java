import enseignant.Enseignant;
import enseignant.Matiere;
import etudiant.Etudiant;

import java.util.ArrayList;

public class Promotion {
    private String nom;
    private String annee;
    private ArrayList<Etudiant> etudiants;
    private ArrayList<Enseignant> enseignants;
    private ArrayList<Matiere> matieres;

    public Promotion(String annee){
        this.nom = "Master 1";
        this.annee = annee;
        this.etudiants = new ArrayList<Etudiant>();
        this.enseignants = new ArrayList<Enseignant>();
        this.matieres = new ArrayList<Matiere>();
    }

    public void addEtudiant(Etudiant etudiant){
        this.etudiants.add(etudiant);
    }

    public void addEtudiants(ArrayList<Etudiant> etudiants){
        this.etudiants.addAll(etudiants);
    }

    public void addEnseignant(Enseignant enseignant){
        this.enseignants.add(enseignant);
    }

    public void addEnseignants(ArrayList<Enseignant> enseignants){
        this.enseignants.addAll(enseignants);
    }

    public void addMatiere(Matiere matiere){
        this.matieres.add(matiere);
    }

    public void addMatieres(ArrayList<Matiere> matieres){
        this.matieres.addAll(matieres);
    }

    public String getNom(){
        return nom;
    }

    public String getAnnee(){
        return annee;
    }

    public String toStringMatiere(String matiere){
        StringBuilder sb = new StringBuilder("");
        sb.append("Matiere : "+matiere+"\n");
        sb.append("Les intervenants en "+matiere+" :\n");
        for (Matiere m : matieres){
            if (m.getNom().equals(matiere)){
                for (Enseignant e : m){
                    sb.append("\t"+e.toString()+"\n");
                }
            }
        }
        return sb.toString();
    }

    public String toStringMatieres(){
        StringBuilder sb = new StringBuilder("");
        sb.append("Promo ");
        sb.append(getNom()+" ");
        sb.append(getAnnee()+"\n");
        for (Matiere m : matieres){
            sb.append("Les intervenants en "+m.getNom()+" : \n");
            for (Enseignant e : m){
                sb.append("\t"+e.toString()+"\n");
            }
        }
        return sb.toString();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("");
        sb.append("Promo ");
        sb.append(getNom()+" ");
        sb.append(getAnnee()+"\n");
        sb.append("Les etudiants :\n");
        for (Etudiant e : etudiants){
            sb.append("\tEtudiant "+e.toString()+"\n");
        }
        sb.append("Les intervenants :\n");
        for (Enseignant en : enseignants){
            sb.append("\t"+en.toString()+"\n");
        }
        return sb.toString();
    }
}
