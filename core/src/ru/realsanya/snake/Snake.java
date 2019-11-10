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

    //    Sprite snakeSprite;
    Texture imgSnake;
    SpriteBatch batch;


//    Snake(int x, int y, int boardSize) {
//        this.x = x % boardSize;
//        if (this.x < 0) {
//            this.x += boardSize;
//        }
//        this.y = y % boardSize;
//        if (this.y < 0) {
//            this.y += boardSize;
//        }
//    }

    public Snake(Texture imgSnake) {
        this.imgSnake = imgSnake;
        batch = new SpriteBatch();
//        snakeSprite = new Sprite(imgSnake);
    }

    // public Sprite getSprite() {
    //      return snakeSprite;
    //}

    public void render(SpriteBatch batch) {
        batch.begin();
//        snakeSprite.setBounds(x, y, 16, 16);
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
