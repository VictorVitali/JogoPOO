import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Nave2 extends Actor {
   int cdTiro = 0;
   int fireRate = 20;

   public void act() {
      int velo = 4;
      this.cdTiro++;
      if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("Left")) {
         this.setLocation(this.getX() - velo, this.getY());
      }

      if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("Right")) {
         this.setLocation(this.getX() + velo, this.getY());
      }
      if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("Down")) {
         this.setLocation(this.getX(), this.getY() + velo);
      }
      if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("Up")) {
         this.setLocation(this.getX(), this.getY() - velo);
      }
      

      if (Greenfoot.isKeyDown("space")){
         if (this.cdTiro >= this.fireRate) {
             this.cdTiro = 0;
             getWorld().addObject(new TiroNave(), this.getX(), this.getY() - 20);
         }
      }

      if (Greenfoot.isKeyDown("r")) {
         this.setLocation(this.getX(), this.getY() + 3);
      }

   }
}
