package ru.realsanya.snake;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.Point;


public class Field {
    Texture border;
    SpriteBatch batch;
    char ch;

    Field() {
        border = new Texture(Gdx.files.internal("check-box-empty.png"));
        batch = new SpriteBatch();
    }

    public void render(int x, int y, char ch) {
        this.ch = ch;
        DrawHorizontal(x, 0);
        DrawHorizontal(x, y);
        DrawVertical(0, y);
        DrawVertical(x, y);
    }

    private void DrawHorizontal(int x, int y) {
        batch.begin();
        for (int i = 0; i < x; i++) {
            batch.draw(border, i, y, border.getWidth(), border.getHeight());
        }
        batch.end();
    }

    private void DrawVertical(int x, int y) {
        batch.begin();
        for (int i = 0; i < y; i++) {
            batch.draw(border, x, i, border.getWidth(), border.getHeight());
        }
        batch.end();
    }
}
