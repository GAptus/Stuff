package resizing.calculator;

import java.text.DecimalFormat;

import org.json.JSONException;

public class ShrinkingAction {
	private Integer width;
	private Integer height;
	private Integer x;
	private Integer y;
	private Integer changedX;
	private Integer changedY;
	private Integer changedWidth;
	private Integer changedHeight;
	private Double percentage;
	private String meta;
	private Integer elementID;
	private Integer duration;
	private Integer delay;
	
	DecimalFormat formater = new DecimalFormat("#");
	
	public String execute() {
		
		doCalculations();
		
		try {
			meta = JSONBuilder.buildContainer(JSONBuilder.buildAction(elementID, changedX, changedY, changedWidth, changedHeight, duration, delay)).toString();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return "success";
	}
	
	public void doCalculations() {
		double temp = width*(1.0-(percentage/100));
		changedWidth = (int)temp;
		temp = height*(1-(percentage/100));
		changedHeight = (int)temp;
		temp = (x + ((width - changedWidth)/2));
		changedX = (int)temp;
		temp = (y + ((height - changedHeight) /2));
		changedY = (int)temp;
	}
	
	public String getMeta() {
		return meta;
	}
	
	public String getPercentage() {
		return formater.format(percentage).toString();
	}
	
	public String getX() {
		return x.toString();
	}
	
	public String getY() {
		return y.toString();
	}
	
	public String getWidth() {
		return width.toString();
	}
	
	public String getHeight() {
		return height.toString();
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
	
	public void setElementID(String elementID) {
		this.elementID = Integer.parseInt(elementID);
	}
	
	public void setDuration(String duration) {
		this.duration = Integer.parseInt(duration);
	}
	
	public void setDelay(String delay) {
		this.delay = Integer.parseInt(delay);
	}
}
