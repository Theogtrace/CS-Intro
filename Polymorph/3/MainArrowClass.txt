package assignment4;
import java.util.Scanner;
public class MainArrowClass {
	public static void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Size of the head?");
		int head = scan.nextInt();
		System.out.println("Size of the tail?");
		int tails = scan.nextInt();
		
        ShapeInterface arrowLeft = new LeftArrow();
        arrowLeft.drawHere();
        arrowLeft.tail(tails );
        arrowLeft.set(head);
        arrowLeft.setOffset(0);
        arrowLeft.drawAt(0);
		
		ShapeInterface arrowRight = new RightArrow();
		arrowRight.drawHere();
		arrowRight.tail(tails );
		arrowRight.set(head);
		arrowRight.setOffset(0);
		arrowRight.drawAt(0);
    }
}
