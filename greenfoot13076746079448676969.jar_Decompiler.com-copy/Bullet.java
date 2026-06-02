import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Bullet extends Actor {
   public void act() {
      this.setLocation(this.getX(), this.getY() + 5);
      
      if (this.isTouching(Nave1.class)) {
         Space.Poder--;
         if(Space.Poder == 0){
         this.getWorld().showText("GAME OVER", 150, 450);
         Greenfoot.stop();
         }
      }
      
      if(this.getY() >= 650){
          getWorld().removeObject(this);
      }
   }
}
