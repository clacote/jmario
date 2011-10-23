package net.geekweavers.jug.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import net.geekweavers.jug.core.JMario;
import net.geekweavers.jug.core.Platformer;

public class JMarioHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform platform = HtmlPlatform.register();
    platform.assetManager().setPathPrefix("jmario/");
    // FIXME JMario
    PlayN.run(new Platformer());
  }
}
