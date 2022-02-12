package uaslp.objetos.parcial1.time;//En que paquete está ubicado nuestro archivo

public class EjercicioTime {

    public static void main(String[] args) {
        //Prueba con tiempo aceptable
        System.out.println("\n <<Local time, example 1>>");
        Time time = new Time(10,45,23);
        System.out.println(time.toString());
        time.addHour(2);
        time.addMinute(10);
        time.addSecond(23);
        System.out.println("\n<<Modified clock time, example 1>>");
        System.out.println(time.toString());

        //Prueba con tiempos que sobrepasan lo normal
        System.out.println("\n <<Local time, example 2>>");
        Time time2 = new Time(24,73,23);
        System.out.println(time2.toString());
        time2.addHour(5);
        time2.addMinute(10);
        time2.addSecond(100);
        System.out.println("\n<<Modified clock time, example 2>>");
        System.out.println(time2.toString());
    }
}
