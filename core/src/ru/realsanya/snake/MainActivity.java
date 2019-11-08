package ru.realsanya.snake;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.StretchViewport;

import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainActivity extends Game{
//    int x = 625;
//    int y = 465;

    SpriteBatch batch;
    int x = 0;

    Texture img;
    char ch = ' ';
    char charFood = ' ';
    Food food;


    Texture border;

    Texture snakeBody;
    SpriteBatch batchSnake;
    Snake snake;

//	Stage stage;
//	StretchViewport viewport;


    public void create() {
        batch = new SpriteBatch();
        this.setScreen(new Field());

        snakeBody = new Texture(Gdx.files.internal("snakebody.png"));
        snake = new Snake(snakeBody);

    }


    public void render() {
        Gdx.gl.glClearColor(0, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        snake.render(batch);
    }

    public void dispose(){

    }
}
