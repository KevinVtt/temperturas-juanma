import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Estacionamiento{
    private boolean[] lugares;
    private int[] contadorDeLugares;
    private int[] contadorDeLugaresDesocupados;
    private int cantidadDeLugares;
    private int[] vecesOcupadas;
    private int[] vecesDesocupadas;

    public Estacionamiento(int cantidadDeLugares) {
        if (cantidadDeLugares <= 0) {
            throw new Error("El número de lugares debe ser positivo.");
        }
        this.lugares = new boolean[cantidadDeLugares];
        this.contadorDeLugares = new int[cantidadDeLugares];
        this.vecesDesocupadas = new int[cantidadDeLugares];
        this.vecesOcupadas = new int[cantidadDeLugares];
        this.contadorDeLugaresDesocupados = new int[cantidadDeLugares];
    }

    public boolean ocuparLugar(int lugar) {
        if (lugar < 0 || lugar >= lugares.length) {
            throw new Error("Número de lugar inválido.");
        }
        if (lugares[lugar]) {
            return false; // El lugar ya está ocupado
        }
        lugares[lugar] = true; // Ocupa el lugar
        contadorDeLugares[lugar]++;
        vecesOcupadas[lugar]++;
        return true; // Éxito
    }

    public boolean desocuparLugar(int lugar) {
        if (lugar < 0  || lugar >= lugares.length) {
            throw new Error("Número de lugar inválido.");
        }

        if (!lugares[lugar]) {
            return false; // El lugar ya está libre
        }

        lugares[lugar] = false; // Libera el lugar
        vecesDesocupadas[lugar]++;
        contadorDeLugaresDesocupados[lugar]++;
        return true; // Éxito
    }

    public double calcularPorcentajeOcupado() {
        int ocupados = 0;
        for (boolean lugar : lugares) {
            if (lugar) { // Si el lugar está ocupado
                ocupados++;
            }
        }
        return (double) ocupados / lugares.length * 100;
    }

    public void cantidadVecesOcupadasYDesocupadas(int lugar){

        System.out.println("====================================================================");
        System.out.println("La cantidad de veces ocupadas en el lugar: " + lugar + " es de " + this.vecesOcupadas[lugar]);
        System.out.println("La cantidad de veces desocupadas en el lugar: " + lugar + " es de " + this.vecesDesocupadas[lugar]);
        System.out.println("====================================================================");
    }

    public static void main(String[] args) {

        // Crear el estacionamiento
        Estacionamiento parking = new Estacionamiento(10);
        Random r = new Random();
        System.out.println("====================================================================");
        // Ocupar lugares
//        System.out.println("Lugar ocupado: " + parking.ocuparLugar(3));
//        System.out.println("Lugar desocupado:  " + parking.desocuparLugar(3));
//        System.out.println("Lugar ocupado: " + parking.ocuparLugar(3));
//        System.out.println("Lugar desocupado:  " + parking.desocuparLugar(3));
//        System.out.println("Lugar ocupado:  " + parking.ocuparLugar(3));
//        System.out.println("Lugar desocupado:  " + parking.desocuparLugar(3));
//        System.out.println("Lugar ocupado:  " + parking.ocuparLugar(3));
//        System.out.println("Lugar desocupado:  " + parking.desocuparLugar(3));
//        System.out.println("Lugar ocupado:  " + parking.ocuparLugar(3));

        for(int i = 0; i < 50; i++){
            int randomNumber1 = ThreadLocalRandom.current().nextInt(0, 10); // 1 (incluido) a 10 (incluido)
            int randomNumber2 = ThreadLocalRandom.current().nextInt(0, 10); // 1 (incluido) a 10 (incluido)
            parking.ocuparLugar(randomNumber1);
            parking.desocuparLugar(randomNumber2);
        }

        // Mostrar el porcentaje de ocupación
        System.out.println("====================================================================");
        System.out.println("Porcentaje de ocupación: " + parking.calcularPorcentajeOcupado() + "%");
        System.out.println("====================================================================");
        System.out.println("LUGARES OCUPADOS!! ");
        for (Integer i : parking.contadorDeLugares) {
            System.out.print(i + " ");
        }
        System.out.println("\n====================================================================");

        System.out.println("LUGARES DESOCUPADOS!! ");
        for (Integer i : parking.contadorDeLugaresDesocupados) {
            System.out.print(i + " ");
        }
        System.out.println("\n====================================================================");


        System.out.println();
        // Mostrar veces ocupadas y desocupadas

        parking.cantidadVecesOcupadasYDesocupadas(3);


    }

}