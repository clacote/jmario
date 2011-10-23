package net.geekweavers.jug.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import net.geekweavers.jug.core.JMario;
import net.geekweavers.jug.core.Platformer;

public class JMarioJava {

  public static void main(String[] args) {
    JavaPlatform platform = JavaPlatform.register();
    platform.assetManager().setPathPrefix("src/main/java/net/geekweavers/jug/resources");
    PlayN.run(new Platformer());
  }
}
