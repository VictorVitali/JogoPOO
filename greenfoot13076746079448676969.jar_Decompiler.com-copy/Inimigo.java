import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Inimigo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inimigo extends Actor
{
    /**
     * Act - do whatever the Inimigo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    public void act()
    {   
        if (Greenfoot.getRandomNumber(5) < 1) {
             this.setLocation(this.getX() + 5, this.getY());
        }
        if (Greenfoot.getRandomNumber(5) < 1) {
             this.setLocation(this.getX() - 5, this.getY());
        }
        this.setLocation(this.getX(), this.getY()-1);

        if (Greenfoot.getRandomNumber(50) < 1) {
            getWorld().addObject(new Bullet(), this.getX(), this.getY());
         }
        // Add your action code here.
    }
}
