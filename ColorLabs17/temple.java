
/**
 * Write a description of class temple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class temple
{
    public static void main(String [] args)
    {
        Picture temple = new Picture("images/temple.jpg");
        Pixel[] pixels;
        pixels = temple.getPixels();
        temple.explore();        
        //x (15, 538)
        //y (27, 160)
        int width = temple.getWidth();
          int mirror = width/2;
      
          Pixel leftPixel = null;
          Pixel rightPixel = null;
      
          for (int y = 27; y < 161; y++)
              for ( int x = 15; x < 538; x++)
              {
                  leftPixel = temple.getPixel(x,y);
                  rightPixel = temple.getPixel(width -1 -x, y);
                  rightPixel.setColor(leftPixel.getColor());
              }
        temple.explore();
    }
}
