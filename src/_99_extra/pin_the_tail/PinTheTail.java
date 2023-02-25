package _99_extra.pin_the_tail;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import processing.core.PApplet;
import processing.core.PImage;

public class PinTheTail extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    PImage donkey;
    PImage tail;
    int Tailx;
	int Taily;
	boolean hasPlaced = false;
    @Override
    public void settings() {
    	size(WIDTH, HEIGHT); 
    }

    @Override
    public void setup() {
    	donkey = loadImage("donkey.jpg");      //change the file name if you need to
    	tail = loadImage("tail.png");  
    	donkey.resize(WIDTH,HEIGHT );
    	tail.resize(80, 80);  
    }


    public void draw() {
    	
    	background(0,0,0);
    	
    	rect(0, 0, 30, 30);
    	
    	
    	if(dist(0, 0, mouseX, mouseY) < 30) {
    		background (donkey);
    	
    		
    		
    	}
    	if(mousePressed && ! hasPlaced) {
    		Tailx = mouseX;
    		Taily= mouseY;
    		hasPlaced = true;
    	}
    	if(hasPlaced == true){
    		image(tail, Tailx, Taily);
    		background (donkey);
    	
    		image(tail, Tailx, Taily);
    		
    	}
    	else {
    		image(tail, mouseX-10, mouseY-20);
       		
    	}
    	if(dist(705, 205, Tailx, Taily) < 40) {
    		playWhoohoo();
    		
    	}
    	
    	
    	
    	
    	
    }
    

    

    static public void main(String[] args) {
        PApplet.main(PinTheTail.class.getName());
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    Clip clip = null;

    public void playDoh() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-doh.wav");
        }
    }

    public void playWhoohoo() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-woohoo.wav");
        }
    }

    public Clip getSong(String fileName) {
        String path = "src/";
        Clip clip = null;

        // Note: use .wav files
        try {
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path + fileName));
            clip.open(inputStream);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " for " + path + fileName);
        }

        return clip;
    }

    public Clip playSound(String fileName) {
        final Clip clip = getSong(fileName);

        new Thread(new Runnable() {
            @Override
            public void run() {
                clip.start();
            }
        }).start();

        return clip;
    }
}
