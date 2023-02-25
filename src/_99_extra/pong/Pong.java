package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 800;
    
    int ballX = 400;
    int ballY = 400;
    int ballXS = 10;
    int ballYS = 5;
    int paddleX = 350;
    int paddleY = 720;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(0,0,0);
    	fill(0,0,255); 
    	stroke(0,0,255);
    	ellipse(ballX, ballY,25,25);
    	ballX -= ballXS;
    	ballY -= ballYS;
    	if(ballX > WIDTH || ballX < 0){
    	    ballXS = -ballXS;
    	}
    	if(ballY > HEIGHT || ballY < 0) {
    		ballYS = -ballYS;
    	}
    	rect(paddleX, paddleY, 100, 40);
    	
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}