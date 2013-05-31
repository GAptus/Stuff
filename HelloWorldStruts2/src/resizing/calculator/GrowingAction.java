package resizing.calculator;

import org.json.JSONException;
import com.opensymphony.xwork2.ActionSupport;

public class GrowingAction extends ActionSupport {
	private Integer width;
	private int height;
	private Integer x;
	private Integer y;
	private Integer changedX;
	private Integer changedY;
	private Integer changedWidth;
	private Integer changedHeight;
	private String meta;
	private Integer elementID;
	private Integer duration;
	private Integer delay;
	
	public String execute() throws Exception{
		
		doCalculations();

		System.out.println("help");
		
		try {
			meta = JSONBuilder.buildContainer(JSONBuilder.buildAction(elementID, x, y, width, height, duration, delay)).toString();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return "success";
	}
	
	public void doCalculations() {
		changedX = x + width/2;
		changedY = y + height/2;
		changedWidth = 0;
		changedHeight = 0;
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
	
	public String getMeta() {
		return meta;
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
