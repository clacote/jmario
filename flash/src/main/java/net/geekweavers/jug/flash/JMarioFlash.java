package net.geekweavers.jug.flash;

import playn.core.PlayN;
import playn.flash.FlashGame;
import playn.flash.FlashPlatform;

import net.geekweavers.jug.core.JMario;
import net.geekweavers.jug.core.Platformer;

public class JMarioFlash extends FlashGame {

  @Override
  public void start() {
    FlashPlatform platform = FlashPlatform.register();
    platform.assetManager().setPathPrefix("jmarioflash/");
    // FIXME JMario
    PlayN.run(new Platformer());
  }
}
