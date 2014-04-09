package com.jemge.core;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.graphics.GL20;

public class JApplication implements ApplicationListener {
	public static final int WIDTH	= 800;
	public static final int HEIGHT	= 480;
	 
	public static void init(JApplication start) {
		new LwjglApplication(start, "Hrugger", WIDTH, HEIGHT);
	}
	
	public void create() {
		// TODO Auto-generated method stub
	}

	public void dispose() {
		// TODO Auto-generated method stub
	}

	public void pause() {
		// TODO Auto-generated method stub
	}

	public void render() {
		Gdx.gl.glClearColor(1f, 1f, 0.5f, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub
	}

	public void resume() {
		// TODO Auto-generated method stub
	}
}
