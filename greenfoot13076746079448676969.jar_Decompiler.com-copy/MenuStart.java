import greenfoot.World;

public class MenuStart extends World {
   public MenuStart() {
      super(200, 600, 1);
      this.prepare();
   }

   public void act() {
   }

   private void prepare() {
      PlayButton playButton = new PlayButton();
      this.addObject(playButton, 103, 164);
   }
}
