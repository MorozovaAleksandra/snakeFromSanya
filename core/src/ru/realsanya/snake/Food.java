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

    Random rand;
    int random;

    Texture imgFood;
    Sprite foodSprite;

    Food(Texture food) {
        rand = new Random(640);
        this.imgFood = food;
        foodSprite = new Sprite(imgFood);
        random = rand.nextInt(640);
    }


    public void render(SpriteBatch batch) {
        batch.begin();
        x = random;
        foodSprite.setBounds(x, y, 16, 16);
        batch.draw(foodSprite, foodSprite.getX(), foodSprite.getY());
        batch.end();

    }

    public void dispose() {
        imgFood.dispose();
    }


}
