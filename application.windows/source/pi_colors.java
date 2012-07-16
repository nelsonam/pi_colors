import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class pi_colors extends PApplet {

float x=0;
float y=0;

//for larger sizes, load in a data file and convert it into an array
int[] digits = {3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3,8,4,6,2,6,4,3,3,8,3,2,7,9,5,0,2,8,8,4,1,9,7,1,6,9,3,9,9,3,7,5,1,0,5,8,2,0,9,7,4,9,4,4,5,9,2,3,0,7,8,1,6,4,0,6,2,8,6,2,0,8,9,9, 8,6,2,8,0,3,4,8,2,5, 3,4,2,1,1,7,0,6,7,9};

int digit_index = 0;
//not use right now, in the fuuuuture
File file = new File("digits");


public void setup()
{
  size(500,500);
  background(255);
  smooth();
  noStroke();
  println(digits.length);
  for(x = 0; x < height; x+=50)
  {
    for (y = 0; y < width; y+=50)
    {
      if(digits[digit_index] == 1)
      {
       //fill(#F743AC); //pink 
       fill(0xffFF0000); //red  
      }
      else if(digits[digit_index] == 2)
      {
        fill(0xffFF8400); //orange
      }
      else if(digits[digit_index] == 3)
      {
        fill(0xffFFEE00); //yellow
        
      }
      else if(digits[digit_index] == 4)
      {
        fill(0xff00FF00); //green
      }
      else if(digits[digit_index] == 5)
      {
        fill(0xff00FFEE); //light blue
      }
      else if(digits[digit_index] == 6)
      {
        fill(0xff0000FF); //blue
      }
      else if(digits[digit_index] == 7)
      {
        fill(0xff3F00AB); //indigo
      }
      else if(digits[digit_index] == 8)
      {
        fill(0xff7C00A6); //violet
      }
      else if(digits[digit_index] == 9)
      {
        fill(0xffDE89FA); //lavender
      }
      else
      {
        fill(255);
      }
      //draws the boxes
      rect(y,x,50,50);
      //changes text color
      fill(0);
      //big lettars!
      textSize(24);
      //prints the digit
      text(digits[digit_index],y+20,x+30);
      textAlign(CENTER);
      //move on to next digit in list
      if(digit_index < digits.length-1)
      {
        digit_index++;
      } 
    }
  }
}
  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#F0F0F0", "pi_colors" });
  }
}
