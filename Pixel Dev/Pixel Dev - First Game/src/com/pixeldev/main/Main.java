package com.pixeldev.main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame {
	private GameState jeu;
	private AppGameContainer container;

	public Main() {
		super("Mon premier jeu");
	} 

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		if (container instanceof AppGameContainer) {
			this.container = (AppGameContainer) container;
		}
		jeu = new GameState();
		container.setShowFPS(true);
		addState(jeu);
	}

	public static void main(String[] args) {
		try {
			AppGameContainer container = new AppGameContainer(new Main());
			container.setDisplayMode(1280, 720, false);
			
			container.setTargetFrameRate(120);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		} 
	}
}
