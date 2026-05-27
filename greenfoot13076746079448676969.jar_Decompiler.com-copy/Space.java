import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class Space extends World {
   public static int PONTOS = 0;
   int sec = 0;
   int tempoRespawn = 0;

   public Space() {
      super(200, 600, 1);
      this.prepare();
      PONTOS = 0;
   }

   private void prepare() {
      Nave1 n1 = new Nave1();
      this.addObject(n1, 151, 558);
      this.criarInimigos();
   }

   private void criarInimigos() {
      int[] posicoesX = {30, 65, 100, 135, 170};
      for (int i = 0; i < posicoesX.length; i++) {
         this.addObject(new Inimigo(), posicoesX[i], 40);
      }
   }

   public void act() {
      int scrollAmt = 2 + PONTOS / 5;
      GreenfootImage bg = new GreenfootImage(this.getBackground());
      this.getBackground().drawImage(bg, 0, scrollAmt);
      this.getBackground().drawImage(bg, 0, scrollAmt - this.getHeight());
      this.showText("Pontos: " + PONTOS, 120, 30);

      if (this.getObjects(Inimigo.class).isEmpty()) {
         this.tempoRespawn++;
         if (this.tempoRespawn >= 120) {
            this.criarInimigos();
            this.tempoRespawn = 0;
         }
      } else {
         this.tempoRespawn = 0;
      }

   }
   
   public void createBullet(int x, int y){
        this.addObject(new Bullet(), x, y);
   }
}
