package ru.realsanya.snake;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class MainActivity extends Game {
    SpriteBatch batch;

    Snake snake;
    Food food;

    Stage stage;
    StretchViewport viewport;

    public void create() {
        viewport = new StretchViewport(640, 360);
        stage = new Stage(viewport);

        batch = new SpriteBatch();
        snake = new Snake();
        food = new Food();
    }

    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        food.render(batch);
        snake.render(batch);
        batch.end();

        if (check()) {
            food.change();
        }
    }

    public boolean check() {
        if ((snake.x <= food.x) &&
                (snake.y <= food.y &&
                        ((snake.x + 32) >= (food.x + 16))
                        && ((snake.y + 32) >= (food.y + 16)))) {
            return true;
        }
        return false;
    }

    public void getWidth() {

    }

    public void dispose() {
    }
}
