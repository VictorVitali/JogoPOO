import greenfoot.Actor;
import greenfoot.Greenfoot;

public class PlayButton extends Actor {
   public void act() {
      if (Greenfoot.isKeyDown("space")) {
         this.switchWorld();
      }

      if (Greenfoot.mouseClicked(this)) {
         this.switchWorld();
      }

   }

   private void switchWorld() {
      Greenfoot.setWorld(new RaceTrack());
   }
}
