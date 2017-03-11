import becker.robots.*;

public class Ejecutable3 {

    public static void main(String[] args) {
        City gotham = new City(7, 21);
        Ejercicio3[] Write = {new Ejercicio3(1, 'H', gotham), new Ejercicio3(2, 'E', gotham), new Ejercicio3(3, 'L', gotham), 
                          new Ejercicio3(4, 'L', gotham), new Ejercicio3(5, 'O', gotham)};
        for(int i=0;i<5;i++)
            Write[i].Dibujar();
    }
}

