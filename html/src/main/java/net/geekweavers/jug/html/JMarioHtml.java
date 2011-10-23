package net.geekweavers.jug.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import net.geekweavers.jug.core.JMario;

public class JMarioHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform platform = HtmlPlatform.register();
    platform.assetManager().setPathPrefix("jmario/");
    PlayN.run(new JMario());
  }
}
