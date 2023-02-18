package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    PImage creeper;
    PImage minecraft;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
   
    @Override
    public void setup() {    
    	minecraft = loadImage("minecraft.png"); 
    	creeper=loadImage("creeper.png");  
    	creeper.resize(30, 20);
    	minecraft.resize(WIDTH, HEIGHT);    
    }
    
    @Override
    public void draw() {
    	
    	background(minecraft);
    	int crX = 550;
    	int crY = 275;
    	image(creeper, crX, crY);  
    	if(mousePressed) {
    		fill(255,0,0);
    		ellipse(mouseX, mouseY, 20,20);
    	}
    	if(isNear(550,mouseX)&&isNear(275,mouseY)) {
    		fill(0,255,0);
    		ellipse(mouseX,mouseY, 20, 20);
    	}
    }
    
    
    
    boolean isNear(int a, int b) {
		if (abs(a - b) < 10) {
		     return true;
		}
		else {
		     return false;
		}
	}
    
    
    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
}
