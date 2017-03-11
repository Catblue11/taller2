
package Ejercicio5;



    
import becker.robots.*;
import java.awt.Color;

public class Escenario {
    City es;
    Wall[] block = new Wall[56];
    Thing[] t = new Thing[3];
    Thing casa;
    
    
    
    
    public Escenario(City c){
        es = c;
        //Paredes 
        int i;
        for( i=0;i<4;i++){
            block[i] = new Wall(es, 1, i+3, Direction.NORTH);
        }

        block[i] = new Wall(es, 1, i+2, Direction.EAST);i++;
        block[i] = new Wall(es, 1, 3, Direction.WEST);i++;
        block[i] = new Wall(es, 2, 3, Direction.WEST);i++;
        block[i] = new Wall(es, 2, 7, Direction.NORTH);i++;
        block[i] = new Wall(es, 2, 7, Direction.EAST);i++;    
        block[i] = new Wall(es, 3, 8, Direction.NORTH);i++;    

        for(int k=0 ;k<3;k++){
            block[i] = new Wall(es, k+3, 8, Direction.EAST);
            i++;
        }
        block[i] = new Wall(es, 5, 8, Direction.SOUTH);i++;    
        block[i] = new Wall(es, 6, 7, Direction.EAST);i++;    
        block[i] = new Wall(es, 6, 7, Direction.SOUTH);i++;    
        for(int k=0 ;k<2;k++){
            block[i] = new Wall(es, k+5, 7, Direction.WEST);
            i++;
        }
        block[i] = new Wall(es, 5, 7, Direction.NORTH);i++;    
        block[i] = new Wall(es, 5, 6, Direction.NORTH);i++;    
        block[i] = new Wall(es, 4, 7, Direction.NORTH);i++;    
        block[i] = new Wall(es, 3, 7, Direction.WEST);i++;
        block[i] = new Wall(es, 3, 6, Direction.NORTH);i++;    
        block[i] = new Wall(es, 2, 5, Direction.EAST);i++;
        block[i] = new Wall(es, 2, 5, Direction.NORTH);i++;    
        block[i] = new Wall(es, 2, 4, Direction.NORTH);i++;
        for(int k=0 ;k<2;k++){
            block[i] = new Wall(es, k+2, 4, Direction.WEST);
            i++;
        }
        block[i] = new Wall(es, 3, 2, Direction.NORTH);i++;
        block[i] = new Wall(es, 5, 2, Direction.NORTH);i++;
        block[i] = new Wall(es, 4, 3, Direction.NORTH);i++;
        block[i] = new Wall(es, 4, 5, Direction.NORTH);i++;
        block[i] = new Wall(es, 5, 4, Direction.NORTH);i++;
        block[i] = new Wall(es, 4, 1, Direction.NORTH);i++;
        block[i] = new Wall(es, 5, 1, Direction.SOUTH);i++;
        block[i] = new Wall(es, 6, 2, Direction.SOUTH);i++;
        block[i] = new Wall(es, 6, 3, Direction.SOUTH);i++;
        block[i] = new Wall(es, 5, 5, Direction.SOUTH);i++;
        
        block[i] = new Wall(es, 3, 1, Direction.EAST);i++;
        block[i] = new Wall(es, 4, 0, Direction.EAST);i++;
        block[i] = new Wall(es, 5, 0, Direction.EAST);i++;
        block[i] = new Wall(es, 6, 1, Direction.EAST);i++;
        block[i] = new Wall(es, 4, 2, Direction.EAST);i++;
        block[i] = new Wall(es, 5, 2, Direction.EAST);i++;
        block[i] = new Wall(es, 3, 4, Direction.EAST);i++;
        block[i] = new Wall(es, 4, 4, Direction.EAST);i++;
        block[i] = new Wall(es, 5, 3, Direction.EAST);i++;
        block[i] = new Wall(es, 6, 3, Direction.EAST);i++;
        block[i] = new Wall(es, 5, 5, Direction.EAST);i++;
        block[i] = new Wall(es, 6, 4, Direction.EAST);i++;
        
        
        //cosas 
        t[0] = new Thing(c,2,7);
        t[1] = new Thing(c,3,5);
        t[2] = new Thing(c,5,4);
        casa = new Thing(c,7,4);
        casa.setColor(Color.red);
        
        
        
    }

   
 
}
