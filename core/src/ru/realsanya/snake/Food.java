package ru.realsanya.snake;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.util.Random;

public class Food extends Actor {
    int x;
    int y;

    Random random;
    Texture imgFood;

    Food() {
        random = new Random(640);
       // imgFood = new Texture(Gdx.files.internal())
    }

    Food(int x, int y, char aChar) {
        this.x = x;
        this.y = y;
    }

    public void CreateFood() {
    }


}
