package main;

import basewindow.IDrawer;
import basewindow.IUpdater;
import basewindow.IWindowHandler;
import basewindow.InputCodes;

import static main.Playground.window;

public class Game implements IDrawer, IUpdater, IWindowHandler {
	//initial variables
	public static int absoluteDepthBase = 4;
	public boolean mouseVisible = false;
	//██████  ██████   █████  ██     ██ 
	//██   ██ ██   ██ ██   ██ ██     ██ 
	//██   ██ ██████  ███████ ██  █  ██ 
	//██   ██ ██   ██ ██   ██ ██ ███ ██ 
	//██████  ██   ██ ██   ██  ███ ███  
	@Override
	public void draw() {
		window.drawRect(98,98,24,24);
		window.drawRect(100,100,20,20);
			//window.fillRect(100,100,500,300);
	}
	//██    ██ ██████  ██████   █████  ████████ ███████ 
	//██    ██ ██   ██ ██   ██ ██   ██    ██    ██      
	//██    ██ ██████  ██   ██ ███████    ██    █████ 
	//██    ██ ██      ██   ██ ██   ██    ██    ██    
	// ██████  ██      ██████  ██   ██    ██    ███████
	@Override
	public void update() {
		double deltaTime = window.frameFrequency;
		if (window.pressedKeys.contains(InputCodes.KEY_ESCAPE)){
			quit();
		}
		if(window.pressedKeys.contains(InputCodes.KEY_P)){
			showCursor(true);
		}
		
	}
	//██     ██ ██ ███    ██ ██████   ██████  ██     ██      ██████ ██       ██████  ███████ ███████ 
	//██     ██ ██ ████   ██ ██   ██ ██    ██ ██     ██     ██      ██      ██    ██ ██      ██      
	//██  █  ██ ██ ██ ██  ██ ██   ██ ██    ██ ██  █  ██     ██      ██      ██    ██ ███████ █████ 
	//██ ███ ██ ██ ██  ██ ██ ██   ██ ██    ██ ██ ███ ██     ██      ██      ██    ██      ██ ██    
	// ███ ███  ██ ██   ████ ██████   ██████   ███ ███       ██████ ███████  ██████  ███████ ███████ 
	@Override
	public void onWindowClose() {

	}
	//██   ██ ███████ ██      ██████  ███████ ██████      ███████ ██    ██ ███    ██  ██████ ████████ ██  ██████  ███    ██ ███████ 
	//██   ██ ██      ██      ██   ██ ██      ██   ██     ██      ██    ██ ████   ██ ██         ██    ██ ██    ██ ████   ██ ██      
	//███████ █████   ██      ██████  █████   ██████      █████   ██    ██ ██ ██  ██ ██         ██    ██ ██    ██ ██ ██  ██ ███████ 
	//██   ██ ██      ██      ██      ██      ██   ██     ██      ██    ██ ██  ██ ██ ██         ██    ██ ██    ██ ██  ██ ██      ██ 
	//██   ██ ███████ ███████ ██      ███████ ██   ██     ██       ██████  ██   ████  ██████    ██    ██  ██████  ██   ████ ███████ 
	public void quit(){
		System.exit(0);
	}
	public boolean showCursor() {
		return mouseVisible;
	}
	public boolean showCursor(boolean visible) {
		mouseVisible = visible;
		window.setShowCursor(visible);
		return mouseVisible;
	}
	public boolean toggleShowCursor() {
		mouseVisible = !mouseVisible;
		window.setShowCursor(mouseVisible);
		return mouseVisible;
	}
}
