package sample.main;

public class Cat {
	String color;
	String furLength;
	boolean declawed;
	
	Cat(String color, String furLength, boolean declawed){
		this.color = color;
		this.furLength = furLength;
		this.declawed = declawed;
		//System.out.println("Contructor created");
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFurLength() {
		return furLength;
	}

	public void setFurLength(String furLength) {
		this.furLength = furLength;
	}

	public boolean isDeclawed() {
		return declawed;
	}

	public void setDeclawed(boolean declawed) {
		this.declawed = declawed;
	}
	
	public String toString(){
		return "The cat in question has " + furLength + " "+ color + " fur and is " + "declawed."; 
	}
}
