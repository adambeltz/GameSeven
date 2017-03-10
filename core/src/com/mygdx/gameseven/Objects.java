package com.mygdx.gameseven;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Objects {

    Sprite grayCatSprite;
    Sprite backgroundSprite;
    Sprite brownCatSprite;


    public Objects(){
        init();
    }

    private void init(){
        grayCatSprite = new Sprite(GameSevenMain.assets.getAtlasRegion("gray_cat_front200"));
        grayCatSprite.setPosition(0,0);
        grayCatSprite.setSize(10,10 * getAspectRatio(grayCatSprite));


        brownCatSprite = new Sprite(GameSevenMain.assets.brownCat);
        brownCatSprite.setPosition(50, Constants.VIEWPORT_HEIGHT/2f);
        brownCatSprite.setSize(12, 12 * getAspectRatio(brownCatSprite));




        backgroundSprite = new Sprite(GameSevenMain.assets.background);
        backgroundSprite.setSize(150,150 * getAspectRatio(backgroundSprite));
        backgroundSprite.setCenter(Constants.VIEWPORT_WIDTH/2f, Constants.VIEWPORT_HEIGHT/2f);

    }

    public void render(SpriteBatch batch){
        backgroundSprite.draw(batch);
        grayCatSprite.draw(batch);
        brownCatSprite.draw(batch);

    }

    private float getAspectRatio(Sprite sprite){
        float aspectRatio = sprite.getHeight() / sprite.getWidth();

        return aspectRatio;
    }

    public Vector2 getPosition(Sprite sprite){
        Vector2 vector2 = new Vector2();
        float x = sprite.getX();
        float y = sprite.getY();
        vector2.x = x;
        vector2.y = y;
        return vector2;

    }

}
