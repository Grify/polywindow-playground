package main;

import basewindow.IDrawer;
import basewindow.IUpdater;
import basewindow.IWindowHandler;
import basewindow.InputCodes;
import main.GUI.GUIElementText;
import vmath.vector2;
import vmath.vector3;
import vmath.vector4;

import static main.Playground.window;

public class Game implements IDrawer, IUpdater, IWindowHandler {
	//initial variables
	public static int absoluteDepthBase = 4;
	public boolean mouseVisible = false;
	public GUIElementText textthign = new GUIElementText(0,0,1,1,"stirng",new vector3(100,100,100));
	//██████  ██████   █████  ██     ██ 
	//██   ██ ██   ██ ██   ██ ██     ██ 
	//██   ██ ██████  ███████ ██  █  ██ 
	//██   ██ ██   ██ ██   ██ ██ ███ ██ 
	//██████  ██   ██ ██   ██  ███ ███  
	@Override
	public void draw() {
		window.drawRect(98,98,24,24);
		window.drawRect(100,100,20,20);
		textthign.draw();
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
	public void setColor(vector3 color){
		if(color instanceof vector4) {
			window.setColor(color.x, color.y, color.z, ((vector4)color).q);
		}else {
			window.setColor(color.x, color.y, color.z);
		}
	}

}
