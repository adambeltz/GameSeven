package com.mygdx.gameseven;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

public class WorldController extends InputAdapter {

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
            new GameSevenMain().create();


        }
        return true;
    }
}
