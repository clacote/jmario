package net.geekweavers.jug.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import net.geekweavers.jug.core.JMario;

public class JMarioActivity extends GameActivity {

  @Override
  public void main(){
    platform().assetManager().setPathPrefix("net/geekweavers/jug/resources");
    PlayN.run(new JMario());
  }
}
