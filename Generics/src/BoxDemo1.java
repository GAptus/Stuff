
public class BoxDemo1 {
	
	public static void main(String[] args) {
		//Only place integer objects into this box!
		Box integerBox = new Box();
		
		integerBox.add(new Integer(10));
		Integer someInteger = (Integer)integerBox.get();
		System.out.println(someInteger);
	}
}