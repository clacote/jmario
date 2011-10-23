package net.geekweavers.jug.core;

import playn.core.Keyboard;
import playn.core.Keyboard.Event;

// TODO: lots
public class KeyboardState implements Keyboard.Listener {

    private static KeyboardState state = new KeyboardState();

    public static KeyboardState GetState() {
        return state;
    }
    private boolean[] keys = new boolean[256];

    public boolean IsKeyDown(int keyCode) {
        assert (keyCode >= 0) && (keyCode < 256);
        return keys[keyCode];
    }

    @Override
    public void onKeyDown(Event event) {
        keys[event.keyCode()] = true;
    }

    @Override
    public void onKeyUp(Event event) {
        keys[event.keyCode()] = false;
    }
}
