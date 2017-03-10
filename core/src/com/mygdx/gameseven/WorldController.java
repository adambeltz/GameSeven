package com.mygdx.gameseven;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;



public class WorldController extends InputAdapter {

    private Vector2 position;
    private Vector2 spritePosition;



    public WorldController() {



        init();
    }

    public void init(){
        Gdx.input.setInputProcessor(this);
        position = new Vector2();
        spritePosition = new Vector2();

    }


    public void update(float deltaTime){
        handleInput(deltaTime);

    }

    @Override
    public boolean keyUp(int keycode) {

        // Reset game
        if (keycode == Input.Keys.SPACE) {
            Constants.RUNNING = false;
        }


        return true;
    }

    public void handleInput(float deltaTime){

        float cameraMoveSpeed = 10 * deltaTime;
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT))moveCamera(-cameraMoveSpeed, 0);

        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) moveCamera(cameraMoveSpeed,0);
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) moveCamera(0,cameraMoveSpeed);
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) moveCamera(0,-cameraMoveSpeed);
        if (Gdx.input.isKeyPressed(Input.Keys.A)) moveSprite(0,cameraMoveSpeed);


    }

    public void moveCamera(float x, float y){

        position.x += x;
        position.y += y;


    }

    public void moveSprite(float x, float y){
        spritePosition.x += x;
        spritePosition.y += y;
    }

    public void applyTo(OrthographicCamera camera){
        camera.position.x += position.x;
        camera.position.y += position.y;
        camera.update();
        position.set(0,0);
    }

    public void applyTo(Sprite sprite){
        sprite.translate(spritePosition.x, spritePosition.y);
        spritePosition.set(0,0);
    }

    public Vector2 getPosition(Sprite sprite){
        Vector2 vector2 = new Vector2();
        vector2.x = sprite.getX();
        vector2.y = sprite.getY();
        return vector2;
    }

    public void setPosition(float x, float y){
        this.position.set(x,y);
    }








}

