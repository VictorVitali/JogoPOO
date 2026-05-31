import greenfoot.*;

public class TiroNave extends Actor {
   public void act() {
      this.setLocation(this.getX(), this.getY() - 5);

      if (this.isTouching(Inimigo.class)) {
         Inimigo inimigo = (Inimigo)getOneIntersectingObject(Inimigo.class);
         inimigo.perderVida(1);
         Space.PONTOS++;
         getWorld().removeObject(this);
         if(Greenfoot.getRandomNumber(50) > 1){
              item Item = new Item();
              this.addObject(Item, this.getX(), this.getY());
         }
      } else if (this.getY() <= 0) {
         getWorld().removeObject(this);
      }
   }
}
