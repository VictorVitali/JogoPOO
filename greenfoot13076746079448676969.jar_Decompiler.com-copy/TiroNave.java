import greenfoot.Actor;

public class TiroNave extends Actor {
   public void act() {
      this.setLocation(this.getX(), this.getY() - 5);

      if (this.isTouching(Inimigo.class)) {
         this.removeTouching(Inimigo.class);
         Space.PONTOS++;
         getWorld().removeObject(this);
      } else if (this.getY() <= 0) {
         getWorld().removeObject(this);
      }
   }
}
