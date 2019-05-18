public class Square implements Shape{
 	
	private static Square instance = new Square();

	private Square(){}

	public static Square getInstance(){
		return instance;
	}

    public void draw(){
        System.out.println("this is the Sauare");
    }
}
