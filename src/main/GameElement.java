package main;

import basewindow.InputCodes;

import static main.Playground.window;

public class GameElement {
	
	public double[] position;
	
	//██████  ██████   █████  ██     ██ 
	//██   ██ ██   ██ ██   ██ ██     ██ 
	//██   ██ ██████  ███████ ██  █  ██ 
	//██   ██ ██   ██ ██   ██ ██ ███ ██ 
	//██████  ██   ██ ██   ██  ███ ███  
	
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
	
	public void update() {
		double deltaTime = window.frameFrequency;
	
		
	}
}
