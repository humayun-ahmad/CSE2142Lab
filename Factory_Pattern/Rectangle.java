public class Rectangle implements Shape{

	private static Rectangle instance = new Rectangle();

	private Rectangle(){}

	public static Rectangle getInstance(){
		return instance;
	}

    public void draw(){
        System.out.println("This is the Rectangle");
    }

}
