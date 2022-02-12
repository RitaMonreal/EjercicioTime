package uaslp.objetos.parcial1.time;//En que paquete está ubicado nuestro archivo

public class Time {
    //Declaración de variables
    private int hour;
    private int minute;
    private int second;
    //Constructor
    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

   /*Getters ¿son necesario para este código?
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }*/

    //Métodos
    public void addHour(int delta){
        //Las horas van de 0 a 23
        hour += delta;//hour = hour + delta

        if(hour < 0){//Si es menor de 0 (No existen horas negativas)
            while(hour < 0){
                hour = hour + 24;
            }
        }
        else{
            while(hour > 23){//Si la suma es mayor de 23 la hora que se inserte
                hour = hour - 24;//Se le restan las 24 horas y se queda con el valor real y correcto
                System.out.println("It's already the next day");
            }
        }
    }

    public void addMinute(int delta){
        //Los minutos van de 0 a 59
        minute += delta;//minute = minute + delta

        if(minute < 0){//Si es menor de 0 (o sea que no existe tiempo negativo)
            while(minute < 0){
                minute = minute + 60;
            }
        }
        else{//Si es mayor de 0 (sí existe este tiempo)
            while(minute > 59){//(Pero es mayor de 59)
                minute = minute - 60;
                System.out.println("It's a new time");
            }
        }
    }

    public void addSecond(int delta){
        //Los segundos de 0 a 59
        second += delta;//second = second + delta

        if(second < 0){//Si es menor de 0 (o sea que no existe tiempo negativo)
            while(second < 0){
                second = second + 60;
            }
        }
        else{//Si es mayor de 0 (sí existe este tiempo)
            while(second > 59){//(Pero es mayor de 59)
                second = second - 60;
                System.out.println("It's a new minute");
            }
        }
    }

    public String toString(){
        return  String.format("%02d:%02d:%02d",hour, minute,second);
    }
}
