package com.mygdx.gameseven;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Disposable;

public class Assets implements Disposable{

    AssetManager assetManager;
    TextureAtlas textureAtlas;
    TextureAtlas.AtlasRegion background;
    TextureAtlas.AtlasRegion brownCat;
    TextureAtlas.AtlasRegion grayCat;
    Sprite cat;

    public Assets() {
        init();
    }

    private void init(){
        assetManager = new AssetManager();
        assetManager.load("TextureAtlas.atlas", TextureAtlas.class);
        assetManager.finishLoading();
        textureAtlas = assetManager.get("TextureAtlas.atlas");

        background = textureAtlas.findRegion("blue_background002");

        brownCat = textureAtlas.findRegion("cat_resize");
        grayCat = textureAtlas.findRegion("gray_cat_front200");

    }


    public TextureAtlas.AtlasRegion getAtlasRegion(String regionName){

        TextureAtlas.AtlasRegion atlasRegion = textureAtlas.findRegion(regionName);
        return atlasRegion;
    }
    @Override
    public void dispose() {
        assetManager.dispose();
        textureAtlas.dispose();

    }



}
