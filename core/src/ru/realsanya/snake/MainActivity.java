package ru.realsanya.snake;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import javafx.stage.Stage;

public class MainActivity extends Game {

    SpriteBatch batch;


    Snake snake;
    Food food;

    Stage stage;
    StretchViewport viewport;


    public void create() {
        viewport = new StretchViewport(640, 360);
        stage = new Stage();

        batch = new SpriteBatch();
        snake = new Snake();
        food = new Food();
    }

    public void update() {

    }


    public void render(SpriteBatch batch) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        food.render(batch);
        snake.render(batch);

        if ((snake.x >= food.x) &&
                (snake.x + snake.getWidth()) <= (food.x + food.getWidth())
                && (snake.y >= food.y) &&
                (snake.y + snake.getHeight() <= food.y + food.getHeight())) {
            update();
        }
    }


    public void dispose() {

    }
}
