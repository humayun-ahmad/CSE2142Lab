

public class Circle implements Shape {
	private static Circle instance = new Circle();

	private Circle() {}

	public static Circle getInstance(){
		return instance;
	}

    public void draw(){
        System.out.println("This is the Circle draw");
    }
}
