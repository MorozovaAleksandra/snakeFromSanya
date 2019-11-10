package ru.realsanya.snake;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.util.Random;

public class Food extends Actor {
    int x;
    int y;
    int width = 320;
    int height = 640;

    Texture imgFood;
    SpriteBatch batch;

    Food() {
        batch = new SpriteBatch();
        imgFood = new Texture(Gdx.files.internal("food.png"));
    }


    public void render(SpriteBatch batch) {
        x = 0 + (int) (Math.random() * width);
        y = 0 + (int) (Math.random() * height);
        batch.begin();
        batch.draw(imgFood, x, y);
        batch.end();
    }


    public void dispose() {
        imgFood.dispose();
    }


    public void delete(Sprite sprite) {
    }


}
