import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Nave1 extends Actor {
   int cdTiro = 0;
   int fireRate = 30;
   int velocidade = 3;

   public void aumentarVelocidade() {
      this.velocidade++;
   }

   public void act() {
      this.cdTiro++;
      if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("Left")) {
         this.setLocation(this.getX() - this.velocidade, this.getY());
      }

      if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("Right")) {
         this.setLocation(this.getX() + this.velocidade, this.getY());
      }
      if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("Down")) {
         this.setLocation(this.getX(), this.getY() + this.velocidade);
      }
      if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("Up")) {
         this.setLocation(this.getX(), this.getY() - this.velocidade);
      }

      if (Greenfoot.isKeyDown("space")){
         if (this.cdTiro >= this.fireRate) {
             this.cdTiro = 0;
             if(Space.Poder > 20){
                 getWorld().addObject(new TiroNave(), this.getX()-15, this.getY() - 20);
                 getWorld().addObject(new TiroNave(), this.getX(), this.getY() - 20);
                 getWorld().addObject(new TiroNave(), this.getX() +15, this.getY() - 20);
             }
             else if(Space.Poder > 10){
                 getWorld().addObject(new TiroNave(), this.getX() - 5, this.getY() - 20);
                 getWorld().addObject(new TiroNave(), this.getX() + 5, this.getY() - 20);
             }else{
                 getWorld().addObject(new TiroNave(), this.getX(), this.getY() - 20);
             }
        }
      }

      if (Greenfoot.isKeyDown("r")) {
         this.setLocation(this.getX(), this.getY() + 3);
      }
   }
}
