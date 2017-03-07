package com.mygdx.gameseven;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameSevenMain extends ApplicationAdapter {
	WorldRenderer worldRenderer;
	WorldController worldController;
	static Assets assets;
	SpriteBatch batch;



	@Override
	public void create () {
		batch = new SpriteBatch();

		// Load assets
		assets = new Assets();

		// Initialize Renderer and Controller
		worldRenderer = new WorldRenderer();
		worldController = new WorldController();
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		worldRenderer.render(batch);
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		worldRenderer.dispose();
	}
}
