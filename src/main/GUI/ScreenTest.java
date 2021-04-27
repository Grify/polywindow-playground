package main.GUI;

import main.Playground;
import vmath.vector2;
import vmath.vector3;

import java.util.ArrayList;
import java.util.Arrays;

public class ScreenTest extends Screen {
	public GUIElementText TitleTextElement = new GUIElementText(new vector2(100, 100), new vector2(2, 2), "17hrust", new vector3(200, 110, 50));
	public GUIElementText tText = new GUIElementText(new vector2(50, 200), new vector2(2, 2), "hi2", new vector3(200, 110, 50));
	public GUIElementRect tRect = new GUIElementRect(new vector2(80, 205), new vector2(200, 10), new vector3(50, 110, 250));
	public GUIFloatingPanel pPanel = new GUIFloatingPanel(new vector2(0,0), new vector2(Playground.window.absoluteWidth,Playground.window.absoluteHeight), new ArrayList<GUIElement>(Arrays.asList(TitleTextElement, tText, tRect)));
	
	
	
	@Override
	public void draw() {
		pPanel.draw();
	}
	
	@Override
	public void update() {
		pPanel.update();
	}
}
