//select the class in the file explorer panel and do shift+F6 to rename

package main;

import basewindow.ComputerFileManager;
import basewindow.IDrawer;
import basewindow.IUpdater;
import basewindow.IWindowHandler;
import lwjglwindow.LWJGLWindow;

import java.io.File;
import java.util.ArrayList;
//cool
public class Playground {
	public static Game game = new Game();
	public static LWJGLWindow window;
	public static void main(String[] args){
		//LWJGLWindow params: name, width, height, depth#
		window = new LWJGLWindow("Tanks", 1400, 900, game.absoluteDepthBase, game, game, game, true, false);//window = new LWJGLWindow("Tanks", 1400, 900, Game.absoluteDepthBase, new GameUpdater(), new GameDrawer(), new GameWindowHandler(), Game.vsync, !Panel.showMouseTarget);
		//window.setShadowQuality(0);
		window.useShader = false;
		window.run();
		boolean relaunch = System.getProperties().toString().contains("Mac OS X");
		
		for (int i = 0; i < args.length; i++){
			if (args[i].equals("mac") || args[i].equals("no_relaunch"))
				relaunch = false;
		}
	}
}
