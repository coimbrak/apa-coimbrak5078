import java.awt.Graphics;
public class Score{

	private int leftScore;
	private int rightScore;

	public Score(){
		leftScore = 0;
		rightScore = 0;
	}

	public void incLeftScore(){
		leftScore++;
	}

	public void incRightScore(){
		rightScore++;
	}

	public void drawLeft(Graphics window){
//		window.clearRect(330,400,20,20);
		window.drawString("Left Score: " + leftScore, 330, 400);
	}

	public void drawRight(Graphics window){
//		window.clearRect(330,430,300,300);
		window.drawString("Right Score: " + rightScore, 330, 430);
	}

}
