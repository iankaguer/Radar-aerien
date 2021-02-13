public class Vol extends Thread{
    Avion avion;
    String destination, origine;
    Aeroport aeroportDest;

    public Vol(Avion avion, String origine, String destination){
        this.avion = avion;
        this.origine = origine;
        this.destination = destination;

    }

    @Override
    public void run() {
        for (int i=0; i<Utils.BASES.size(); i++){
             if (Utils.BASES.get(i).identifiant == destination){
                 aeroportDest = Utils.BASES.get(i);
             }
        }

        while (!avion.auSol && (avion.abcisse!=aeroportDest.getAbcisse() && avion.ordonne != aeroportDest.getOrdonne())) {
            System.out.println(avion.abcisse+", "+avion.ordonne);
        }
    }
}
