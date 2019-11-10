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

    int x;
    int y;
    int width = 320;
    int height = 640;

    public void create() {
        viewport = new StretchViewport(640, 360);
        stage = new Stage(viewport);

        batch = new SpriteBatch();
        snake = new Snake();
        food = new Food();
    }

    public void update() {
    }

    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        food.render(batch);
        snake.render(batch);

        if (check()) {
            x = 0 + (int) (Math.random() * width);
            y = 0 + (int) (Math.random() * height);
        }
    }

    public boolean check() {
        if ((snake.x >= food.x) &&
                (snake.x + snake.getWidth()) <= (food.x + food.getWidth())
                && (snake.y >= food.y) &&
                (snake.y + snake.getHeight() <= food.y + food.getHeight())) {
            return true;
        }
        return false;
    }

    public void dispose() {
    }
}
