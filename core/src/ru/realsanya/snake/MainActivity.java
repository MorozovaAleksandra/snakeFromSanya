package ru.realsanya.snake;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MainActivity extends Game {
    Field field;
    Texture border;

    SpriteBatch batch;
    int x;
    int y;

    Texture snakeBody;
    SpriteBatch batchSnake;
    Snake snake;

    Texture imgFood;
    SpriteBatch batchFood;
    Food food;

    Array<Food> foods;
    float time;


    public void create() {
        batch = new SpriteBatch();

        snakeBody = new Texture(Gdx.files.internal("snakebody.png"));
        snake = new Snake(snakeBody);

        imgFood = new Texture(Gdx.files.internal("food.png"));
        food = new Food(imgFood);
        foods = new Array<>();
        foods.add(new Food(imgFood));

    }


    public void update(Array<Food> foods) {
        foods.add(new Food(imgFood));

    }


    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        for (Food food :
                foods) {
            food.render(batch);
            if ((snake.getX() >= foods.get(0).getX()) &&
                    (snake.getX() + snake.getWidth()) <= (foods.get(0).getX() + foods.get(0).getWidth())
                    && (snake.getY() >= foods.get(0).getY()) &&
                    (snake.getY() + snake.getHeight() <= foods.get(0).getY() + foods.get(0).getHeight())) {
                foods.removeIndex(0);
                update(foods);
            }
        }
        snake.render(batch);
        //field.render(320,640,' ');
    }


    public void dispose() {

    }
}
