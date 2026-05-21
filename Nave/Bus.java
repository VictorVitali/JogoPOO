import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Bus extends Actor {
   public void act() {
      this.setLocation(this.getX(), this.getY() + 5);
      if (this.isAtEdge()) {
         this.setLocation(Greenfoot.getRandomNumber(300), 0);
      }

      if (this.isTouching(Car.class)) {
         this.getWorld().showText("GAME OVER", 150, 450);
         Greenfoot.stop();
      }

   }
}
