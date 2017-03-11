

import becker.robots.*;
import java.util.Scanner;

public class Ejecutable2 {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
        int[] usuario = new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Digito #"+(i+1)+": ");
            usuario[i] = Leer.nextInt();
        }
        Cuartos2 gotham = new Cuartos2(usuario[0], usuario[1], usuario[2]); 
        
          int[] x = new int[3];
        for(int i=0;i<3;i++){
            gotham.In();
            x [i]=Bool2.toInt(gotham.movimiento());
            gotham.getOut();
            if(i!=2)
                gotham.Next();
        }
            
        System.out.println("El numero es "+x[0]+x[1]+x[2]);
    }
}

