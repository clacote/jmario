package net.geekweavers.jug.flash;

import playn.core.PlayN;
import playn.flash.FlashGame;
import playn.flash.FlashPlatform;

import net.geekweavers.jug.core.JMario;

public class JMarioFlash extends FlashGame {

  @Override
  public void start() {
    FlashPlatform platform = FlashPlatform.register();
    platform.assetManager().setPathPrefix("jmarioflash/");
    PlayN.run(new JMario());
  }
}
