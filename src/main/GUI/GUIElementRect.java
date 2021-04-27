package main.GUI;

import main.Game;
import main.Playground;
import vmath.vector2;
import vmath.vector3;
import vmath.vector4;

public class GUIElementRect extends GUIElement {
	public vector3 color;
	
	public GUIElementRect(double x, double y, double sx, double sy, vector3 color) {
		super(x, y, sx, sy);
		this.color = color;
	}
	
	public GUIElementRect(vector2 position, vector2 scale, vector3 color) {
		super(position, scale);
		this.color = color;
	}
	
	@Override
	public void draw() {//position.x
		
		Playground.game.setColor(color);
		Playground.window.fillRect(this.position.x, this.position.y, this.scale.x, this.scale.y);
	}
	
	@Override
	public void update() {
	
	}
}
