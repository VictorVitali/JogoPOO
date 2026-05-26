import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Bullet extends Actor {
   public void act() {
      this.setLocation(this.getX(), this.getY() + 5);
      
      if (this.isTouching(Nave1.class)) {
         this.getWorld().showText("GAME OVER", 150, 450);
         Greenfoot.stop();
      }

   }
}
