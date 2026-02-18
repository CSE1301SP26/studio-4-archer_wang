package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shape = in.next();
		System.out.println(shape);
		int rColorValue = in.nextInt();
		int gColorValue = in.nextInt();
		int bColorValue = in.nextInt();
		StdDraw.setPenColor(rColorValue, gColorValue, bColorValue);
		boolean isFilled = in.nextBoolean();
		
		if(shape.equals("rectangle")){
			double xValue = in.nextDouble();
			double yValue = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if(isFilled){
				StdDraw.filledRectangle(xValue, yValue, halfWidth, halfHeight);
			} else{
				StdDraw.rectangle(xValue, yValue, halfWidth, halfHeight);
			}
		} else if(shape.equals("triangle")){
			double xOne = in.nextDouble();
			double yOne = in.nextDouble();
			double xTwo = in.nextDouble();
			double yTwo = in.nextDouble();
			double xThree = in.nextDouble();
			double yThree = in.nextDouble();
			double[] xCoords = {xOne, xTwo, xThree};
			double[] yCoords = {yOne, yTwo, yThree};
			if(isFilled){
				StdDraw.filledPolygon(xCoords, yCoords);
			} else{
				StdDraw.polygon(xCoords, yCoords);
			}
		} else if (shape.equals("ellipse")){
			double xValue = in.nextDouble();
			double yValue = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if(isFilled){
				StdDraw.filledEllipse(xValue, yValue, halfWidth, halfHeight);
			} else{
				StdDraw.ellipse(xValue, yValue, halfWidth, halfHeight);
			}
		}
		
	}
}
