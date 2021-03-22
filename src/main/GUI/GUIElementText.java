package main.GUI;

import main.Game;
import main.Playground;
import vmath.vector2;
import vmath.vector3;
import vmath.vector4;

public class GUIElementText extends GUIElement {
	public vector3 color;
	public String text;
	public GUIElementText(double x, double y, double sx, double sy, String text, vector3 color) {
		super(x, y, sx, sy);
		this.text = text;
		this.color = color;
	}
	
	public GUIElementText(vector2 position, vector2 scale, String text, vector3 color) {
		super(position, scale);
		this.text = text;
		this.color = color;
	}
	
	@Override
	public void draw() {//position.x
		
		Playground.game.setColor(color);
		Playground.window.fontRenderer.drawString(this.position.x , this.position.y, this.scale.x, this.scale.y,
				this.text);
	}
	
	@Override
	public void update() {
	
	}
}
