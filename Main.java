public class Main {
    public static void main(String[] args) {
       PuertasCoche miCoche = new PuertasCoche(4);
       miCoche.addPuerta();
       System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }
 }
 