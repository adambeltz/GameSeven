package com.mygdx.gameseven;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;

public class WorldRenderer implements Disposable{

    public OrthographicCamera camera;
    public SpriteBatch batch;
    public Objects objects;

    public WorldRenderer() {
        init();
    }

    public void init(){
        batch = new SpriteBatch();
        camera = new OrthographicCamera(Constants.VIEWPORT_WIDTH, Constants.VIEWPORT_HEIGHT * Constants.ASPECT_RATIO);
        camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
        objects = new Objects();
        camera.update();

    }

    public void render(SpriteBatch batch){
        batch.setProjectionMatrix(camera.combined);
        camera.update();
        batch.begin();
        objects.render(batch);

        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
