import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Nave1 extends Actor {
   public void act() {
      int velo = 3;
      if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("Left")) {
         this.setLocation(this.getX() - velo, this.getY());
      }

      if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("Right")) {
         this.setLocation(this.getX() + velo, this.getY());
      }
      if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("Down")) {
         this.setLocation(this.getX(), this.getY() + velo);
      }
      if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("Up")) {
         this.setLocation(this.getX(), this.getY() - velo);
      }
      

      if (Greenfoot.isKeyDown("space")) {
         this.setLocation(this.getX(), this.getY() - 3);
      }

      if (Greenfoot.isKeyDown("r")) {
         this.setLocation(this.getX(), this.getY() + 3);
      }

   }
}
