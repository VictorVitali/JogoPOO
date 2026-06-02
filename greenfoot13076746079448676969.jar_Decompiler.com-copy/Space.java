import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class Space extends World {
   public static int PONTOS = 0;
   public static int Poder = 0;
   int sec = 0;
   int tempoRespawn = 0;
   int posicaoX = 20;
   int nivel = 1;

   public Space() {
      super(400, 800, 1);
      this.prepare();
      PONTOS = 0;
   }

   private void prepare() {
      Nave1 n1 = new Nave1();
      this.addObject(n1, 151, 558);
      this.criarInimigos();
   }

   private void criarInimigos() {
      this.nivel += 1;
      this.posicaoX = 20;
      int inimigos = this.nivel + 4;
      for (int i = 0; i < inimigos; i++) {
         this.posicaoX = this.posicaoX + 30;
         this.addObject(new Inimigo(this.nivel), this.posicaoX, 40);
      }
   }

   public void act() {
      int scrollAmt = 2 + PONTOS / 5;
      GreenfootImage bg = new GreenfootImage(this.getBackground());
      this.getBackground().drawImage(bg, 0, scrollAmt);
      this.getBackground().drawImage(bg, 0, scrollAmt - this.getHeight());
      this.showText("Pontos: " + PONTOS, 120, 30);
      this.showText("" + Poder, 380, 780);

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
