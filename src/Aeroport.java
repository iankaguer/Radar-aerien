import java.util.Queue;

public class Aeroport {
    String identifiant;
    int abcisse, ordonne;
    Queue<Avion> nbAvion;

    public Aeroport(String id, int abc, int ord){
        this.identifiant = id;
        this.abcisse = abc;
        this.ordonne = ord;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public int getAbcisse() {
        return abcisse;
    }

    public void setAbcisse(int abcisse) {
        this.abcisse = abcisse;
    }

    public int getOrdonne() {
        return ordonne;
    }

    public void setOrdonne(int ordonne) {
        this.ordonne = ordonne;
    }

    public Queue<Avion> getNbAvion() {
        return nbAvion;
    }

    public void setNbAvion(Queue<Avion> nbAvion) {
        this.nbAvion = nbAvion;
    }
}
