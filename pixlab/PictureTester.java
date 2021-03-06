/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  //  Method to test keepOnlyBlue
  public static void testKeepOnlyBlue()
  {
	Picture beach = new Picture("beach.jpg");
	//beach.explore();
	beach.keepOnlyBlue();
	beach.explore();
  }


  //  Method to test negate
  public static void testNegate()
  {
	Picture beach = new Picture("beach.jpg");
	beach.negate();
	beach.explore();
  }


  //  Method to test grayscale
  public static void testGrayscale()
 {
	Picture beach = new Picture("beach.jpg");
	beach.grayscale();
	beach.explore();
	beach.grayscaleAverage();
        beach.explore();
	beach.grayscaleLightness();
        beach.explore();
	beach.grayscaleLuminosity();
        beach.explore();
  }

  public static void testFixUnderwater()
  {
	Picture water = new Picture("water.jpg");
	water.explore();
	water.fixUnderwater();
	water.explore();
  }


  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }


  //  Method to test mirrorVerticalRightToLeft
  public static void testMirrorVerticalRightToLeft()
  {
	Picture caterpillar = new Picture("caterpillar.jpg");
	caterpillar.mirrorVerticalRightToLeft();
	caterpillar.explore();
  }


  //  Method to test mirrorHorizontal
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }


  //  Method to test mirrorHorizontalBotToTop
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }

  
  //  Method to test mirrorDiagonal
  public static void testMirrorDiagonal()
  {
	Picture beach = new Picture("beach.jpg");
	beach.mirrorDiagonal();
	beach.explore();
  }


  //  Method to test mirrorArms
  public static void testMirrorArms()
  {
	Picture snowman = new Picture("snowman.jpg");
	snowman.explore();
	snowman.mirrorArms();
	snowman.explore();
  }

  //  Method to test mirrorGull
  public static void testMirrorGull()
  {
	Picture seagull = new Picture("seagull.jpg");
	seagull.explore();
	seagull.mirrorGull();
	seagull.explore();
  }

  //  Method to test mirrorRectangle
  public static void testMirrorRectangle()
  {
	Picture seagull = new Picture("seagull.jpg");
	seagull.mirrorRectangle(235,240,321,345,true);
	seagull.explore();
  }


  //  Method to test secondCopy
  public static void testSecondCopy()
  {
	Picture beach = new Picture("beach.jpg");
	Picture seagull = new Picture("seagull.jpg");
	beach.secondCopy(seagull,235,240,321,345,235,240);
	beach.explore();
  }

  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  //  Method to test myCollage
  public static void testMyCollage()
  {
	Picture moon = new Picture("moon-surface.jpg");
	moon.myCollage();
	moon.explore();
  }



  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2();
    swan.explore();
  }


  public static void testBlur(int x, int y, int w, int h, int n)
  {
	Picture redMoto = new Picture("redMotorcycle.jpg");
	for(int i = 0; i < n; i++)
	{
		redMoto.blur(x,y,w,h);
	}
	redMoto.explore();
  }



  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run


    testBlur(180,160,25,25,10);

/*    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    testMyCollage();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    testSecondCopy();
    testMirrorRectangle();    
    testMirrorDiagonal();
    //testCollage();
    //testCopy();
    testEdgeDetection();
    testEdgeDetection2();
*/    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
