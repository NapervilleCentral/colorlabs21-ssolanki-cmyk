
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * Shivom Solanki
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         String fileName = FileChooser.pickAFile();
         Picture Stupid = new Picture("images/StupidPic.jpg");
         //Stupid.explore();
         
         //change with selfie picture
         Picture me = new Picture("images/StupidPic.jpg");
         Picture me1 = new Picture("images/StupidPic.jpg");
         Picture me2 = new Picture("images/StupidPic.jpg");
         Picture me3 = new Picture("images/StupidPic.jpg");
         Picture me4 = new Picture("images/StupidPic.jpg");
         Picture me5 = new Picture("images/StupidPic.jpg");
         Picture me6 = new Picture("images/StupidPic.jpg");
         
         Pixel[] pix1;
         pix1 = me1.getPixels();
         Pixel[] pix2;
         pix2 = me2.getPixels();
         Pixel[] pix3;
         pix3 = me3.getPixels();
         Pixel[] pix4;
         pix4 = me4.getPixels();
         Pixel[] pix5;
         pix5 = me5.getPixels();
         Pixel[] pix6;
         pix6 = me6.getPixels();
         
         Color red = new Color(186,41,28);
         Color blueish = new Color(98,112,148);
         Color Dblue = new Color(10, 10 ,30);
         Color white = new Color (242, 229, 170);
         
         //getting into the greyscale of the picture
         for (Pixel pixelobj : pix1){
             int redp = pixelobj.getRed();
             int bluep = pixelobj.getBlue();
             int greenp = pixelobj.getGreen();
             int avg = (redp + bluep + greenp)/3;
             pixelobj.setRed(avg);
             pixelobj.setBlue(avg);
             pixelobj.setGreen(avg);
             
         }
         //me1.explore();
         
         /**
          * method 1 change
          * 
          */
           for (Pixel pixelObj : pix1)
        {
            int redValues = pixelObj.getRed();
            if (redValues < 64){
                pixelObj.setColor(Dblue);
            }
            else if (redValues < 128){
                pixelObj.setColor(red);
            }
            else if (redValues < 196){
                pixelObj.setColor(blueish);
            }
            else{
                pixelObj.setColor(white);
            }
        }
        //me1.explore();

         /**
          * method 2 change
          * 
          */
        int min  = 260;
        int max = 0;
        int redVal = 0;
        int greenVal = 0;
        int blueVal = 0;
        
        for (Pixel pixelobj : pix2){
             int redp = pixelobj.getRed();
             int bluep = pixelobj.getBlue();
             int greenp = pixelobj.getGreen();
             int avg = (redp + bluep + greenp)/3;
             if (avg >= max){
                 max = avg;
             }
             if (avg <= min){
                 min = avg;
             }
             
         }
         for (Pixel pixelObj : pix2)
        {
            redVal = pixelObj.getRed();
            greenVal = pixelObj.getGreen();
            blueVal = pixelObj.getBlue();
            int avg = (redVal + greenVal + blueVal)/3;
            
            if (avg < (int)((max-min)/4)){
                pixelObj.setColor(Dblue);
            } else if (avg < (int)(2*(max-min)/4)){
                pixelObj.setColor(red);
            }else if (avg < (int)(3*(max-min)/4)){
                pixelObj.setColor(blueish);
            }
            else{
                pixelObj.setColor(white);
            }
        }
        //me2.explore();

         
         /**
          * custom color palette
          */
        Color redish = new Color(156,41,28);
        Color Greenish = new Color(41,156,28);
        Color tan = new Color(233,211,174);
        for (Pixel pixelobj : pix3){
             int redp = pixelobj.getRed();
             int bluep = pixelobj.getBlue();
             int greenp = pixelobj.getGreen();
             int avg = (redp + bluep + greenp)/3;
             if (avg >= max){
                 max = avg;
             }
             if (avg <= min){
                 min = avg;
             }
             pixelobj.setRed(avg);
             pixelobj.setBlue(avg);
             pixelobj.setGreen(avg);
         }
         for (Pixel pixelObj : pix3)
        {
            redVal = pixelObj.getRed();
            if (redVal < 60){
                pixelObj.setColor(Dblue);
            } else if (redVal < 120){
                pixelObj.setColor(Greenish);
            }else if (redVal < 190){
                pixelObj.setColor(tan);
            }
            else{
                pixelObj.setColor(white);
            }
        }
        //me3.explore();
        me3.write("images/SFTry1.jpg");
        
        for (Pixel pixelobj : pix4){
             int redp = pixelobj.getRed();
             int bluep = pixelobj.getBlue();
             int greenp = pixelobj.getGreen();
             int avg = (redp + bluep + greenp)/3;
             if (avg >= max){
                 max = avg;
             }
             if (avg <= min){
                 min = avg;
             }
             pixelobj.setRed(avg);
             pixelobj.setBlue(avg);
             pixelobj.setGreen(avg);
         }
         for (Pixel pixelObj : pix4)
        {
            redVal = pixelObj.getRed();
            if (redVal < 60){
                pixelObj.setColor(Dblue);
            } else if (redVal < 90){
                pixelObj.setColor(blueish);
            } else if (redVal < 120){
                pixelObj.setColor(Greenish);
            }else if (redVal < 190){
                pixelObj.setColor(tan);
            }
            else{
                pixelObj.setColor(white);
            }
        }
        //me4.explore();
        me4.write("images/SFTry2.jpg");
        
        Color tan2 = new Color(228,206,169);
        Color Dtan = new Color(208,186,149);
        
        for (Pixel pixelobj : pix5){
             int redp = pixelobj.getRed();
             int bluep = pixelobj.getBlue();
             int greenp = pixelobj.getGreen();
             int avg = (redp + bluep + greenp)/3;
             if (avg >= max){
                 max = avg;
             }
             if (avg <= min){
                 min = avg;
             }
             pixelobj.setRed(avg);
             pixelobj.setBlue(avg);
             pixelobj.setGreen(avg);
         }
         for (Pixel pixelObj : pix5)
        {
            redVal = pixelObj.getRed();
            if (redVal < 60){
                pixelObj.setColor(Dblue);
            } else if (redVal < 90){
                pixelObj.setColor(blueish);
            } else if (redVal < 120){
                pixelObj.setColor(Greenish);
            } else if (redVal < 150){
                pixelObj.setColor(Dtan);
            }else if (redVal < 190){
                pixelObj.setColor(tan2);
            }
            else{
                pixelObj.setColor(white);
            }
        }
        me5.explore();
        me5.write("images/SFTry3.jpg");
        
        for (Pixel pixelobj : pix6){
             int redp = pixelobj.getRed();
             int bluep = pixelobj.getBlue();
             int greenp = pixelobj.getGreen();
             int avg = (redp + bluep + greenp)/3;
             if (avg >= max){
                 max = avg;
             }
             if (avg <= min){
                 min = avg;
             }
             pixelobj.setRed(avg);
             pixelobj.setBlue(avg);
             pixelobj.setGreen(avg);
         }
         for (Pixel pixelObj : pix6)
        {
            redVal = pixelObj.getRed();
            if (redVal < 60){
                pixelObj.setColor(Dblue);
            } else if (redVal < 90){
                pixelObj.setColor(blueish);
            } else if (redVal < 120){
                pixelObj.setColor(Greenish);
            } else if (redVal < 160){
                pixelObj.setColor(Dtan);
            }else if (redVal < 190){
                pixelObj.setColor(tan2);
            }
            else{
                pixelObj.setColor(white);
            }
        }
        me6.explore();
        me6.write("images/SFmyFinal.jpg");
    }//main       
}//class