package ru.realsanya.snake;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Snake extends Actor {
    int x;
    int y;
    int speed = 5;
    Snake(){

    }

    public void move(){
        if (Gdx.input.isButtonPressed(Input.Buttons.RIGHT)){
            x+=speed;
        }
        if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)){
            x-=speed;
        }
        if (Gdx.input.isButtonPressed(Input.Buttons.FORWARD)){
            y+=speed;
        }
//
    }
}
