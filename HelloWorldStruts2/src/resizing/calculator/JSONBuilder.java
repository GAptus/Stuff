package resizing.calculator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONBuilder {

	public static JSONObject buildContainer(JSONObject o) throws JSONException {
		JSONObject topContainer = new JSONObject();
		JSONArray actionsArray = new JSONArray();
		
		actionsArray.put(o);
		
		topContainer.put("actions", actionsArray);
		
		return topContainer;
	}
	
	public static JSONObject buildAction(int elementID, int x, int y, int width, int height, int duration, int delay) throws JSONException {
		JSONObject actionMeta = new JSONObject();

		actionMeta.put("type", "ANIMATE");
		actionMeta.put("element_id", elementID);
		actionMeta.put("exclude", "");
		actionMeta.put("x", x);
		actionMeta.put("y", y);
		actionMeta.put("w", width);
		actionMeta.put("h", height);
		actionMeta.put("left_clip", "");
		actionMeta.put("right_clip", "");
		actionMeta.put("top_clip", "");
		actionMeta.put("bottom_clip", "");
		actionMeta.put("opacity_to", "");
		actionMeta.put("delay", delay);
		actionMeta.put("duration", duration);
		actionMeta.put("direction", "NORMAL");
		actionMeta.put("count", "1");
		actionMeta.put("easing_function", "LINEAR");
		actionMeta.put("loop", "");
		
		return actionMeta;
	}
	
	public static JSONObject buildAction(int elementID, int x, int y, int width, int height, int duration, int delay, JSONObject o) throws JSONException {
		JSONObject actionMeta = new JSONObject();
		
		actionMeta.put("type", "ANIMATE");
		actionMeta.put("element_id", elementID);
		actionMeta.put("exclude", "");
		actionMeta.put("x", x);
		actionMeta.put("y", y);
		actionMeta.put("w", width);
		actionMeta.put("h", height);
		actionMeta.put("left_clip", "");
		actionMeta.put("right_clip", "");
		actionMeta.put("top_clip", "");
		actionMeta.put("bottom_clip", "");
		actionMeta.put("opacity_to", "");
		actionMeta.put("delay", delay);
		actionMeta.put("duration", duration);
		actionMeta.put("direction", "NORMAL");
		actionMeta.put("count", "1");
		actionMeta.put("easing_function", "LINEAR");
		actionMeta.put("loop", "");
		
		return actionMeta;
	}
	
	public static JSONObject buildAction(JSONObject container, JSONObject o) throws JSONException {
		JSONArray array = new JSONArray();
		
		array.put(o);
		
		container.put("actions", array);
		return container;
	}
}
