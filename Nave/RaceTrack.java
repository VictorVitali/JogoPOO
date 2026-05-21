import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;

public class RaceTrack extends World {
   public static int PONTOS = 0;
   int sec = 0;

   public RaceTrack() {
      super(200, 600, 1);
      this.prepare();
      PONTOS = 0;
   }

   private void prepare() {
      Car car = new Car();
      this.addObject(car, 151, 558);
      Ambulancia ambulancia = new Ambulancia();
      this.addObject(ambulancia, 29, 174);
      CarroAzul carroAzul = new CarroAzul();
      this.addObject(carroAzul, 98, 46);
      CarroVerde carroVerde = new CarroVerde();
      this.addObject(carroVerde, 185, 298);
      carroVerde.setLocation(186, 88);
      ambulancia.setLocation(16, 104);
   }

   public void act() {
      int scrollAmt = 2 + PONTOS / 5;
      GreenfootImage bg = new GreenfootImage(this.getBackground());
      this.getBackground().drawImage(bg, 0, scrollAmt);
      this.getBackground().drawImage(bg, 0, scrollAmt - this.getHeight());
      this.showText("Pontos: " + PONTOS, 120, 30);
      if (this.sec++ == 60) {
         if (Greenfoot.getRandomNumber(20) < 3) {
            this.addObject(new CarroVerde(), Greenfoot.getRandomNumber(this.getWidth()), 1);
         }

         if (Greenfoot.getRandomNumber(20) < 2) {
            this.addObject(new CarroAzul(), Greenfoot.getRandomNumber(this.getWidth()), 1);
         }

         if (Greenfoot.getRandomNumber(20) < 3) {
            this.addObject(new Ambulancia(), Greenfoot.getRandomNumber(this.getWidth()), 1);
         }

         this.sec = 0;
      }

   }
}
