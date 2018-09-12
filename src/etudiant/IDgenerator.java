package etudiant;

public class IDgenerator {
    private int ID;
    private static IDgenerator instance = new IDgenerator();

    private IDgenerator(){
        ID = 0;
    }

    public static IDgenerator getInstance(){
        return instance;
    }

    public int getID(){
        int oldID = ID;
        ID++;
        return oldID;
    }
}
