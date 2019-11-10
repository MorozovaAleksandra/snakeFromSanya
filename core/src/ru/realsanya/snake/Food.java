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
    //
    // Sprite foodSprite;

    Food(Texture food) {
        this.imgFood = food;
        // foodSprite = new Sprite(imgFood);
    }


    public void render(SpriteBatch batch) {
        x = 0 + (int) (Math.random() * width);
        y = 0 + (int) (Math.random() * height);
        batch.begin();
        //foodSprite.setBounds(x, y, 16, 16);
        batch.draw(imgFood, x, y);
        batch.end();
    }


    public void dispose() {
        imgFood.dispose();
    }


    public void delete(Sprite sprite) {
    }


}
