package java2023.day3.lectures;

public class Example {
	
	
	Example() {
		
		
	}
			
	public void setX (int y) {
		
		x = y;
	}
	

	public static void main(String[] args) {
		Example example = new Example();
		example.setX(0);
		
		String str = "Java";
		
		
		String str2 = "Java";
		
		
		String str3 = new String("Java");
		
		if (str.equals(str3)) {
			System.out.println("they are equal");
			
		}
		else {
			System.out.println("they are not equal");
		}
		
		
		
		

	}
	
	

	
	private double x = 1.0;

}
