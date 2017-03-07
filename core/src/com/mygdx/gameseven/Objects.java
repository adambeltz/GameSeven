package com.mygdx.gameseven;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Objects {

    Sprite grayCatSprite;
    Sprite backgroundSprite;
    Sprite brownCatSprite;
    float BACKGROUND_ASPECTRATIO;

    public Objects(){
        init();
    }

    private void init(){
        grayCatSprite = new Sprite(GameSevenMain.assets.getAtlasRegion("gray_cat_front200"));
        grayCatSprite.setPosition(0,0);
        grayCatSprite.setSize(10,10);
        backgroundSprite = new Sprite(GameSevenMain.assets.background);
        BACKGROUND_ASPECTRATIO = backgroundSprite.getHeight() / backgroundSprite.getWidth();
        backgroundSprite.setSize(80,80 * BACKGROUND_ASPECTRATIO);
        backgroundSprite.setCenter(Constants.VIEWPORT_WIDTH/2f, Constants.VIEWPORT_HEIGHT/2f * Constants.ASPECT_RATIO);

    }

    public void render(SpriteBatch batch){
        grayCatSprite.draw(batch);
        backgroundSprite.draw(batch);

    }
}
