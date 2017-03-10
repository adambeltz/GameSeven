package com.mygdx.gameseven;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class GameSevenMain extends ApplicationAdapter {
	WorldRenderer worldRenderer;
	WorldController worldController;
	static Assets assets;




	@Override
	public void create () {

		// Load assets
		assets = new Assets();

		// Initialize Renderer and Controller
		worldController = new WorldController();
		worldRenderer = new WorldRenderer(worldController);

	}

	@Override
	public void render () {
		// set up hotswap
		if (Constants.RUNNING == false){
			Constants.RUNNING = true;
			dispose();
			Gdx.app.log("Create", "Create");
			create();
		}

		worldController.update(Gdx.graphics.getDeltaTime());
		Gdx.gl.glClearColor(1, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		worldRenderer.render();
	}
	
	@Override
	public void dispose () {

		worldRenderer.dispose();
	}
}
