package com.mygdx.gameseven;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class GameSevenMain extends ApplicationAdapter {
	WorldRenderer worldRenderer;
	static Assets assets;

	@Override
	public void create () {
		// Load assets
		assets = new Assets();

		// Initialize Renderer
		worldRenderer = new WorldRenderer();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		worldRenderer.render();
	}
	
	@Override
	public void dispose () {
		worldRenderer.dispose();
	}
}
