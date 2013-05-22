package growing;

public class Growing {
	
	public static void growingImage(int w, int y, int x, int h) {
		System.out.println("Your entered values are: " + "\n" 
								+ "X-position: " + x + "\n"
								+ "Y-position: " + y + "\n"
								+ "Width: " + w + "\n" + "Height: " + h);
		System.out.println("Your starting values are: " + "\n"
								+ "X-position " + x + w/2 + "\n"
								+ "Y-position " + y + h/2 + "\n"
								+ "Width: 0" + "\n" + "Height: 0");
		System.out.println("Your ending point values are: " + "\n"
								+ "X-position " + x + "\n"
								+ "Y-position " + y + "\n"
								+ "Width: " + w + "\n" + "Height: " + h);
	}
	
	public static void percentageGrow(int w, int y, int x, int h, int percentage) {
		System.out.println("Your entered values are: " + "\n" 
				+ "X-position: " + x + "\n"
				+ "Y-position: " + y + "\n"
				+ "Width: " + w + "\n" + "Height: " + h);
		System.out.println("Your starting values are: " + "\n"
				+ "X-position " + x + "\n"
				+ "Y-position " + y + "\n"
				+ "Width: " + w + "\n" + "Height: " + h);
		System.out.println("Your ending point values are: " + "\n"
				+ "X-position " + x + "\n"
				+ "Y-position " + y + "\n"
				+ "Width: " + w * (percentage/100) + "\n" + "Height: " + h * (percentage/100));
	}
	
	public static void percentageShrink(int w, int y, int x, int h, int percentage) {
		System.out.println("Your entered values are: " + "\n" 
				+ "X-position: " + x + "\n"
				+ "Y-position: " + y + "\n"
				+ "Width: " + w + "\n" + "Height: " + h);
		System.out.println("Your starting values are: " + "\n"
				+ "X-position " + x + "\n"
				+ "Y-position " + y + "\n"
				+ "Width: " + w + "\n" + "Height: " + h);
		System.out.println("Your ending point values are: " + "\n"
				+ "X-position " + x + "\n"
				+ "Y-position " + y + "\n"
				+ "Width: " + w * (1 - (percentage/100)) + "\n" + "Height: " + h * (1 - (percentage/100)));
	}
}
