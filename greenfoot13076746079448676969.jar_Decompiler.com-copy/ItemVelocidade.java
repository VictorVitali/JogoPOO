import greenfoot.*;

public class ItemVelocidade extends Actor {
   int velocidadeQueda = 2;

   public void act() {
      this.setLocation(this.getX(), this.getY() + this.velocidadeQueda);

      if (this.isTouching(Nave1.class)) {
         Nave1 nave = (Nave1)this.getOneIntersectingObject(Nave1.class);
         nave.aumentarVelocidade();
         getWorld().removeObject(this);
      } else if (this.getY() >= getWorld().getHeight() - 1) {
         getWorld().removeObject(this);
      }
   }
}
