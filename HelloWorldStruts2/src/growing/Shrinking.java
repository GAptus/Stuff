package resizing.calculator;

public class Shrinking {
	private Integer width;
	private int height;
	private Integer x;
	private Integer y;
	private Integer changedX;
	private Integer changedY;
	private Integer changedWidth;
	private Integer changedHeight;
	private Integer percentage;
	
	public String execute() {
		
		changedX = x;
		changedY = y;
		changedWidth = width*(percentage/100);
		changedHeight = height*(percentage/100);
		
		return "success";
	}
	
	public String getPercentage() {
		return percentage.toString();
	}
	
	public String getChangedX() {
		return changedX.toString();
	}
	
	public String getChangedY() {
		return changedY.toString();
	}
	
	public String getChangedWidth() {
		return changedWidth.toString();
	}
	
	public String getChangedHeight() {
		return changedHeight.toString();
	}
	
	public String getWidth() {	
		return width.toString();
	}

	public String getHeight() {
		return height + "";
	}

	public String getX() {
		return x.toString();
	}

	public String getY() {
		return y.toString();
	}
	
	public void setPercentage(String percentage) {
		this.percentage = Integer.parseInt(percentage);
	}

	public void setWidth(String width) {
		this.width = Integer.parseInt(width);
	}
	
	public void setHeight(String height) {
		this.height = Integer.parseInt(height);
	}
	
	public void setX(String x) {
		this.x = Integer.parseInt(x);
	}
	
	public void setY(String y) {
		this.y = Integer.parseInt(y);
	}
}
