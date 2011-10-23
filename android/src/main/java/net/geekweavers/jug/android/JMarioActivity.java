package net.geekweavers.jug.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import net.geekweavers.jug.core.JMario;
import net.geekweavers.jug.core.Platformer;

public class JMarioActivity extends GameActivity {

  @Override
  public void main(){
    platform().assetManager().setPathPrefix("net/geekweavers/jug/resources");
    // FIXME JMario
    PlayN.run(new Platformer());
  }
}
