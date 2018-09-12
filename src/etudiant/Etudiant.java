package etudiant;

public class Etudiant {
    private String nom_etudiant;
    private int age_etudiant;
    private int ID;

    public Etudiant(String name, int age){
        this.nom_etudiant = name;
        this.age_etudiant = age;
        this.ID = IDgenerator.getInstance().getID();
    }

    public String getName() {
        return nom_etudiant;
    }

    public int getAge(){
        return age_etudiant;
    }

    public int getID(){
        return ID;
    }

    public String toString(){
        return getName()+" (noEt="+getID()+") "+getAge()+" ans";
    }

}
