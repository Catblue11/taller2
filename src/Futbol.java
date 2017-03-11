import becker.robots.*;
import java.awt.Color;
        
public class Futbol {
    public static void main(String [] args)
    {
         // Crear el escenario
      City london = new City();
      
      for (int i=0;i<5;i++){
          if(i==2){
              
          }
          else {Wall paredesWest = new Wall(london, i, 0, Direction.WEST);
      }
      }
      for (int i=0;i<5;i++){
          if(i==2){
              
          }
          else {Wall paredesEast = new Wall(london, i, 8, Direction.EAST);
      }
      }
      
      
      
     /* Wall blockAve0 = new Wall(london, 0, 0, Direction.WEST);
      Wall blockAve1 = new Wall(london, 1, 0, Direction.WEST);
      Wall blockAve2 = new Wall(london, 3, 0, Direction.WEST);
      Wall blockAve3 = new Wall(london, 4, 0, Direction.WEST);
      Wall blockAve4 = new Wall(london,0, 8, Direction.EAST);
      Wall blockAve5 = new Wall(london,1, 8, Direction.EAST);
      Wall blockAve6 = new Wall(london,3, 8, Direction.EAST);
      Wall blockAve7 = new Wall(london,4, 8, Direction.EAST);*/
     
      /// crear los robot
      
      Robot chelsea = new Robot(london, 2, 8, Direction.WEST);
      Robot manUnited = new Robot(london, 2,0,Direction.EAST);
      
///crear el balon
      Thing balon = new Thing(london, 2, 7);
     
      /// interactuar con el robot
      
      chelsea.setColor(Color.blue);
      manUnited.setColor(Color.red);
      
      moveN(1, chelsea);
      chelsea.pickThing();
      moveN(6, manUnited);
      turnRight(chelsea);
      moveN(1, chelsea);
      chelsea.turnLeft();
      moveN(2, chelsea);
      goBack(manUnited);
      moveN(2, manUnited);
      turnRight(manUnited);
      manUnited.move();
      chelsea.turnLeft();
      chelsea.move();
      turnRight(chelsea);
      moveN(3,chelsea);
      manUnited.turnLeft();
      moveN(3, manUnited);
      manUnited.turnLeft();
      manUnited.move();
      goBack(chelsea);
      chelsea.move();
      chelsea.turnLeft();
      manUnited.turnLeft();
      manUnited.move();
      chelsea.move();
      chelsea.turnLeft();
      moveN(2,chelsea);
      chelsea.turnLeft();
      chelsea.move();
      turnRight(chelsea);
      chelsea.move();
      chelsea.putThing();
      goBack(chelsea);
        
     /*moveN(5 , chelsea);
      turnRight(chelsea);*/
      
      /*for(int i=0;i<6;i++){
        manUnited.move();  
      }*/
      
      
      /*chelsea.move();
      chelsea.pickThing();
      
      
      
      
      chelsea.move();
      
      chelsea.turnLeft();
      chelsea.turnLeft();
      chelsea.turnLeft();
      
      chelsea.move();
      chelsea.turnLeft();
      chelsea.move();
      chelsea.move();
      chelsea.turnLeft();
      chelsea.move();
      chelsea.turnLeft();
      chelsea.turnLeft();
      chelsea.turnLeft();
      
      manUnited.turnLeft();
      manUnited.move();
      manUnited.turnLeft();
      manUnited.move();
      manUnited.move();
      manUnited.turnLeft();
      manUnited.move();
      manUnited.turnLeft();
      
      chelsea.turnLeft();
      chelsea.move();
      chelsea.turnLeft();
      chelsea.turnLeft();
      chelsea.turnLeft();
      chelsea.move();
      chelsea.move();
      chelsea.turnLeft();
      chelsea.turnLeft();
      chelsea.turnLeft();
      chelsea.move();
      chelsea.turnLeft();
      chelsea.move();
      chelsea.move();
      chelsea.putThing();
      chelsea.turnLeft();
      chelsea.turnLeft();
      chelsea.move();
      chelsea.turnLeft();
      chelsea.turnLeft();
      chelsea.turnLeft();
      chelsea.turnLeft();
      chelsea.turnLeft();
      chelsea.turnLeft();*/
      
    }
    
    public static void moveN(int n, Robot player){
        for(int i=0;i<n;i++){
            player.move();
            
        }
    }
    public static void turnRight(Robot player){
        player.turnLeft();
        player.turnLeft();
        player.turnLeft();
        
    }
    public static void goBack(Robot player){
        player.turnLeft();
        player.turnLeft();
    }
}
