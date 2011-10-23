package net.geekweavers.jug.core;

// TODO: lots
public class TouchPanel {

  private static TouchCollection touches = new TouchCollection();

  public static TouchCollection GetState() {
    return touches;
  }
}
