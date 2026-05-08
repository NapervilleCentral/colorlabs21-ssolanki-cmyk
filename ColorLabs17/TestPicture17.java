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
    static Picture Canvas = new Picture("images/Canvas.jpg");
    
    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      
      //opens picture using a dialog box
      /*
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
     */

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //relative path!!!! (ON TEST)
     //                          dir/folder/file
     //Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture moto = new Picture("images/redMotorcycle.jpg");
     Picture motoOG = new Picture("images/redMotorcycle.jpg");
     Picture moto2 = new Picture("images/redMotorcycle.jpg");
     Picture moto3 = new Picture("images/redMotorcycle.jpg");
     Picture moto4 = new Picture("images/redMotorcycle.jpg");
     Picture moto5 = new Picture("images/redMotorcycle.jpg");
     
     //Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");

     //displays the picture
     //apic.explore();
     //ferris1.explore();
     //moto.explore();
     
     //makes an array of pixels
     Pixel[] pixels;
     
     //gets pixels from picture and assigns to pixels array
     pixels = ferris1.getPixels();
     Pixel[] Mpixels;
     Mpixels = moto.getPixels();
     
     Pixel[] Mpixels2;
     Mpixels2 = moto2.getPixels();
     
     Pixel[] Mpixels3;
     Mpixels3 = moto3.getPixels();
     
     Pixel[] Mpixels4;
     Mpixels4 = moto4.getPixels();
     
     Pixel[] Mpixels5;
     Mpixels5 = moto5.getPixels();
     
     
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );
    
    /**/
    /*
        //access each index
    System.out.println(pixels[17]);
    //access each pixel
    Pixel spot = ferris1.getPixel(100,100);
    Pixel spot2 = ferris1.getPixel(433,283);
    Pixel ferr17 = pixels[17];
    
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    
    Color newColor = new Color(255, 99, 71);
    
    ferr17.setRed(240);
    ferr17.setGreen(100);
    ferr17.setBlue(200);
    
    spot.setColor(newColor);
    spot2.setColor(newColor);
    //ferris1.explore();
    */
    for (int i = 0; i < 50000; i++)
    {
        Pixel yuck = ferris1.getPixel((int)(Math.random()*1000), (int)(Math.random()*668));
        yuck.setColor(Color.orange);
    }
    //ferris1.explore();
    int Ored = 0, Ogreen = 0, Oblue = 0;
    for (Pixel p : Mpixels){
        Ored = p.getRed();
        Ogreen = p.getGreen();
        Oblue = p.getBlue();
        p.setRed(Ored);
        p.setGreen(Ogreen);
        p.setBlue(Oblue);
        
    }
    System.out.println(Ored);
    /*

   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    for (Pixel spot : pixels)
    System.out.println( spot );


   
 /**/
 int red, green, blue;
 



 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /**/ 
    //write/save a picture as a file
    /*
    ferris1.write("images/ferris11.jpg");
    motoOG.explore();
    /**/
    /*
    int avg;
    for(Pixel p : Mpixels){
        red = p.getRed();
        green = p.getGreen();
        blue = p.getBlue();
        avg = (red+green+blue)/3;
        p.setRed(avg);
        p.setBlue(avg);
        p.setGreen(avg);
        
    }
    moto.explore();
    for(Pixel spot1: Mpixels2){
     red = spot1.getRed();
     red = (int)(red* 1.25);
     spot1.setRed(red);
     
     }
    moto2.explore();
    for(Pixel p: Mpixels3){
         red = p.getRed();
         green = p.getGreen();
         blue = p.getBlue();
         p.setRed(255-red);
         p.setGreen(255-green);
         p.setBlue(255-blue);
    }
    moto3.explore();
    for(Pixel p: Mpixels4){
        red = p.getRed();
        green = p.getGreen();
        blue = p.getBlue();
        p.setRed(red+35);
        p.setGreen(green+35);
        p.setBlue(blue+35);
    }
    moto4.explore();
    for(Pixel p: Mpixels5){
        red = p.getRed();
        green = p.getGreen();
        blue = p.getBlue();
        if (red >= 105 && red <= 160 && green >= 140 && green <= 170 && blue >= 40 && blue <= 80){
            blue = blue*7;
        }
        p.setRed(red);
        p.setBlue(blue);
        p.setGreen(green);
    }
    moto5.explore();
    */
   System.out.println("Canvas width: " + Canvas.getWidth());
System.out.println("Canvas height: " + Canvas.getHeight());
System.out.println("Vette width: " + vette.getWidth());
System.out.println("Vette height: " + vette.getHeight());

       copyToCanvasBetter(vette, Canvas, 0, 0);
       sideways();
       copyToCanvasBetter(vette, Canvas, 3840, 0);
       topways();
       copyToCanvasBetter(vette2, Canvas, 7680, 0);
       nullify();
       copyToCanvasBetter(vette3, Canvas, 0, 2160);
     Canvas.explore();
     
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
  public static void nullify()
  {
      Pixel Pixel = null;
      for (int x = 0; x < vette3.getWidth(); x++)
          for ( int y = 0; y < vette3.getHeight(); y++)
          {
              Pixel = vette3.getPixel(x,y);
              int redp = Pixel.getRed();
             int bluep = Pixel.getBlue();
             int greenp = Pixel.getGreen();
             Pixel.setRed(255-redp);
             Pixel.setBlue(255-bluep);
             Pixel.setGreen(255-greenp);
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