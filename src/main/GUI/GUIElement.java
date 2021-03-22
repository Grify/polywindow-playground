package main.GUI;

import vmath.vector2;

public abstract class GUIElement {
	
	public vector2 position;
	public vector2 scale;
	
	//that's nice
	public GUIElement(double x, double y, double sx, double sy){
		position = new vector2(x, y);
		scale = new vector2(sx, sy);
	}
	
	public GUIElement(vector2 position, vector2 scale){
		this.position = position;
		this.scale = scale;
	}
	//^ solid foundatiom
	//██████  ██████   █████  ██     ██ 
	//██   ██ ██   ██ ██   ██ ██     ██ 
	//██   ██ ██████  ███████ ██  █  ██ 
	//██   ██ ██   ██ ██   ██ ██ ███ ██ 
	//██████  ██   ██ ██   ██  ███ ███  
	
	public abstract void draw();
	
	//██    ██ ██████  ██████   █████  ████████ ███████ 
	//██    ██ ██   ██ ██   ██ ██   ██    ██    ██      
	//██    ██ ██████  ██   ██ ███████    ██    █████ 
	//██    ██ ██      ██   ██ ██   ██    ██    ██    
	// ██████  ██      ██████  ██   ██    ██    ███████ 
	
	public abstract void update();
	
}
