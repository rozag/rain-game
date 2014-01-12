package com.gamedev.rain.level.tile;

import com.gamedev.rain.graphics.Screen;
import com.gamedev.rain.graphics.Sprite;

public class VoidTile extends Tile {

    public VoidTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x, y, this);
    }

}