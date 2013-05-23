package resizing.calculator;

import java.text.DecimalFormat;

public class ShrinkingAction {
	private Integer width;
	private int height;
	private Integer x;
	private Integer y;
	private Double changedX;
	private Double changedY;
	private Double changedWidth;
	private Double changedHeight;
	private Double percentage;
	
	DecimalFormat formater = new DecimalFormat("#");
	
	public String execute() {
		
		changedWidth = (double)width*(1.0-(percentage/100));
		changedHeight = (double)height*(1-(percentage/100));
		changedX = (x + ((width - changedWidth)/2));
		changedY = (y + ((height - changedHeight) /2));
		
		return "success";
	}
	
	public String getPercentage() {
		return formater.format(percentage).toString();
	}
	
	public String getChangedX() {
		return formater.format(changedX).toString();
	}
	
	public String getChangedY() {
		return formater.format(changedY).toString();
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
