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

public class MainActivity extends Stage{
	SpriteBatch batch;
	Texture img;

	Food food;

	Stage stage;
	StretchViewport viewport;

	

	public void create() {
		stage = new Stage();
		viewport = new StretchViewport(640, 360);

		food = new Food();
//		stage.addActor(Food);
	}


	public void render () {

	}
	

	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
