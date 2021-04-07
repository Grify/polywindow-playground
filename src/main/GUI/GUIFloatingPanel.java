package main.GUI;

import main.Game;
import main.Playground;
import vmath.vector2;
import vmath.vector3;
import vmath.vector4;

import java.util.ArrayList;

import static main.Playground.window;

public class GUIFloatingPanel extends GUIElement {
	public ArrayList<GUIElement> GUIElements = new ArrayList<>();
	
	public GUIFloatingPanel(vector2 position, vector2 scale, ArrayList<GUIElement> GUIElements) {
		super(position, scale);
		this.GUIElements = GUIElements;
	}
	
	@Override
	public void draw() {
		Playground.game.setColor(new vector4(200, 110, 50, 50));
		window.fillRect(position.x, position.y, scale.x, scale.y);
		for (GUIElement element: GUIElements){
			element.draw();
		}
	}
	
	@Override
	public void update() {
		for (GUIElement element: GUIElements){
			element.update();
		}
	}
}
