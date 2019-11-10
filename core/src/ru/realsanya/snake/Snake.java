package ru.realsanya.snake;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;


public class Snake extends Actor {
    int x = 45;
    int y = 45;
    int speed = 2;

    Texture imgSnake;
    SpriteBatch batch;



    public Snake() {
        batch = new SpriteBatch();
        imgSnake = new Texture(Gdx.files.internal("snakebody.png"));

    }


    public void render(SpriteBatch batch) {
        batch.begin();
        batch.draw(imgSnake, x, y);
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            x += speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            x -= speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            y += speed;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            y -= speed;
        }
        batch.end();

    }


    public void dispose() {
        imgSnake.dispose();
    }
}
