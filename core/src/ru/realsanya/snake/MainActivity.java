package ru.realsanya.snake;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;

import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainActivity extends Game{
    int x = 495;
    int y = 395;

    SpriteBatch batch;
    Texture img;
    char ch = ' ';
    char charFood = ' ';
    Food food;

    Field field;
    Texture border;

//	Stage stage;
//	StretchViewport viewport;


    public void create() {
//		stage = new Stage();
//		viewport = new StretchViewport(640, 360);

        border = new Texture(Gdx.files.internal("check-box-empty.png"));
        field = new Field();
    }


    public void render() {
        Gdx.gl.glClearColor(0, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        field.render(x, y, ch);
    }

    public void dispose(){

    }
}
