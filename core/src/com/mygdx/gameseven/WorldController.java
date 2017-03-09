package com.mygdx.gameseven;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector2;

public class WorldController extends InputAdapter {

    private Vector2 position;


    public WorldController() {



        init();
    }

    public void init(){
        Gdx.input.setInputProcessor(this);

    }


    public void update(){

    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.SPACE){

            //Gdx.app.log("Disposed", "Disposed");
            Constants.RUNNING = false;
        } else if (keycode == Input.Keys.DPAD_LEFT){

        }

        return true;
    }


}

