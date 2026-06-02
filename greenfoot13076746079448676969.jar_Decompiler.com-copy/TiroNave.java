import greenfoot.*;

public class TiroNave extends Actor {
   public void act() {
      this.setLocation(this.getX(), this.getY() - 5);

      if (this.isTouching(Inimigo.class)) {
         Inimigo inimigo = (Inimigo)getOneIntersectingObject(Inimigo.class);
         inimigo.perderVida(1);
         Space.PONTOS++;

         if (Greenfoot.getRandomNumber(100) < 20) {
            getWorld().addObject(new ItemVelocidade(), this.getX(), this.getY());
         }

         getWorld().removeObject(this);
      } else if (this.getY() <= 0) {
         getWorld().removeObject(this);
      }
   }
}
