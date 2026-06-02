import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Inimigo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inimigo extends Actor
{
    int x = 0;
    int moveSpeed = 1;
    int nvl;
    int vidas;
    
    public Inimigo (int Nivel){
        this.nvl = Nivel;
        this.vidas = 1 + (Nivel / 2);
     } 
    public void perderVida(int qnt){
        this.vidas = this.vidas - qnt;
        if(this.vidas == 0){
            Space.Poder++;
            getWorld().removeObject(this);
        }
    }
    public void act()
    {   
        int direcao = ((int)(System.currentTimeMillis() / 600) % 2 == 0) ? 1 : -1;
        //gambiarra pra ele andar mais devagar pq o setLocation
        //nao aceita valor menor que 1
        if(x==1){
           x=0;
           this.setLocation(this.getX() + direcao, this.getY() + this.moveSpeed);
        }else{
           x=1;
           this.setLocation(this.getX() + direcao, this.getY());
        }
        if (Greenfoot.getRandomNumber(120) < 1) {
            getWorld().addObject(new Bullet(), this.getX(), this.getY());
         }
        // Add your action code here.
    }
}
