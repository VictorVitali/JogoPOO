import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Car extends Actor {
   public void act() {
      if (Greenfoot.isKeyDown("a")) {
         this.setLocation(this.getX() - 3, this.getY());
      }

      if (Greenfoot.isKeyDown("d")) {
         this.setLocation(this.getX() + 3, this.getY());
      }

      if (Greenfoot.isKeyDown("space")) {
         this.setLocation(this.getX(), this.getY() - 3);
      }

      if (Greenfoot.isKeyDown("r")) {
         this.setLocation(this.getX(), this.getY() + 3);
      }

   }
}
