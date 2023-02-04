package _02_boolean._5_googly_eyes;

import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Put googly eyes on a face!
 * 
 * Instructions:
 * 1. Find an image on the Internet and drop it into the /images folder at the
 *    top level of this module. It can be anything as long as it has large eyes!
 * 
 * 2. Declare a variable for the image:
 *    PImage face;
 * 
 * 3. In your setup() method, import your image using the following code:
 *    face = loadImage("face.jpg");
 * 
 * 4. Resize your face image to the size of the window using the resize() method.
 * 
 * 5. In the draw() method, place a white ellipse over the left eye of your image.
      HINT: To find out where to put it, add code to print the mouseX and
      mouseY where you click the mouse.
 *
 * 6. Now add a pupil (the black part) to the left eye.
 * 
 * 7. Use mouseX and mouseY to move the left pupil where the mouse moves.
 * 
 * 8. Repeat the same steps for the right eye.
 * 
 * 9. Add a right pupil and make it move by using
 *    mouseX + [distance from left eye] and mouseY + [distance from left eye].
 * 
 * 10.Here’s the tricky part: stop the pupils from going outside of the white
 *    circles! To do this, imagine a rectangle that the pupil should stay
 *    within. When mouseX and mouseY goes outside of these bounds, set it back
 *    to the boundary. Put this code before you draw the pupils.
 */
public class GooglyEyes extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    PImage face;
    int pupilX = mouseX;
    int pupilY = mouseY;
    int pupilx = mouseX + 237;
    int pupily = mouseY + 3;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    
    @Override
    public void setup() {
    	face = loadImage("bigEyes.jpeg"); 
    	face.resize(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
    	background(face);
    	fill(255,255,255);
    	ellipse(177,301,120,120);
    	ellipse(395,299,120,120);
    	
    	
    	fill(000000);
    	int drawposX = mouseX;
    	int drawposY = mouseY;
if(mouseX > 237 || mouseX < 117 || mouseY >361 || mouseY<241) {
    		
    		drawposX=175;
    		drawposY=300;
    		System.out.println("Works");
    		
    	}
    	ellipse(drawposX, drawposY, 50,50);
    	ellipse(drawposX+237, drawposY + 3, 50, 50);
    	
    	
    	//    	if (pupilX > 237 || pupilX < 117 || pupilY >361 || pupilY < 241 || pupilx > 455 || pupilx < 335 || pupily > 359 || pupily < 239) {
//    		
//    		pupilX = 237;
//    		pupilY = 361;
//    		pupilx = 395;
//    		pupily = 299;
//    		
//    	}
//    	pupilX = mouseX;
//    	pupilY = mouseY;
//    	pupilx = mouseX + 237;
//    	pupily = mouseY + 3;
    	
    	
    		
    	
    	
    	
    }

    static public void main(String[] args) {
        PApplet.main(GooglyEyes.class.getName());
    }
}
