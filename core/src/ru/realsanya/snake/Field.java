package ru.realsanya.snake;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.Point;

public class Field  {
    Texture border;
    SpriteBatch batch;

    Field(){
      //  border = new Texture(Gdx.files.internal());
        batch = new SpriteBatch();
    }
    public void Field(int x, int y, Texture border){
        DrawHorizontal(x, 0);
        DrawHorizontal(x, y);
        DrawVertical(0, y);
        DrawVertical(x, y);
    }

    private void DrawHorizontal(int x, int y){
        for (int i = 0; i < x; i++){
//            Point p = (i, y);
            batch.draw(border, i, y);
           // wall.Add(p);
        }
    }

    private void DrawVertical(int x, int y) {
        for (int i = 0; i < y; i++) {
//            Point p = (x, i, ch);
            batch.draw(border, x, i);
            //wall.Add(p);
        }
    }
}
