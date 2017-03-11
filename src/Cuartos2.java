import becker.robots.*;

public class Cuartos2 {
 
    private City London;
    private Robot Hazard;
    private Thing[] led;
    private Wall[] Paredes;
    private Imprimir Num1;
    private Imprimir Num2;
    private Imprimir Num3;
    
    public Cuartos2(int n1, int n2, int n3){
        London = new City(10, 12);
        Hazard = new Robot(London, 6, 2, Direction.NORTH);
        Num1 = new Imprimir(n1, 1);
        Num2 = new Imprimir(n2, 2);
        Num3 = new Imprimir(n3, 3);
        led = new Thing[39];
        Paredes = new Wall[35];
        int x = 0;
        for(int i=1;i<6;i++){
            for(int j=1;j<10;j++){
                if(j<4)
                    if(Num1.NumberWrite(i, j))
                        continue;
                if(j>=4&&j<7)
                    if(Num2.NumberWrite(i, j))
                        continue;
                if(j>=7)
                    if(Num3.NumberWrite(i, j))
                        continue;
                led[x]=new Thing(London, i, j);
                x++;
            }
        }
        int y = 0;
        for(int i=1;i<6;i++){
            for(int j=1;j<10;j++){
                if(i==1){
                    Paredes[y]=new Wall(London, i, j, Direction.NORTH);
                    y++;
                }
                if(j==1||j==4||j==7){
                    Paredes[y]=new Wall(London, i, j, Direction.WEST);
                    y++;
                }
                if(i==5&&j!=2&&j!=5&&j!=8){
                    Paredes[y]=new Wall(London, i, j, Direction.SOUTH);
                    y++;
                }
                if(j==9){
                    Paredes[y]=new Wall(London, i, j, Direction.EAST);
                    y++;
                }
            }
        }
    }
    
    public void In(){
        for(int i=0;i<3;i++)
            Hazard.move();
        Hazard.turnLeft();
    }
    
    public boolean[] movimiento(){
        boolean[] x = new boolean[7];
        x[6]=Hazard.canPickThing();
        Hazard.move();
        for(int i=0;i<3;i++)
            Hazard.turnLeft();
        Hazard.move();
        x[5]=Hazard.canPickThing();
        Hazard.turnLeft();
        Hazard.turnLeft();
        Hazard.move();
        Hazard.move();
        for(int i=4;i>0;i--){
            x[i]=Hazard.canPickThing();
            Hazard.move();
            if(i!=2)
                Hazard.turnLeft();
            Hazard.move();
        }
        x[0]=Hazard.canPickThing();
        return x;
    }
    
    public void getOut(){
        Hazard.turnLeft();
        for(int i=0;i<5;i++)
            Hazard.move();
    }
    
    public void Next(){
        Hazard.turnLeft();
        for(int i=0;i<3;i++)
            Hazard.move();
        Hazard.turnLeft();
    }
}

