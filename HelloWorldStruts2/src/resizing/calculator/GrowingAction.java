package resizing.calculator;

public class GrowingAction {
	private Integer width;
	private int height;
	private Integer x;
	private Integer y;
	private Integer changedX;
	private Integer changedY;
	private Integer changedWidth;
	private Integer changedHeight;
	
	public String execute() throws Exception {
		
		changedX = x + width/2;
		changedY = y + height/2;
		changedWidth = 0;
		changedHeight = 0;
		
		return "success";
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
