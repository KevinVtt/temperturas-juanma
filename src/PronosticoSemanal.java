/**
 * Clase representa el pronósticos de temperaturas para la próxima semana.
 */
public class PronosticoSemanal {

    private double[] temperaturas;

    public double[] getTemperaturas() {
        return temperaturas;
    }

    /**
     * post: deja inicializadas las temperaturas del pronóstico en 25 ºC.
     */
    public PronosticoSemanal() {
        temperaturas = new double[7];
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = 25.0;
        }
    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7,
     *       siendo 1 lunes y 7 domingo.
     * post: devuelve la temperatura pronosticada para el día indicado.
     */
    public double obtenerTemperatura(int dia) {

        double temperaturaDelDia = 0;

        for(int i = 0; i < temperaturas.length; i++){
            if(i == dia-1){
                temperaturaDelDia = temperaturas[i];
            }
        }

        return temperaturaDelDia;

//        return temperaturas[dia-1];

    }

    /**
     * pre : recibe el número de día de la semana comprendido entre 1 y 7,
     *       siendo 1 lunes y 7 domingo.
     * post: cambia la temperatura pronosticada para el día indicado.
     */
    public void pronosticarTemperatura(int dia, double temperatura) {
            // indice; 0 < 7; i = i + 2

//        int indice = 0;
//        while(indice < temperaturas.length){
//            if(indice == dia){
//                temperaturas[indice] = temperatura;
//            }
//            indice++;
//        }

        for(int i = 0; i < temperaturas.length; i++){
            if(i == dia-1){
                temperaturas[i] = temperatura;
            }
        }


//        temperaturas[dia-1] = temperatura;

    }


    /**
     * post: devuelve el promedio de las temperaturas pronosticadas.
     */
    public double calcularPromedioDeTemperaturas() {

        double contador = 0;

        for(int i = 0; i < temperaturas.length; i++){
            contador += temperaturas[i];
        }

        return contador / temperaturas.length;
    }

    /**
     * post: devuelve la máxima temperatura pronosticada.
     */
    public double buscarMaximaTemperatura() {

        double maximo = temperaturas[0];

        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i] > maximo){
                maximo = temperaturas[i];
            }
        }

        return maximo;
    }


    /**
     * post: devuelve el día de máxima temperatura pronosticada. (Para intrépidos: En caso de repetirse, devolver todos.)
     */
    public int buscarDiaDeMaximaTemperatura() {

        int dia = 0;
        double maximo = temperaturas[0];
        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i] > maximo){
                maximo = temperaturas[i];
                dia = i;
            }
        }

        return dia+1;
    }


    /**
     * post: devuelve la mínima temperatura pronosticada.
     */
    public double buscarMinimaTemperatura() {

        double minimo = temperaturas[0];

        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i] < minimo){
                minimo = temperaturas[i];
            }
        }

        return minimo;

    }


}
