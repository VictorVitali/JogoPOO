import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;

public class Ambulancia extends Actor {
   public void act() {
      this.setLocation(this.getX(), this.getY() + 4);
      if (this.isTouching(Car.class)) {
         Greenfoot.stop();
         this.getWorld().showText("GAME OVER", this.getWorld().getWidth() / 2, this.getWorld().getHeight() / 2);
         (new GreenfootSound("hit.mp3")).play();
      }

      if (this.isAtEdge()) {
         this.getWorld().removeObject(this);
         ++RaceTrack.PONTOS;
      }

   }
}
