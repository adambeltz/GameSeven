package com.mygdx.gameseven;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

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
        grayCatSprite.setSize(10,10);

    }

    public void render(SpriteBatch batch){
        grayCatSprite.draw(batch);

    }
}
