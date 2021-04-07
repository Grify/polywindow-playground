package main.GUI;

import vmath.vector2;
import vmath.vector3;

import java.util.ArrayList;
import java.util.Arrays;

public class ScreenTest extends Screen {
	public GUIElementText tText = new GUIElementText(new vector2(100, 100), new vector2(2, 2), "hi", new vector3(200, 110, 50));
	public GUIFloatingPanel pPanel = new GUIFloatingPanel(new vector2(-100,-100), new vector2(500,500), new ArrayList<GUIElement>(Arrays.asList(tText)));
	
	@Override
	public void draw() {
		pPanel.draw();
	}
	
	@Override
	public void update() {
		pPanel.update();
	}
}
