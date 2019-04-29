import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }


  // Method to set red and green values to 0
  public void keepOnlyBlue()
  {
	Pixel[][] pixels = this.getPixels2D();
	for(Pixel[] rowArray : pixels)
	{
		for(Pixel pixelObj : rowArray)
		{
			pixelObj.setRed(0);
			pixelObj.setGreen(0);
		}
	}
  }


  // Method to negate all the pixels
  public void negate()
  {
	Pixel[][] pixels = this.getPixels2D();
	for(Pixel[] rowArray : pixels)
	{
		for(Pixel pixelObj : rowArray)
		{
			pixelObj.setRed(255 - pixelObj.getRed());
			pixelObj.setGreen(255 - pixelObj.getGreen());
			pixelObj.setBlue(255 - pixelObj.getBlue());
		}
	}
  }


  // Method to turn picture into shades of gray
  public void grayscale()
  {
	Pixel[][] pixels = this.getPixels2D();
	for(Pixel[] rowArray : pixels)
	{
		for(Pixel pixelObj : rowArray)
		{
			int avg = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue())/3;
			pixelObj.setRed(avg);
			pixelObj.setGreen(avg);
			pixelObj.setBlue(avg);
		}
	}
  }


  // Method to make the fish easier to see
  public void fixUnderwater()
  {
	Pixel[][] pixels = this.getPixels2D();
	for(Pixel[] rowArray : pixels){
		for(Pixel pixelObj : rowArray){
			if(pixelObj.getRed() < 20 && pixelObj.getCol() < 479 &&
			  pixelObj.getRow() < 153){
				pixelObj.setBlue(255);
				pixelObj.setGreen(pixelObj.getGreen() + 20);
			}
		}
	}
  }


  // Alternative methods to gray scale
  public void grayscaleAverage() 
  {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] rowArray : pixels)
        {
                for(Pixel pixelObj : rowArray)
                {
			pixelObj.setGrayAverage();
                }
        }
  }

  public void grayscaleLightness()
  {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] rowArray : pixels)
        {
                for(Pixel pixelObj : rowArray)
                {
                        pixelObj.setGrayLightness();
                }
        }
  }

  public void grayscaleLuminosity()
  {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] rowArray : pixels)
        {
                for(Pixel pixelObj : rowArray)
                {
                        pixelObj.setGrayLuminosity();
                }
        }
  }


  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }


  //mirror a picture from right to left
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }


  //mirror a picture from top to bottom
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int height = pixels.length;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < height / 2; row++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[height - 1 - row][col];
        botPixel.setColor(topPixel.getColor());
      }
    }
  }


  //mirror a picture from bottom to top
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int height = pixels.length;
    for (int col = 0; col < pixels[0].length; col++)
    {
      for (int row = 0; row < height / 2; row++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[height - 1 - row][col];
        topPixel.setColor(botPixel.getColor());
      }
    }
  }


  //mirror a picture diagonally
  public void mirrorDiagonal()
  {
	Pixel[][] pixels = this.getPixels2D();
	Pixel lowerPixel = null;
	Pixel upperPixel = null;
	int dimension = Math.min(pixels.length, pixels[0].length);
	for(int row = 0; row < dimension; row++)
	{
		for(int col = 0; col <= row; col++)
		{
			lowerPixel = pixels[row][col];
			upperPixel = pixels[col][row];
			upperPixel.setColor(lowerPixel.getColor());
		}
	}
  }
								

  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }

    System.out.println("nested loop count is " + count);
  }


  //  Method to mirror the arms of the snowman
  public void mirrorArms()
  {
	int mirrorPoint = 191;
	Pixel top1Pixel = null;
	Pixel bot1Pixel = null;
	Pixel top2Pixel = null;
	Pixel bot2Pixel = null;
	Pixel[][] pixels = this.getPixels2D();

	for (int col = 102; col < 173; col++){
		for(int row = 156; row < mirrorPoint; row++){
			top1Pixel = pixels[row][col];
			bot1Pixel = pixels[mirrorPoint - row + mirrorPoint][col];
			bot1Pixel.setColor(top1Pixel.getColor());
		}
	}

	mirrorPoint = 195;
        for (int col = 238; col < 297; col++){
                for(int row = 171; row < mirrorPoint; row++){
                        top2Pixel = pixels[row][col];
                        bot2Pixel = pixels[mirrorPoint - row + mirrorPoint][col];
                        bot2Pixel.setColor(top2Pixel.getColor());
                }
        }
  
  }

  //  Method to mirror the seagull
  public void mirrorGull()
  {
	int mirrorPoint = 345;
	Pixel leftPixel = null;
	Pixel rightPixel = null;
	Pixel[][] pixels = this.getPixels2D();

	for(int row = 235; row < 322; row++){
		for(int col = 240; col < mirrorPoint; col++){
			leftPixel = pixels[row][col];
			rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			rightPixel.setColor(leftPixel.getColor());
		}
	}
  } 

  //  Method to refactor all of the mirror code (Challenge 4)
  public void mirrorRectangle(int x1, int y1, int x2, int y2, boolean vertical)
  {
	if(vertical){
		int mirrorPoint = y2;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		for(int row = x1; row < x2; row++){
			for(int col = y1; col < mirrorPoint; col++){
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}
	else{
		int mirrorPointH = x2;
                Pixel topPixel = null;
                Pixel botPixel = null;
                Pixel[][] pixelsH = this.getPixels2D();
                for(int col = y1; col < y2; col++){
                        for(int row = x1; row < mirrorPointH; row++){
                   		topPixel = pixelsH[row][col];
				botPixel = pixelsH[mirrorPointH - row + mirrorPointH][col];
				topPixel.setColor(botPixel.getColor());
                        }
                }

	}
  }


  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }


  public void secondCopy(Picture fromPic, int startFRow, int startFCol, 
    int endFRow, int endFCol, int startTRow, int startTCol)
  {
	Pixel fromPixel = null;
	Pixel toPixel = null;
	Pixel[][] toPixels = this.getPixels2D();
	Pixel[][] fromPixels = fromPic.getPixels2D();

	for (int fromRow = startFRow, toRow = startTRow; 
	  fromRow < endFRow && toRow < toPixels.length; fromRow++, toRow++)
	{
		for(int fromCol = startFCol, toCol = startTCol; 
		  fromCol < endFCol && toCol < fromPixels[0].length; 
		  fromCol++, toCol++)
		{
			fromPixel = fromPixels[fromRow][fromCol];
			toPixel = toPixels[toRow][toCol];
			toPixel.setColor(fromPixel.getColor());
		}
	}
  
  }



  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }


  //  Method to create my Collage
  public void myCollage()
  {
	Picture robot = new Picture("robot.jpg");
	Picture bigRobot = robot.scale(1.60,1.60);
	Picture caterpillar = new Picture("caterpillar.jpg");
	Picture smallCater = caterpillar.scale(0.48,0.48);
        Picture mirrorHCater = new Picture(smallCater);
	mirrorHCater.mirrorHorizontal();
        Picture mirrorVCater = new Picture(smallCater);
        mirrorVCater.mirrorVertical();
	Picture negativeRobot = new Picture(bigRobot);
	negativeRobot.negate();
	Picture blueRobot = new Picture(bigRobot);
	blueRobot.keepOnlyBlue();
	this.copy(negativeRobot,0,0);
	this.copy(bigRobot,bigRobot.getHeight(),0);
	this.copy(blueRobot,2*bigRobot.getHeight(),0);
	this.copy(caterpillar,this.getHeight()-147, 0);
	this.copy(mirrorHCater,this.getHeight()-mirrorHCater.getHeight(),
	  caterpillar.getWidth());
        this.copy(mirrorVCater,this.getHeight()-mirrorVCater.getHeight(),
          caterpillar.getWidth()+mirrorHCater.getWidth());
	this.write("myCollage.jpg");
		
  }

  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }

    Pixel topPixel = null;
    Pixel botPixel = null;
    Pixel[][] pixelsV = this.getPixels2D();
    Color botColor = null;
	for(int col = 0; col < pixelsV[0].length; col++){
		for(int row = 0; row < pixelsV.length-1; row++){
			topPixel = pixelsV[row][col];
			botPixel = pixelsV[row+1][col];
			botColor = botPixel.getColor();
			if(topPixel.colorDistance(botColor) > edgeDist)
				topPixel.setColor(Color.BLACK);
			else
				topPixel.setColor(Color.WHITE);
		}
	}

  }


  //  Method for another algorithm for edge detection
  public void edgeDetection2()
  {
    Pixel pix = null;
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0;
           col < pixels[0].length; col++)
      {
	   pix = pixels[row][col];
	   if(pix.getRed() > 50 && pix.getGreen() > 50 && pix.getBlue() > 50)
		pix.setColor(Color.WHITE);
	   else
		pix.setColor(Color.BLACK);
      }
    }

  } 
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
/*    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
    Picture temple = new Picture("temple.jpg");
    temple.mirrorTemple();
    temple.explore();
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms(); 
    snowman.explore();
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
*/

    Picture beach = new Picture("beach.jpg");
    beach.createCollage();
    beach.explore();
    Picture swan = new Picture("swan.jpg");
    Picture moon = new Picture("moon-surface.jpg");
    Picture robot = new Picture("robot.jpg");
    Picture water = new Picture("water.jpg");
    swan.explore();
    robot.explore();
    moon.explore();
    water.explore();

  }
  
} // this } is the end of class Picture, put all new methods before this
