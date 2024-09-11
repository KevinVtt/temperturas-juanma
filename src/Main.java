public class Main {
    public static void main(String[] args) {
        PronosticoSemanal ps = new PronosticoSemanal();

        double[] arrayDouble = ps.getTemperaturas();

        System.out.println("============== Cambiamos la temperatura ==============");
        ps.pronosticarTemperatura(1,3d);
        ps.pronosticarTemperatura(2,30d);
        ps.pronosticarTemperatura(3,22d);
        ps.pronosticarTemperatura(4,10d);
        ps.pronosticarTemperatura(5,35d);
        ps.pronosticarTemperatura(6,5d);
        ps.pronosticarTemperatura(7,-1d);

        for(int i = 0; i < ps.getTemperaturas().length; i++){
            System.out.print(arrayDouble[i] + " ");
        }
        System.out.println();
        System.out.println("============== Obtener Temperatura ==============");
        System.out.println(ps.obtenerTemperatura(2));


        System.out.println("============== Calcular promedio temperaturas ==============");
        System.out.println("El promedio de las temperaturas es: " + ps.calcularPromedioDeTemperaturas());

        System.out.println("============== Maximo de temperaturas ==============");

        System.out.println("============== Maximo de temperaturas ==============");
        System.out.println("El maximo de temperatura del dia es: " + ps.buscarDiaDeMaximaTemperatura());
        System.out.println("El maximo de temperaturas es: " + ps.buscarMaximaTemperatura());
        System.out.println("============== Minimo de temperaturas ==============");
        System.out.println("El minimo de temperaturas es: " + ps.buscarMinimaTemperatura());
    }
}