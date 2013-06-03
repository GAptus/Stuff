package resizing.calculator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateMetaAction {
	
	private Integer elementID;
	private Integer x;
	private Integer y;
	private Integer width;
	private Integer height;
	
	private Integer changedX;
	private Integer changedY;
	private Integer changedWidth;
	private Integer changedHeight;
	
	private String resizingOptionTable1;
	private Double percentageTable1;
	private Integer delayTable1;
	private Integer durationTable1;
	private String ignoreTable1 = "";
	
	private String resizingOptionTable2;
	private Double percentageTable2;
	private Integer delayTable2;
	private Integer durationTable2;
	private String ignoreTable2 = "";
	
	private String resizingOptionTable3;
	private Double percentageTable3;
	private Integer delayTable3;
	private Integer durationTable3;
	private String ignoreTable3 = "";
	
	private Double percentageTable4;
	private Integer delayTable4;
	private Integer durationTable4;
	private String resizingOptionTable4;
	private String ignoreTable4 = "";
	
	private String meta;
	
	public String execute() {
		
		JSONObject table1JSON = new JSONObject();
		JSONObject table2JSON = new JSONObject();
		JSONObject table3JSON = new JSONObject();
		JSONObject table4JSON = new JSONObject();
		
		double tempX = 0;
		double tempY = 0;
		double tempWidth = 0;
		double tempHeight = 0;
		
			if (checkIfChecked(ignoreTable1)) {
				System.out.println("Gone into table 1");
				if (resizingOptionTable1.equals("growing")) {
					System.out.println("growing! table1");
					try {
						table1JSON = growObject(elementID, x, y, width, height, durationTable1, delayTable1, percentageTable1);
					}
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
				else if (resizingOptionTable1.equals("shrinking")) {
					System.out.println("shrinking! table1");
					try {
						if (percentageTable1 == 100) {
							table1JSON = JSONBuilder.buildAction(elementID, x, y, 0, 0, durationTable1, delayTable1);
						}
						else {
							table1JSON = shrinkObject(elementID, x, y, width, height, durationTable1, delayTable1, percentageTable1);
						}
					}
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
				else if (resizingOptionTable1.equals("GrowingFromZero")) {
					System.out.println("growing from zero! table1");
					changedWidth = 0;
					changedHeight = 0;
					changedX = x + (width/2);
					changedY = y + (height/2);
					
					try {
						table1JSON = growObjectFromZero(elementID, x, y, width, height, durationTable1, delayTable1, percentageTable1);
					} 
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
			}
			
			if (checkIfChecked(ignoreTable2)) {
				System.out.println("Gone into table 2");
				if (resizingOptionTable2.equals("growing")) {
					System.out.println("growing! table2");
					
					tempX = growObjectX(x, width, percentageTable1);
					tempY = growObjectY(y, height, percentageTable1);
					tempWidth = growObjectWidth(width, percentageTable1);
					tempHeight = growObjectHeight(height, percentageTable1);
					
					try {
						table2JSON = growObject(elementID, (int)tempX, (int)tempY, (int)tempWidth, (int)tempHeight, durationTable2, delayTable2, percentageTable2);
					}
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
				else if (resizingOptionTable2.equals("shrinking")) {
					System.out.println("Shrinking! table2");
					try {
						if (percentageTable2 == 100) {
							tempX = x;
							tempY = y;
							tempWidth = 0;
							tempHeight = 0;
							
							table2JSON = JSONBuilder.buildAction(elementID, (int)tempX, (int)tempY, 0, 0, durationTable2, delayTable2);
						}
						else {
							tempX = growObjectX(x, width, percentageTable1);
							tempY = growObjectY(y, height, percentageTable1);
							tempWidth = growObjectWidth(width, percentageTable1);
							tempHeight = growObjectHeight(height, percentageTable1);
							
							table2JSON = shrinkObject(elementID, (int)tempX, (int)tempY, (int)tempWidth, (int)tempHeight, durationTable2, delayTable2, percentageTable2);
						}
					}
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
				else if (resizingOptionTable2.equals("GrowingFromZero")) {
					System.out.println("growing from zero! table2");
					changedWidth = 0;
					changedHeight = 0;
					changedX = x + ((int)tempWidth/2);
					changedY = y + ((int)tempHeight/2);
					
					tempX = x;
					tempY = y;
					tempWidth = width;
					tempHeight = height;
					
					try {
						growObjectFromZero(elementID, (int)tempX, (int)tempY, (int)tempWidth, (int)tempHeight, durationTable2, delayTable2, percentageTable2);
					} 
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
			}
			
			if (checkIfChecked(ignoreTable3)) {
				System.out.println("Gone through 3");
				if (resizingOptionTable3.equals("growing")) {
					System.out.println("growing! table3");
					
					tempX = growObjectX((int)tempX, (int)tempWidth, percentageTable2);
					tempY = growObjectY((int)tempY, (int)tempHeight, percentageTable2);
					tempWidth = growObjectWidth((int)tempWidth, percentageTable2);
					tempHeight = growObjectHeight((int)tempHeight, percentageTable2);
					
					try {
						table3JSON = growObject(elementID, (int)tempX, (int)tempY, (int)tempWidth, (int)tempHeight, durationTable3, delayTable3, percentageTable3);
					}
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
				else if (resizingOptionTable3.equals("shrinking")) {
					System.out.println("Shrinking! table3");
					try {
						if (percentageTable3 == 100) {
							tempX = x;
							tempY = y;
							tempWidth = 0;
							tempHeight = 0;
							
							table3JSON = JSONBuilder.buildAction(elementID, (int)tempX, (int)tempY,	0, 0, durationTable3, delayTable3);
						}
						else {
							tempX = growObjectX(x, width, percentageTable1);
							tempY = growObjectY(y, height, percentageTable1);
							tempWidth = growObjectWidth(width, percentageTable1);
							tempHeight = growObjectHeight(height, percentageTable1);
							
							table3JSON = shrinkObject(elementID, (int)tempX, (int)tempY, (int)tempWidth, (int)tempHeight, durationTable3, delayTable3, percentageTable3);
						}
					}
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
				else if (resizingOptionTable3.equals("GrowingFromZero")) {
					System.out.println("growing from zero! table3");
					changedWidth = 0;
					changedHeight = 0;
					changedX = x + ((int)tempWidth/2);
					changedY = y + ((int)tempHeight/2);
					try {
						table3JSON = growObjectFromZero(elementID, (int)tempX, (int)tempY, (int)tempWidth, (int)tempHeight, durationTable3, delayTable3, percentageTable3);
					} 
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
			}
			
			if (checkIfChecked(ignoreTable4)) {
				System.out.println("Gone through 4");
				if (resizingOptionTable4.equals("growing")) {
					System.out.println("growing! table4");
					
					tempX = growObjectX((int)tempX, (int)tempWidth, percentageTable2);
					tempY = growObjectY((int)tempY, (int)tempHeight, percentageTable2);
					tempWidth = growObjectWidth((int)tempWidth, percentageTable2);
					tempHeight = growObjectHeight((int)tempHeight, percentageTable2);
					
					try {
						table4JSON = growObject(elementID, (int)tempX, (int)tempY, (int)tempWidth, (int)tempHeight, durationTable4, delayTable4, percentageTable4);
					}
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
				else if (resizingOptionTable4.equals("shrinking")) {
					System.out.println("Shrinking! table4");
					try {
						if (percentageTable4 == 100) {
							tempX = x;
							tempY = y;
							tempWidth = 0;
							tempHeight = 0;
							
							table4JSON = JSONBuilder.buildAction(elementID, (int)tempX, (int)tempY, 0, 0, durationTable4, delayTable4);
						}
						else {
							tempX = growObjectX(x, width, percentageTable1);
							tempY = growObjectY(y, height, percentageTable1);
							tempWidth = growObjectWidth(width, percentageTable1);
							tempHeight = growObjectHeight(height, percentageTable1);
							
							table4JSON = shrinkObject(elementID, (int)tempX, (int)tempY, (int)tempWidth, (int)tempHeight, durationTable4, delayTable4, percentageTable4);
						}
					}
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
				else if (resizingOptionTable4.equals("GrowingFromZero")) {
					System.out.println("growing from zero! table4");
					changedWidth = 0;
					changedHeight = 0;
					changedX = x + ((int)tempWidth/2);
					changedY = y + ((int)tempHeight/2);
					try {
						table4JSON = growObjectFromZero(elementID, (int)tempX, (int)tempY, (int)tempWidth, (int)tempHeight, durationTable4, delayTable4, percentageTable4);
					} 
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
			}
			
			JSONObject temp = new JSONObject();
			
			if (!table1JSON.equals("")) {
				if (!table4JSON.equals("")) {
					if (!table3JSON.equals("")) {
						try {
							if (!table2JSON.equals("")) {
								if (!table1JSON.equals("")) {
									temp = JSONBuilder.buildContainer(JSONBuilder.buildAction(table1JSON
															, JSONBuilder.buildAction(table2JSON
															, JSONBuilder.buildAction(table3JSON
															, table4JSON))));
								}
							}
						}
						catch (JSONException e) {
							e.printStackTrace();
						}
				}
					
				else if (!table3JSON.equals("")) {
					if (!table2JSON.equals("")) {
						if (!table1JSON.equals("")) {
							try {
								temp = JSONBuilder.buildContainer(JSONBuilder.buildAction(table1JSON
														, JSONBuilder.buildAction(table2JSON, table3JSON)));
							}
							catch (JSONException e) {
								e.printStackTrace();
							}
						}
					}
				}
				
				else if (!table2JSON.equals("")) {
					if (!table1JSON.equals("")) {
						try {
							temp = JSONBuilder.buildContainer(JSONBuilder.buildAction(table1JSON, table2JSON));
						}
						catch (JSONException e) {
							e.printStackTrace();
						}
					}
				}
				
				else if (!table1JSON.equals("")) {
					try {
						JSONArray array = new JSONArray();
						table1JSON.put("actions", array);
						temp = JSONBuilder.buildContainer(table1JSON);
					}
					catch (JSONException e) {
						e.printStackTrace();
					}
				}
			}
		}
			
		meta = temp.toString();
		
		return "success";
	}
	
	public boolean checkIfChecked(String checked) {
		if (checked.equals("checked")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public JSONObject growObject(int elementID, int x, int y, int width, int height, int duration, int delay, double percentage) throws JSONException { 
		
		return JSONBuilder.buildAction(elementID, (int)growObjectX(x, width, percentage)
												, (int)growObjectY(y, height, percentage)
												, (int)growObjectWidth(width, percentage)
												, (int)growObjectHeight(height, percentage), duration, delay);
	}
	
	public double growObjectWidth(int width, double percentage) {
		return width * (1  + (percentage / 100));
	}
	
	public double growObjectHeight(int height, double percentage) {
		return height * (1 + (percentage / 100));
	}
	
	public double growObjectX(int x, int width, double percentage) {
		return x - (((int)growObjectWidth(width, percentage) - width) / 2);
	}
	
	public double growObjectY(int y, int height, double percentage) {
		return y - (((int)growObjectHeight(height, percentage) - height) / 2);
	}
	
	public JSONObject shrinkObject(int elementID, int x, int y, int width, int height, int duration, int delay, double percentage) throws JSONException {
		
		return JSONBuilder.buildAction(elementID, (int)shrinkObjectX(x, width, percentage)
												, (int)shrinkObjectY(y, height, percentage)
												, (int)shrinkObjectWidth(width, percentage)
												, (int)shrinkObjectHeight(height, percentage), duration, delay);	
	}
	
	public double shrinkObjectWidth(int width, double percentage) {
		return width * (1 - (percentage / 100));
	}
	
	public double shrinkObjectHeight(int height, double percentage) {
		return height * (1 - (percentage / 100));
	}
	
	public double shrinkObjectX(int x, int width, double percentage) {
		return x + ((width - (int)shrinkObjectWidth(width, percentage)) / 2);
	}
	
	public double shrinkObjectY(int y, int height, double percentage) {
		return y + ((height - (int)shrinkObjectHeight(height, percentage)) / 2);
	}
	
	public JSONObject growObjectFromZero(int elementID, int x, int y, int width, int height, int duration, int delay, double percentage) throws JSONException {
		return JSONBuilder.buildAction(elementID, x, y, width, height, duration, delay);
	}
	
	public String getChangedHeight() {
		return height.toString();
	}
	
	public String getChangedWidth() {
		return width.toString();
	}
	
	public String getChangedY() {
		return y.toString();
	}
	
	public String getChangedX() {
		return x.toString();
	}
	
	public String getMeta() {
		return meta;
	}
	
	public void setElementID(String elementID) {
		this.elementID = Integer.parseInt(elementID);
	}
	
	public void setX(String x) {
		this.x = Integer.parseInt(x);
	}
	
	public void setY(String y) {
		this.y = Integer.parseInt(y);
	}
	
	public void setWidth(String width) {
		this.width = Integer.parseInt(width);
	}
	
	public void setHeight(String height) {
		this.height = Integer.parseInt(height);
	}

	
	public void setPercentageTable1(String percentageTable1) {
		this.percentageTable1 = Double.parseDouble(percentageTable1);
	}
	
	public void setPercentageTable2(String percentageTable2) {
		this.percentageTable2 = Double.parseDouble(percentageTable2);
	}
	
	public void setPercentageTable3(String percentageTable3) {
		this.percentageTable3 = Double.parseDouble(percentageTable3);
	}
	
	public void setPercentageTable4(String percentageTable4) {
		this.percentageTable4 = Double.parseDouble(percentageTable4);
	}

	public void setResizingOptionTable1(String resizingOptionTable1) {
		this.resizingOptionTable1 = resizingOptionTable1;
	}

	public void setResizingOptionTable2(String resizingOptionTable2) {
		this.resizingOptionTable2 = resizingOptionTable2;
	}

	public void setResizingOptionTable3(String resizingOptionTable3) {
		this.resizingOptionTable3 = resizingOptionTable3;
	}

	public void setResizingOptionTable4(String resizingOptionTable4) {
		this.resizingOptionTable4 = resizingOptionTable4;
	}
		
	public void setIgnoreTable1(String ignoreTable1) {
		this.ignoreTable1 = ignoreTable1;
	}

	public void setIgnoreTable2(String ignoreTable2) {
		this.ignoreTable2 = ignoreTable2;
	}

	public void setIgnoreTable3(String ignoreTable3) {
		this.ignoreTable3 = ignoreTable3;
	}

	public void setIgnoreTable4(String ignoreTable4) {
		this.ignoreTable4 = ignoreTable4;
	}
	
	public void setDelayTable1(String delayTable1) {
		this.delayTable1 = Integer.parseInt(delayTable1);
	}
	
	public void setDelayTable2(String delayTable2) {
		this.delayTable2 = Integer.parseInt(delayTable2);
	}
	
	public void setDelayTable3(String delayTable3) {
		this.delayTable3 = Integer.parseInt(delayTable3);
	}
	
	public void setDelayTable4(String delayTable4) {
		this.delayTable4 = Integer.parseInt(delayTable4);
	}
	
	public void setDurationTable1(String durationTable1) {
		this.durationTable1 = Integer.parseInt(durationTable1);
	}
	
	public void setDurationTable2(String durationTable2) {
		this.durationTable2 = Integer.parseInt(durationTable2);
	}
	
	public void setDurationTable3(String durationTable3) {
		this.durationTable3 = Integer.parseInt(durationTable3);
	}
	
	public void setDurationTable4(String durationTable4) {
		this.durationTable4 = Integer.parseInt(durationTable4);
	}
}
