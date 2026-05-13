/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{
    
    static Picture vette = new Picture("images/Corvette.png");
    static Picture vette2 = new Picture("images/Corvette.png");
    static Picture vette3 = new Picture("images/Corvette.png");
    static Picture vette4 = new Picture("images/Corvette.png");
    static Picture vette5 = new Picture("images/Corvette.png");
    static Picture vette6 = new Picture("images/Corvette.png");
    static Picture C7 = new Picture("images/C7.jpg");
    static Picture Canvas = new Picture("images/Canvas.jpg");
    
    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      
      

       copyToCanvasBetter(vette, Canvas, 0, 0);
       sideways();
       copyToCanvasBetter(vette, Canvas, 1300, 0);
       topways();
       copyToCanvasBetter(vette2, Canvas, 2600, 0);
       blend();
       copyToCanvasBetter(vette3, Canvas, 0, 900);
       recursion(vette4);
       copyToCanvasBetter(vette4, Canvas, 1300, 900);
       flip();
       copyToCanvasBetter(vette6, Canvas, 2600, 900);
       
     Canvas.explore();
     Canvas.write("images/FinalProject.jpg");
     
  }//main
      // method for flipping over horizontal
  public static void sideways()
  {
      int width = vette.getWidth();
      int mirror = width/2;
      
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      for (int y = 0; y < vette.getHeight(); y++)
          for ( int x = 0; x < mirror; x++)
          {
              leftPixel = vette.getPixel(x,y);
              rightPixel = vette.getPixel(width -1 -x, y);
              rightPixel.setColor(leftPixel.getColor());
          }
              
  }
  public static void topways()
  {
      int height = vette2.getHeight();
      int mirror = height/2;
      
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      
      for (int x = 0; x < vette2.getWidth(); x++)
          for ( int y = 0; y < mirror; y++)
          {
              topPixel = vette2.getPixel(x,y);
              bottomPixel = vette2.getPixel(x, height -1 - y);
              bottomPixel.setColor(topPixel.getColor());
          }
              
  }
  public static void blend()
  {
      Pixel Pixel1 = null, Pixel2 = null;
      for (int x = 0; x < vette3.getWidth(); x++)
          for ( int y = 0; y < vette3.getHeight(); y++)
          {
             Pixel1 = vette3.getPixel(x,y);
             int redp = Pixel1.getRed();
             int bluep = Pixel1.getBlue();
             int greenp = Pixel1.getGreen();
             Pixel2 = C7.getPixel((int)(12.0/13 * x ), (int)(793.0/900 * y) );
             int redc = Pixel2.getRed();
             int bluec = Pixel2.getBlue();
             int greenc = Pixel2.getGreen();
             Pixel1.setRed((redp+redc)/2);
             Pixel1.setBlue((bluep+bluec)/2);
             Pixel1.setGreen((greenp+greenc)/2);
          }
          System.out.println(  (int)(12.0/13 * vette3.getWidth()) + ", " +(int)(793.0/900 * vette3.getHeight()) );  
  }
  public static void recursion(Picture pic)
    {
        // Base case is handled by the if-check before recursive call
        Pixel pixel1 = null, pixel2 = null;
    
        for (int x = 0; x < pic.getWidth(); x += 2)
        {
            for (int y = 0; y < pic.getHeight(); y += 2)
            {
                pixel1 = pic.getPixel(x, y);
                pixel2 = vette4.getPixel(x / 2, y / 2); 
                pixel2.setColor(pixel1.getColor());
            }
        }
    
        if (pic.getWidth() / 2 > 50)
        {
            Picture crop = new Picture(pic.getWidth() / 2, pic.getHeight() / 2);
            for (int x = 0; x < crop.getWidth(); x++)
            {
                for (int y = 0; y < crop.getHeight(); y++)
                {
                    crop.getPixel(x, y).setColor(vette4.getPixel(x, y).getColor());
                }
            }
            recursion(crop);
        }
    }
  public static void flip()
  {
      Pixel Pixel1 = null, Pixel2 = null;
 
      for (int x = 0; x < vette3.getWidth(); x++)
          for ( int y = 0; y < vette3.getHeight(); y++)
          {
              Pixel1 = vette5.getPixel(x,y);
              Pixel2 = vette6.getPixel(vette6.getWidth()-x-1, vette6.getHeight()-y-1);
              Pixel2.setColor(Pixel1.getColor());
          }
            
  }
              
  
  public static void copyToCanvasBetter(Picture source, Picture target, int x, int y)
  {
      Pixel sourcePix = null;
      Pixel targetPix = null;
      
      for (int sourceX = 0, targetX = x; sourceX< source.getWidth(); sourceX++, targetX++)
      {
          for (int sourceY = 0, targetY = y; sourceY< source.getHeight(); sourceY++, targetY++)
          {
              sourcePix = source.getPixel(sourceX, sourceY);
              targetPix = target.getPixel(targetX, targetY);
              targetPix.setColor(sourcePix.getColor());
          }
      }
  }
}//class