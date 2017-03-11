package Ejercicio6;

import becker.robots.*;

public class Ejecutable6 {
    


    public static void main(String[] args){
        City map = new City(12,13);
        Escenario e = new Escenario(map);
        Alfa lol = new Alfa(map);
        lol.recoger();
        
    }
}
