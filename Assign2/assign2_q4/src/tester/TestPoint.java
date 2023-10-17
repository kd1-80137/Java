package tester;

import com.app.geometry.Point2D;

public class TestPoint {
	public static void main(String[] args) {
		Point2D point= new Point2D();
		Point2D point2= new Point2D();
		double dist;
		
		point.acceptCord();
		point2.acceptCord();
		dist=point.calculateDist(point2);
		System.out.println("Distance= "+dist);
		
	}
}
