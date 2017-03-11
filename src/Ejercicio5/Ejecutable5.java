package Ejercicio5;
import becker.robots.*;

public class Ejecutable5 {
    



    public static void main(String[] args){
        City map = new City(11,11);
        Escenario l = new Escenario(map);
        Alfa lol = new Alfa(map);
        lol.recorrer(map);
    }
}
