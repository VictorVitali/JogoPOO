import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class Space extends World {
   public static int PONTOS = 0;
   int sec = 0;

   public Space() {
      super(200, 600, 1);
      this.prepare();
      PONTOS = 0;
   }

   private void prepare() {
      Nave1 n1 = new Nave1();
      Inimigo enemy = new Inimigo();
      this.addObject(n1, 151, 558);
      this.addObject(enemy, 151, 5);
   }

   public void act() {
      int scrollAmt = 2 + PONTOS / 5;
      GreenfootImage bg = new GreenfootImage(this.getBackground());
      this.getBackground().drawImage(bg, 0, scrollAmt);
      this.getBackground().drawImage(bg, 0, scrollAmt - this.getHeight());
      this.showText("Pontos: " + PONTOS, 120, 30);

   }
   
   public void createBullet(int x, int y){
        this.addObject(new Bullet(), x, y);
   }
}
