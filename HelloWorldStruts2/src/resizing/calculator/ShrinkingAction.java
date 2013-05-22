package resizing.calculator;

import java.text.DecimalFormat;

public class ShrinkingAction {
	private Integer width;
	private int height;
	private Integer x;
	private Integer y;
	private Integer changedX;
	private Integer changedY;
	private Double changedWidth;
	private Double changedHeight;
	private Double percentage;
	
	DecimalFormat formater = new DecimalFormat("#");
	
	public String execute() {
		
		changedX = x;
		changedY = y;
		changedWidth = (double)width*(1.0-(percentage/100));
		changedHeight = (double)height*(1-(percentage/100));
		
		return "success";
	}
	
	public String getPercentage() {
		return formater.format(percentage).toString();
	}
	
	public String getChangedX() {
		return changedX.toString();
	}
	
	public String getChangedY() {
		return changedY.toString();
	}
	
	public String getChangedWidth() {
		return formater.format(changedWidth).toString();
	}
	
	public String getChangedHeight() {
		return formater.format(changedHeight).toString();
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
		this.percentage = Double.parseDouble(percentage);
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
